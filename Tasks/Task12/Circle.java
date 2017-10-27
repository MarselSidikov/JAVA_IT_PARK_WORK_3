public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public boolean equals(Object object) {
        if (object == null || !(object instanceof Circle)) {
            return false;
        }

        if (this == object) {
            return true;
        }

        Circle that = (Circle) object;
        return this.radius == that.radius;
    }
}
