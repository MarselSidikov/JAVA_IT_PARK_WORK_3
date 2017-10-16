package ru.itpark;

public class Main {

    public static void main(String[] args) {
        Human marsel = new Human("Марсель",23, 185, 63);
        Human ilya = new Human("Илья",23, 184, 73);
        Human artyom = new Human("Артем",30, 183, 80);
        Human ivan = new Human("Иван",23, 186, 86);
        Human dima = new Human("Дмитрий",29, 180, 68);
        Human anton = new Human("Антон",29, 194, 92);

        Human humans[] = {marsel, ilya, artyom, ivan, dima, anton};

        HumanComparator comparator = new HumanComparatorByHeightImpl();
        HumanSorter sorter = new HumanSorterSelectionImpl();

        sorter.sort(comparator, humans);

        for (Human human : humans) {
            System.out.println(human);
        }
    }
}
