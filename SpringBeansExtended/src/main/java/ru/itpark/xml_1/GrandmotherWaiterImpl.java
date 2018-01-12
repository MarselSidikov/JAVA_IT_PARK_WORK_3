package ru.itpark.xml_1;

public class GrandmotherWaiterImpl implements Waiter {
    public void giveMenu() {
        System.out.println("Я вас не слышу.");
    }

    public void giveFood() {
        System.out.println("Я вас не вижу.");
    }

    public void takePlates() {
        System.out.println("Посуду за собой убрал!");
    }
}
