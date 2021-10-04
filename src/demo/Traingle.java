package demo;

public class Traingle  extends Shape{
    private double side1;
    private double side2;
    private double side3;

    public Traingle() {
    }

    public Traingle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }
    @Override
    public  double calHalfPerimeter(){
        return (side1+side2+side3)/2;
    }
    @Override
    public double calArea() {
        double p = calHalfPerimeter();
        double area = Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
        return area;
    }

    @Override
    public double calPerimeter() {
        return 2*calHalfPerimeter();
    }
}
