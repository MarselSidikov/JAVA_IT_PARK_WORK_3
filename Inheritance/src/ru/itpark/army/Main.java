package ru.itpark.army;

public class Main {
    public static void main(String[] args) {
        Tank tank = new Tank(10);
        LazerTank lazerTank = new LazerTank(10, 2);
        BTR btr = new BTR(400);

        WeaponTransport transports[] = {tank, lazerTank, btr};

        for (int i = 0; i < transports.length; i++) {
            transports[i].fire();
        }
    }
}
