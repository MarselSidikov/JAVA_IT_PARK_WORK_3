public class Rectangle {
    private int height;
    private int width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public boolean equals(Object object) {
        if (object == null || !(object instanceof Rectangle)) {
            return false;
        }

        if (this == object) {
            return true;
        }

        Rectangle that = (Rectangle) object;
        return this.height == that.height &&
                this.width == that.width;
    }

}
