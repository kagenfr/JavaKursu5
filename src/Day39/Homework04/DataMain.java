package Day39.Homework04;

public class DataMain {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(5);
        System.out.println("Circle area: " + circle.getArea());

        Rectangle rectangle = new Rectangle();
        rectangle.setLength(14);
        rectangle.setWidth(7);
        System.out.println("Rectangle area: " + rectangle.getArea());
    }
}
