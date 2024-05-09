public class CopyingAnArray {
    public static void main(String args[]) {
        int A[] = { 5, 6, 7, 5, 8, 9, 2 };
        int B[] = new int[10];
        B = A;
        B[0]++;
        System.out.println("Content of A[] ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println("\n\nContent of B[] ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(B[i] + " ");
        }

    }
}
