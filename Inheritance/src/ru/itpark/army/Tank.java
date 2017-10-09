package ru.itpark.army;

public class Tank extends WeaponTransport {
    protected int bulletCount;

    public Tank(int bulletCount) {
        this.bulletCount = bulletCount;
    }

    public void fire() {
        this.bulletCount--;
        System.out.println("Tank is firing!");
    }
}
