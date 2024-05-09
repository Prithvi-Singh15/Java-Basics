public class InsertAnElement {
    public static void main(String args[]) {

        int n = 6;

        int a[] = new int[20];
        a[0] = 3;
        a[1] = 9;
        a[2] = 39;
        a[3] = 36;
        a[4] = 4;
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
            System.out.println("");
        }
        int x = 20;
        int index = 4;
        for (int i = n; i > index; i--) {
            a[i] = a[i - 1];

        }
        a[index] = x;
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
            System.out.println();
        }

    }
}
