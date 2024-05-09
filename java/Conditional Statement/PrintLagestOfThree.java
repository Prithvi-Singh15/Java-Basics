public class PrintLagestOfThree {
    public static void main(String args[]) {
        int A = 3, B = 5, C = 8;

        if ((A >= B) && (A >= C)) {
            System.out.println("A is largest");
        } else if (B >= C) {
            System.out.println("B is largest");
        } else {
            System.out.println("C is largest");
        }
    }
}
