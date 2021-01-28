package day9.Task2;

public class Rectangle extends Figure {
    private double width;
    private double height;

    public Rectangle(double width, double height,String color) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        double rectangleArea = this.height * this.width;
        return rectangleArea;
    }

    @Override
    public double perimeter() {
        double rectanglePerimeter = 2*this.width+2*this.height;
        return rectanglePerimeter;
    }
}
