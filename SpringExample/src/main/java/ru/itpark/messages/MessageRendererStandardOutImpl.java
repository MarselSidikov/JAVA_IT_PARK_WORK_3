package ru.itpark.messages;

public class MessageRendererStandardOutImpl implements MessageRenderer {

  private Message message;

  public MessageRendererStandardOutImpl(Message message) {
    this.message = message;
  }

  public void render() {
    System.out.println(message.getText());
  }
}
