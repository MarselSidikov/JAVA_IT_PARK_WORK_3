package ru.itpark;

public class MainComponentsFactoryImpl {
  public static void main(String[] args) {
    ComponentsFactory factory = new ComponentsFactory();
    Message message = factory.getMessageComponent();
    System.out.println(message.getText());
  }
}
