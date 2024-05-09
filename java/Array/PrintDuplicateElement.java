public class PrintDuplicateElement {
    public static void main(String args[]) {
        int a[] = { 5, 6, 4, 5, 6, 3, 2 };
        System.out.println("Duplicate Element in array");
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    System.out.println(a[j] + " ");
                }
            }
        }
    }
}
