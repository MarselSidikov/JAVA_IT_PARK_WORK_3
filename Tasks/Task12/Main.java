public class Main {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        Circle square = new Circle(5);
        Circle square1 = new Circle(10);
        Circle square2 = new Circle(90);
        Circle square3 = new Circle(5);
        Rectangle rectangle = new Rectangle(10, 15);
        Rectangle rectangle1 = new Rectangle(14, 20);
        Rectangle rectangle2 = new Rectangle(14, 20);

        list.add(square);
        list.add(square1);
        list.add(rectangle);
        list.add(rectangle1);

        System.out.println(list.find(square3));
    }
}
