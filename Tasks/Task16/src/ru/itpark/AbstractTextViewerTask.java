package ru.itpark;

public abstract class AbstractTextViewerTask implements TextViewerTask {

  protected String text;

  @Override
  public void setText(String text) {
    this.text = text;
  }
}
