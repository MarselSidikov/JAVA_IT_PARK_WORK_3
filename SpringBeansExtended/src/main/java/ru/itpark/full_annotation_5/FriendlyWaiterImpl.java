package ru.itpark.full_annotation_5;

import org.springframework.stereotype.Component;

@Component
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
