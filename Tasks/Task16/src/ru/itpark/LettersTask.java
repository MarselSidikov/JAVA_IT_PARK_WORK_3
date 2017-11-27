package ru.itpark;

public class LettersTask extends AbstractTextViewerTask {

  @Override
  public void run() {
    char letter[] = text.toCharArray();
    for (int i = 0; i < letter.length; i++) {
      if (letter[i] >= 'A' && letter[i] <= 'Z'
          || letter[i] >= 'a' && letter[i] <= 'z') {
        System.out.println(letter[i]);
      }
    }
  }
}
