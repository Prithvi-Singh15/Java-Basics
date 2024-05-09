public class DeletingAnElement {
    public static void delete(int a[], int key) {

        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) {
                break;
            }
        }
        int i = 3;
        for (int j = i; j < a.length - 1; j++) {
            a[j] = a[j + 1];
        }
    }

    public static void main(String args[]) {
        int a[] = { 1, 2, 3, 4, 5 };
        int key = 3;
        delete(a, key);
        for (int x : a) {
            System.out.print(x + " ");
        }
    }
}
