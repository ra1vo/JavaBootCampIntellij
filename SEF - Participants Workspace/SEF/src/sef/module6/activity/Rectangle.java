package sef.module6.activity;

public class Rectangle extends Shape{

    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }


    @Override
    double calculateArea() {
        return length * breadth;
    }

    @Override
    double calculatePerimeter() {
        return 2 * (length * breadth);
    }
}
