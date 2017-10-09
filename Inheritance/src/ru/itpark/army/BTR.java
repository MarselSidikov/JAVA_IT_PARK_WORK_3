package ru.itpark.army;

public class BTR extends WeaponTransport {
    private int bulletsCount;

    public BTR(int bulletsCount) {
        this.bulletsCount = bulletsCount;
    }

    public void fire() {
        this.bulletsCount = this.bulletsCount - 50;
        System.out.println("BTR is FIRING!!!!");
    }
}
