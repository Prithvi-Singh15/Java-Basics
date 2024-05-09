
class Rectangle {
    private int length;
    private int breadth;

    public Rectangle() {
        length = 1;
        breadth = 1;
    }

    public Rectangle(int l, int b) {
        setlength(l);
        setbreadth(b);
    }

    public int getlength() {
        return length;
    }

    public int getbreadth() {
        return breadth;
    }

    public void setlength(int l) {
        length = l;
    }

    public void setbreadth(int b) {
        breadth = b;
    }

    public int area() {
        return length * breadth;
    }
}

public class RectangleClass {
    public static void main(String args[]) {
        Rectangle r = new Rectangle(10, 4);

        System.out.println(r.area());
    }
}
