package ru.itpark;

public class HumanComparatorByAgeImpl implements HumanComparator {
    @Override
    public int compare(Human a, Human b) {
        return a.getAge() - b.getAge();
    }
}
