
abstract class Shape {
    abstract double perimeter();

    abstract double area();

}

class Circle extends Shape {
    int radius;

    public double area() {
        return Math.PI * radius * radius;

    }

    public double perimeter() {
        return 2 * Math.PI * radius;

    }
}

class Rectangle extends Shape {
    int length;
    int breadth;

    public double area() {
        return length * breadth;

    }

    public double perimeter() {
        return 2 * (length + breadth);
    }
}

class ShapeTest {
    public static void main(String args[]) {
        Circle c = new Circle();
        c.radius = 6;
        Shape s = c;
        s.perimeter();
        Rectangle r = new Rectangle();
        r.length = 10;
        r.breadth = 5;
        // System.out.println("Area of Circle = " + c.area());
        // System.out.println("Perimeter of Circle = " + c.perimeter());
        System.out.println("area of rectangle = " + r.area());
    }
}