package ru.itpark;

public class ArrayOfValuesMap<V> {
  private Object values[];

  public ArrayOfValuesMap() {
    this.values = new Object[10];
  }

  public void put(String key, V value) {
    // key -> целое число
  }

  public int hash(String key) {
    int result = 0;
    char keyAsCharArray[] = key.toCharArray();
    // H E L L O
    // 72 69 76 76 79

    // 0 + 72
    // 72 * 31 + 69
    // (72 * 31 + 69) * 31 + 76
    // ((72 * 31 + 69) * 31 + 76) * 31 + 76
    // (((72 * 31 + 69) * 31 + 76) * 31 + 76) * 31 + 79

    // 72 * 31 * 31 * 31 * 31 + 69 * 31 * 31 * 31
    // + 76 * 31 * 31 + 76 * 31 + 79 * 1 ->
    // 72 * 31^4 + 69 * 31 ^ 3 + 76 * 31 ^ 2 + 76 * 31 ^ 1 + 79 * 31 ^ 0
    for (int i = 0; i < key.length(); i++) {
      result =  result * 31 + keyAsCharArray[i];
    }

    return result;
  }
}
