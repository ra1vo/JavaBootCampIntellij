package sef.module6.activity;

public class Circle extends Shape{

    private double radius;
    private final double pi = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return pi * (radius * radius);
    }

    @Override
    double calculatePerimeter() {
        return 2 * pi * radius;
    }
}
