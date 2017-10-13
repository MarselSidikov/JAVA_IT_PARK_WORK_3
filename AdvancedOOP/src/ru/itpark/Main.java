package ru.itpark;

public class Main {

    public static void main(String[] args) {
        Box box = new Box(1, 2, 3, 4, 5, 6);
        Sphere sphere = new Sphere(1,2,3,4);
        Point point = new Point(1,2,3);

        Space space = new Space();
        // Movable movables[] = {box, sphere};
        space.moveAll(1,2,3, box, sphere);
        space.scaleAll(10, box, sphere);

        // ShapeInSpace shapeInSpace = new ShapeInSpace(1,2,3);
    }
}
