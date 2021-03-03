package sef.module6.activity;

public class AbstractionActivity {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 6);
        rectangle.setColor("Red");

        Circle circle = new Circle(4);
        circle.setColor("White");

        System.out.println("rectangle----");
        print(rectangle);
        System.out.println("circle----");
        print(circle);
    }

    private static void print(Shape shape){
        System.out.println("area: " + shape.calculateArea());
        System.out.println("perimeter: " + shape.calculatePerimeter());
        System.out.println("color: " + shape.getColor());
    }
}
