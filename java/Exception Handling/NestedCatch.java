public class NestedCatch {
    public static void main(String args[]) {
        int A[] = { 8, 5, 6, 2, 0 };
        try {
            int v = A[0] / A[2];
            System.out.println("Divison is " + v);

        } catch (ArithmeticException e) {
            System.out.println("Denominator can nit be Zero");
        }
        try {
            System.out.println(A[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("invalid index");
        }

    }
}
