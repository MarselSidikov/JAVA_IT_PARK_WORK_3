package ru.itpark;

public class MessageByeImpl implements Message {
  private String text;

  public MessageByeImpl(String text) {
    this.text = "Bye, " + text;
  }

  public String getText() {
    return text;
  }
}
