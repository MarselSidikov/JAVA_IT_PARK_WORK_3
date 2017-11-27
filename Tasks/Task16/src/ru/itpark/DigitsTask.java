package ru.itpark;

public class DigitsTask extends AbstractTextViewerTask {

  @Override
  public void run() {
    char letter[] = text.toCharArray();
    for (int i = 0; i < letter.length; i++) {
      if (letter[i] >= '0' && letter[i] <= '9') {
        System.out.println(letter[i]);
      }
    }
  }
}
