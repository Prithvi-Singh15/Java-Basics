class Super {
    public void display() {
        System.out.println("prithvi");
    }
}

class Sub extends Super {
    public void display() {
        System.out.println("prithvi singh");
    }
}

class Test {
    public static void main(String args[]) {
        Super su = new Super();
        su.display();
        Sub sb = new Sub();
        sb.display();
    }
}