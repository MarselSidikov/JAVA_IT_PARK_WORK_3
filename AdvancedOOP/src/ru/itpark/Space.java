package ru.itpark;

public class Space {
    public void moveAll(double x, double y, double z, Movable ... movables) {
        for (int i = 0; i < movables.length; i++) {
            movables[i].move(x, y, z);
        }
    }

    public void scaleAll(double value, Scalable ... scalables) {
        for (int i = 0; i < scalables.length; i++) {
            scalables[i].scale(value);
        }
    }
}
