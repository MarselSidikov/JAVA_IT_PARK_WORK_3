package ru.itpark;

public class Main {

    public static void main(String[] args) {
      HashMap<String, Integer> map = new HashMap<>();
      map.put("Марсель", 1);
      map.put("Антон", 2);
      map.put("Дмитрий", 3);
      map.put("Лейсан", 5);
      map.put("Закир", 4);
      map.put("Артем", 6);
      map.put("Камиль", 7);
      map.put("Нияз", 8);
      map.put("Илья", 9);
      map.put("Лейсан", 11);

      System.out.println(map.get("Лейсан"));
      System.out.println(map.get("Закир"));
      System.out.println(map.get("Марсель"));
      System.out.println(map.get("Гавриил"));
    }
}
