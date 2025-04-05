import java.text.DecimalFormat;
class Shape {
    protected String name;
    protected static int shapeCount = 0;
    public Shape(String name) {
        this.name = name;
        shapeCount++;
    }
    public void displayInfo() {
        System.out.println("\nShape Information:");
        System.out.println("Name: " + name);
    }
    public double calculatePerimeter() {
        System.out.println("Perimeter calculation not defined for generic shape");
        return 0;
    }
    public static void displayTotalShapes() {
        System.out.println("\nTotal shapes created: " + shapeCount);
    }
}
class Rectangle extends Shape {
    private double length;
    private double width;
    private DecimalFormat df = new DecimalFormat("0.00");
    public Rectangle(double length, double width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }
    public double calculatePerimeter() {
        double perimeter = 2 * (length + width);
        System.out.println("Perimeter of " + name + ": " + df.format(perimeter));
        return perimeter;
    }
    public boolean isSquare() {
        return length == width;
    }
}
class Circle extends Shape {
    private double radius;
    private DecimalFormat df = new DecimalFormat("0.00");
    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }
    public double calculatePerimeter() {
        double perimeter = 2 * Math.PI * radius;
        System.out.println("Circumference of " + name + ": " + df.format(perimeter));
        return perimeter;
    }
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    public void displayArea() {
        System.out.println("Area of " + name + ": " + df.format(calculateArea()));
    }
}
public class Perimeter_Calculator {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5.5, 3.2);
        rectangle.displayInfo();
        rectangle.calculatePerimeter();
        System.out.println("Is square? " + rectangle.isSquare());
        Rectangle square = new Rectangle(4.0, 4.0);
        square.displayInfo();
        square.calculatePerimeter();
        System.out.println("Is square? " + square.isSquare());
        Circle circle = new Circle(3.0);
        circle.displayInfo();
        circle.calculatePerimeter();
        circle.displayArea();
        Shape.displayTotalShapes();
    }
}