package ru.itpark;

public class HumanComparatorByHeightImpl implements HumanComparator {
    @Override
    public int compare(Human a, Human b) {
        return a.getHeight() - b.getHeight();
    }
}
