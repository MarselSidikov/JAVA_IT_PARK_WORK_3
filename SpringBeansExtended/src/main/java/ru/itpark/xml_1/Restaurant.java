package ru.itpark.xml_1;

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
