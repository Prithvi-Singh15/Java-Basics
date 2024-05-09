import java.util.*;

public class PrimeNo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Boolean IsPrime = true;
        int n = sc.nextInt();
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                IsPrime = false;

            }
        }
        if (IsPrime == true) {
            System.out.println("PRime Number");

        } else {
            System.out.println("Not A Prime Number");
        }

    }
}
