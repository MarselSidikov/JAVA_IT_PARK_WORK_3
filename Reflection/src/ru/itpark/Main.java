package ru.itpark;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {

  public static void main(String[] args) {
    Class<Human> humanClass = Human.class;

    for (Field field : humanClass.getFields()) {
      System.out.println(field);
    }

    Human human = new Human("Marsel", 23, 185);
    human.age = 23;
    human.name = "Marsel";

    try {
      Field nameField = humanClass.getField("name");
      nameField.set(human, "Илья");

      Field heightField = humanClass.getDeclaredField("height");
      heightField.setAccessible(true);
      heightField.set(human, 186);

      System.out.println(human.name);
      System.out.println(human.getHeight());

      Method goMethod = humanClass.getMethod("go");
      goMethod.invoke(human);

      Method anotherGoMethod = humanClass.getMethod("go", Integer.TYPE);
      anotherGoMethod.invoke(human, 33);

      Human anotherHuman = humanClass.newInstance();

      Constructor<Human> humanConstructor = humanClass.getConstructor(String.class, Integer.TYPE, Integer.TYPE);

      Human againAnotherHuman = humanConstructor.newInstance("Закир", 28, 186);
      System.out.println(againAnotherHuman.name);
    } catch (ReflectiveOperationException e) {
      throw new IllegalArgumentException(e);
    }
  }
}
