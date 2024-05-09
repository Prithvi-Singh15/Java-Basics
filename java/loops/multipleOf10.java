import java.util.*;

public class multipleOf10 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        do {
            int n = sc.nextInt();
            if (n % 10 == 0) {
                // continue;
                break;

            }
            System.out.println(n);
        } while (true);
    }
}
