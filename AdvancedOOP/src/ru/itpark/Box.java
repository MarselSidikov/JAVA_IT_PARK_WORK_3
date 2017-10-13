package ru.itpark;

public class Box extends ShapeInSpace implements Scalable, Movable {
    private double length;
    private double height;
    private double width;

    public Box(double x, double y, double z, double length, double height, double width) {
        super(x, y, z);
        if (length > 0) {
            this.length = length;
        } else this.length = 1;
        if (height > 0) {
            this.height = height;
        } else this.height = 1;
        if (width > 0) {
            this.width = width;
        } else this.width = 1;
    }

    public double getLength() {
        return length;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public void scale(double value) {
        this.width = this.width * value;
        this.length = this.length * value;
        this.height = this.height * value;
    }

    @Override
    public void move(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
}
