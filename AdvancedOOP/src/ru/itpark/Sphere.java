package ru.itpark;

public class Sphere extends ShapeInSpace implements Scalable, Movable {
    private double radius;

    public Sphere(double x, double y, double z, double radius) {
        super(x, y, z);
        if (radius > 0) {
            this.radius = radius;
        } else this.radius = 1;
    }

    public double getRadius() {
        return radius;
    }

    public void scale(double value) {
        this.radius = this.radius * value;
    }

    @Override
    public void move(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
}
