package ru.itpark;

public class MessageHelloImpl implements Message {
  private String text;

  public MessageHelloImpl(String text) {
    this.text = "Hello, " + text;
  }

  public String getText() {
    return text;
  }
}
