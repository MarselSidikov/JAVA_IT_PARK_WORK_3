package ru.itpark;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {

  public static void main(String[] args) {
    Class<Human> humanClass = Human.class;

    for (Field field : humanClass.getFields()) {
      System.out.println(field);
    }

    Human human = new Human();
    human.age = 23;
    human.name = "Marsel";

    try {
      Field nameField = humanClass.getField("name");
      nameField.set(human, "Илья");

      Field heightField = humanClass.getDeclaredField("height");
      heightField.setAccessible(true);
      heightField.set(human, 185);

      System.out.println(human.name);
      System.out.println(human.getHeight());

      Method goMethod = humanClass.getMethod("go");
      goMethod.invoke(human);

      Method anotherGoMethod = humanClass.getMethod("go", Integer.TYPE);
      anotherGoMethod.invoke(human, 33);
    } catch (ReflectiveOperationException e) {
      throw new IllegalArgumentException(e);
    }
  }
}
