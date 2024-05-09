public class RemoveDuplicateElement {
    public static int Removeduplicate(int a[], int n) {
        if (n == 1 || n == 0) {
            return n;
        }
        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (a[i] != a[i + 1]) {
                a[j++] = a[i];
            }
        }
        a[j++] = a[n - 1];
        return j;
    }

    public static void main(String args[]) {
        int a[] = { 4, 5, 6, 6, 7, 8, 9 };
        int length = a.length;
        length = Removeduplicate(a, length);
        for (int i = 0; i < length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
