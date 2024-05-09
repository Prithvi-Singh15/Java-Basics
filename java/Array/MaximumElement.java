public class MaximumElement {
    public static void main(String args[]) {
        int A[] = { 2, 4, 5, 23, 45, 78 };
        int max = A[0];
        for (int i = 0; i < A.length; i++) {
            if (A[i] > max) {
                max = A[i];
            }
        }
        System.out.println("Greater Element is =  " + max);
    }
}
