public class PrimeOrNot {
    public static boolean Prime(int n) {

        boolean IsPrime = true;
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                IsPrime = false;

            }
        }
        return IsPrime;
    }

    public static void PrimeInRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (Prime(i)) {
                System.out.print(i + "  ");

            }
        }
        System.out.println();

    }

    public static void main(String args[]) {
        PrimeInRange(20);
    }
}
