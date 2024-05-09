public class MultiplyTwoMatrix {
    public static void main(String args[]) {
        int A[][] = { { 6, 7, 4 }, { 8, 2, 3 }, { 9, 7, 6 } };
        int B[][] = { { 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } };
        int C[][] = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                C[i][j] = 0;
                for (int K = 0; K < 3; K++) {
                    C[i][j] = C[i][j] + A[i][K] * B[K][j];

                }
                System.out.print(C[i][j] + " ");
            }
            System.out.println(" ");
        }

    }
}