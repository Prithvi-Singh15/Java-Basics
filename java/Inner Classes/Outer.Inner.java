
class Outer {
    int x = 10;

    class Innner {
        int y = 20;

        void setOuter() {
            System.out.println(+x + y);
        }

    }
}

class Test {
    public static void main(String args[]) {
        Outer o = new Outer();

    }
}