package demo;

public class Circle  extends Shape{
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calArea() {
        return 3.14*radius*radius;
    }

    @Override
    public double calPerimeter() {
        return 3.14*2*radius;
    }
}
