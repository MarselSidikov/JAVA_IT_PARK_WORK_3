package ru.itpark;

public interface TextViewerTask extends Runnable {
  void setText(String text);
}
