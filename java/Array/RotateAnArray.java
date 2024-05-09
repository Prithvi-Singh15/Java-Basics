public class RotateAnArray {
    public static void main(String args[]) {
        int A[] = { 3, 6, 4, 5, 8, 7, 9, 2 };
        for (int x : A)
            System.out.print(x);
        System.out.println();

        int temp = A[0];
        for (int i = 1; i < A.length; i++) {
            A[i - 1] = A[i];

        }
        A[A.length - 1] = temp;
        for (int x : A)
            System.out.print(x);
        System.out.println();

    }
}
