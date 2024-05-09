import java.util.Scanner;

public class SearchAnElement {
    public static void main(String args[]) {
        int A[] = { 7, 3, 5, 8, 2, 9 };
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        for (int i = 0; i < A.length; i++) {

            if (A[i] == key) {
                System.out.println("At the index = " + i);
                System.exit(0);
            }
        }
        System.out.println("Not Found");
    }
}
