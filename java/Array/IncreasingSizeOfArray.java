public class IncreasingSizeOfArray {
    public static void main(String args[]) {
        int A[] = { 5, 3, 6, 7, 8 };
        System.out.println(A.length);
        int B[] = new int[2 * A.length];
        System.out.println(B.length);

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
