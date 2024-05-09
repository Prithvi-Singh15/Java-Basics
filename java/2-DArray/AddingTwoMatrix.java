public class AddingTwoMatrix {
    public static void main(String args[]) {
        int A[][] = { { 6, 7, 4 }, { 8, 2, 3 }, { 9, 7, 6 } };
        int B[][] = { { 3, 5, 4 }, { 9, 4, 7 }, { 8, 3, 2 } };
        int C[][] = new int[3][3];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                C[i][j] = A[i][j] + B[i][j];
                System.out.print(C[i][j] + " ");
            }
            System.out.println(" ");

        }

    }
}
