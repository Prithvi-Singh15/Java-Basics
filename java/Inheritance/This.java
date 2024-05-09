class rectangle {
    int length;
    int breadh;

    rectangle(int l, int b) {
        this.length = l;
        this.breadh = b;

    }

    void display() {
        System.out.println("Length : " + this.length);
        System.out.println("Breadth : " + this.breadh);
    }
}

class rectangleTest {
    public static void main(String args[]) {
        rectangle r1 = new rectangle(10, 5);
        r1.display();
        rectangle r2 = new rectangle(18, 5);
        r2.display();
    }
}