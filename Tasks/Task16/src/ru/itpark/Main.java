package ru.itpark;

public class Main {

    public static void main(String[] args) {
	  TextViewer textViewer = new TextViewer();

	  textViewer.setText("Marsel, 1994");
	  textViewer.addTask(new DigitsTask());
	  textViewer.addTask(new LettersTask());
	  textViewer.process();
    }
}
