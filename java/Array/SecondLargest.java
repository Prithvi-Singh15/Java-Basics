public class SecondLargest {
    public static void main(String args[]) {
        int A[] = { 7, 3, 5, 8, 2, 9 };
        int max1 = A[0];
        int max2 = A[0];
        for (int i = 0; i < A.length; i++) {
            if (A[i] > max1) {
                max2 = max1;
                max1 = A[i];

            } else if (A[i] > max2) {
                max2 = A[i];
            }
        }
        System.out.println(max2);

    }
}
