package ru.itpark;

import java.lang.reflect.Field;
import java.util.Scanner;

public class MainReflectionUsage {

  private static final String PACKAGE_NAME = "ru.itpark.figures";
  public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
    Scanner scanner = new Scanner(System.in);

    String className = scanner.next();

    className = PACKAGE_NAME + "." + className;

    Class aClass = Class.forName(className);

    Object anObject = aClass.newInstance();

    Field fields[] = aClass.getDeclaredFields();

    for (Field field : fields) {
      System.out.println("Введите значение поля:");
      System.out.println(field.getType() + " " + field.getName());
      Object fieldValue;

      switch (field.getType().getName()) {
        case "int": fieldValue = scanner.nextInt(); break;
        case "java.lang.String": fieldValue = scanner.next(); break;
        default: throw new IllegalArgumentException("Не поддерживаемый тип");
      }

      field.setAccessible(true);
      field.set(anObject, fieldValue);
    }

    System.out.println(anObject);
  }
}
