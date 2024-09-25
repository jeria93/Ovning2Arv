public class Shape implements Calculations {
    protected double width;
    protected double height;

    public Shape(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }


    @Override
    public double getArea() {
        return width * height;
    }
}


