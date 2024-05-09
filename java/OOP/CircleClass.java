
class circle {
    public double radius;

    public double area() {
        return Math.PI * radius * radius;
    }
}

public class CircleClass {

    public static void main(String args[]) {
        circle c1 = new circle();
        c1.radius = 3;
        System.out.println(c1.area());
    }
}
