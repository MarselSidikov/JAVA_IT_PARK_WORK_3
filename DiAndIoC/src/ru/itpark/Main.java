package ru.itpark;

public class Main {

    public static void main(String[] args) {
	  Message messageBye = new MessageByeImpl("Марсель");
	  Message messageHello = new MessageHelloImpl("Закир");

	  MessageRenderer serrRenderer = new MessageRendererErrorOutImpl(messageHello);
	  MessageRenderer soutRenderer = new MessageRendererStandardOutImpl(messageBye);

	  serrRenderer.render();
	  soutRenderer.render();

    }
}
