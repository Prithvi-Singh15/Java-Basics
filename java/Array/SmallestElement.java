public class SmallestElement {
    public static void main(String args[]) {
        int a[] = { 5, 7, 6, 3, 8, 6 };
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];

            }

        }
        System.out.println(max);
    }
}
