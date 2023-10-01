import java.util.Scanner;

interface Shape {
    double getArea();

    double getPerimeter();
}

class Circle implements Shape {
    private double radius;
    private String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle implements Shape {
    private double length;
    private double width;
    private String color;

    public Rectangle(double length, double width, String color) {
        this.length = length;
        this.width = width;
        this.color = color;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }
}

class Sign {
    private Shape background;
    private String text;

    public Sign(Shape background, String text) {
        this.background = background;
        this.text = text;
    }

    public void display() {
        System.out.println("\nSign Background: " + background.getClass().getSimpleName());
        System.out.println("Area: " + background.getArea());
        System.out.println("Perimeter: " + background.getPerimeter());
        System.out.println("Text: " + text);
    }
}

public class p23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Circle Radius and color : ");
        double radius = sc.nextInt();
        String color = sc.next();
        Circle circle = new Circle(radius, color);
        System.out.print("Enter a Rectangle length width and color : ");
        double l = sc.nextInt();
        double w = sc.nextInt();
        String Rcolor = sc.next();
Rectangle rectangle = new Rectangle(l, w, Rcolor);

        Sign circleSign = new Sign(circle, "Circle Sign");
        Sign rectangleSign = new Sign(rectangle, "Rectangle Sign");

        circleSign.display();
        rectangleSign.display();
        System.out.println("Id-22DCE069");
    }
}
