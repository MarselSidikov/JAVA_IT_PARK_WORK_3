package ru.itpark;

public class TextViewer {
  private TextViewerTask tasks[] = new TextViewerTask[10];

  private int count = 0;
  private String text;

  public void setText(String text) {
    this.text = text;
  }

  public void addTask(TextViewerTask task) {
    if (text == null) {
      throw new IllegalArgumentException("Text not set");
    }
    task.setText(text);
    tasks[count] = task;
    count++;
  }

  public void process() {
    for (int i = 0; i < tasks.length; i++) {
      Thread runnableThread = new Thread(tasks[i]);
      runnableThread.start();
    }
  }
}
