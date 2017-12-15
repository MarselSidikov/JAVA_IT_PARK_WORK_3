package ru.itpark;

public class MessageRendererErrorOutImpl implements MessageRenderer {
  private Message message;

  public MessageRendererErrorOutImpl(Message message) {
    this.message = message;
  }

  public void render() {
    System.err.println(message.getText());
  }
}
