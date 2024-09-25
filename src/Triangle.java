public class Triangle extends Shape {

    public Triangle(double width, double height) {
        super(width, height);
    }

    @Override
    public double getArea() {
        return (width * height) / 2;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}

