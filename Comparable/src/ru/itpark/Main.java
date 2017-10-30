package ru.itpark;

public class Main {

    public static void main(String[] args) {
      Human h1 = new Human("Марсель", 23);
      Human h2 = new Human("Илья", 23);
      Human h3 = new Human("Дмитрий", 29);
      Human h4 = new Human("Артем", 30);
      Human h5 = new Human("Антон", 29);
      Human h6 = new Human("Иван", 23);

      ArrayList<Human> humans = new ArrayList<>();
      humans.add(h1);
      humans.add(h2);
      humans.add(h3);
      humans.add(h4);
      humans.add(h5);
      humans.add(h6);

      Lists.bubbleSort(humans);

      for (Human human : humans) {
        System.out.println(human.getName() + " " + human.getAge());
      }

      Animal animal = new Animal("Григорий", "Питон");
      Animal animal2 = new Animal("Игнат", "Попугай");

      ArrayList<Animal> animals = new ArrayList<>();
      animals.add(animal);
      animals.add(animal2);

      // Lists.bubbleSort(animals);
    }
}
