package ru.itpark;

public class Point extends ShapeInSpace implements Movable{
    public Point(double x, double y, double z) {
        super(x, y, z);
    }

    @Override
    public void move(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
}
