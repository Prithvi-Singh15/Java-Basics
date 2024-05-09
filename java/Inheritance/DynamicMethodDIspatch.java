class Parent {
    public void method1() {
        System.out.println("method1");
    }

    public void method2() {
        System.out.println("Super method2");
    }
}

class Child extends Parent {
    public void method2() {
        System.out.println("Sub method2");
    }

    public void method3() {
        System.out.println(" method3");
    }
}

class DynamicTest {
    public static void main(String args[]) {
        Parent s = new Child();
        s.method1();
        s.method2();

    }
}