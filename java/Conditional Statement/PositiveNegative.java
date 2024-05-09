import java.util.*;

public class PositiveNegative {
    public static void main(String args[]) {
        // int number = -45;

        // String type = number > 0 ? "Positive" : "Negative";
        // System.out.println(type);
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String type = a > 0 ? "Positive" : "Negative";
        System.out.println(type);

    }
}
