public class ThirdLargest {
    public static int largest(int a[], int n) {
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a[n - 1];
    }

    public static void main(String args[]) {
        int a[] = { 4, 6, 3, 7, 8, 9 };
        System.out.println(largest(a, 6));
    }
}
