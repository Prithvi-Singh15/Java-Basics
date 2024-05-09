public class CirckeClass {
    public double radius;

    public void circle() {
        radius = 0.0;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    public double circumfrence() {
        return perimeter();
    }

}

class Cylinder extends CirckeClass {
    public double height;

    public double volume() {
        return area() * height;
    }
}

class Circle1 {
    public static void main(String args[]) {
        Cylinder c = new Cylinder();
        c.height = 4;
        c.radius = 34;
        System.out.println("volume = " + c.volume());
        System.out.println("area = " + c.area());
    }

}