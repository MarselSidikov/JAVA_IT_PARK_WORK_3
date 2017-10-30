package ru.itpark;

public class Main {

    public static void main(String[] args) {
      Human marsel = new Human("Marsel", 23);
      Human dmitry = new Human("Dmitry", 29);

      Animal cat = new Animal("Мурка","Дворняга");
      Animal superCat = new Animal("Джозефина","Перс");

	  ArrayList<Human> humansList = new ArrayList<>();
	  humansList.add(marsel);
	  humansList.add(dmitry);

	  Human marselFromList = (Human)humansList.get(0);

	  ArrayList<Animal> animalsList = new ArrayList<>();
	  // animalsList.add(marsel);
	  animalsList.add(cat);
	  animalsList.add(superCat);

	  for (Animal animal : animalsList) {
        System.out.println(animal.getAlias());
      }

      java.util.ArrayList
    }
}
