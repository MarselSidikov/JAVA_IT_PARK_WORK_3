package ru.itpark.army;

public class LazerTank extends Tank {
    private int powerValue;

    public LazerTank(int bulletCount, int powerValue) {
        super(bulletCount);
        this.powerValue = powerValue;
    }

    public void fire() {
        System.out.println("LazerTank is firing");
        bulletCount = bulletCount - powerValue;
    }
}
