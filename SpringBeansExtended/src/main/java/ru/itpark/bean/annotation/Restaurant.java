package ru.itpark.bean.annotation;

public class Restaurant {
    private Waiter waiter;

    public void welcome() {
        waiter.giveMenu();
    }

    public Waiter getWaiter() {
        return waiter;
    }

    public void setWaiter(Waiter waiter) {
        this.waiter = waiter;
    }
}
