package day9.Task2;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius,String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double area() {
        double circleArea = Math.PI * Math.pow(this.radius, 2);
        return circleArea;
    }

    @Override
    public double perimeter() {
        double circlePerimeter = 2 * Math.PI * this.radius;
        return circlePerimeter;
    }
}
