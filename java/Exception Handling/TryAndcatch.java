public class TryAndcatch {
    public static void main(String args[]) {
        int a = 10, b = 0, c;
        try {
            c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("Denominator can not be Zero");
        }
        System.out.println("hello");
    }
}