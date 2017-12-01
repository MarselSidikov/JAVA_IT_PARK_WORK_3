package ru.itpark;

public class MessageErrorOutImpl implements MessageRenderer {
  private Message message;

  public MessageErrorOutImpl(Message message) {
    this.message = message;
  }

  public void render() {
    System.err.println(message.getText());
  }
}
