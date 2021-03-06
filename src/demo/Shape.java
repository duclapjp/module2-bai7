package demo;

public abstract class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public Shape() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double calHalfPerimeter(){
        return 0;
    }
    public abstract double calArea();
    public abstract double calPerimeter();
}
