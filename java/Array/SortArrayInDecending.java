public class SortArrayInDecending {
    public static void main(String Args[]) {
        int a[] = { 6, 4, 3, 7, 8 };
        int temp = 0;
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + "");
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + "");
        }
    }
}
