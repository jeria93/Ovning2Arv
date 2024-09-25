//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(10.2, 4.2);
        System.out.println(rectangle.getArea());
        Triangle triangle = new Triangle(5.99,10.12);
        System.out.println(triangle.getArea());

        Shape triangle1 = new Triangle(5.99,10.12);
        System.out.println(triangle1.getArea());

    }
}