package ru.itpark.bean.annotation;

public class FriendlyWaiterImpl implements Waiter {
    public void giveMenu() {
        System.out.println("Добрый день! Вот ваше меню.");
    }

    public void giveFood() {
        System.out.println("Ваша еда, сэр!");
    }

    public void takePlates() {
        System.out.println("Разрешите забрать посуду.");
    }
}
