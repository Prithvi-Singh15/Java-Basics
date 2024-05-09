public class FrequencyOfElement {
    public static void main(String args[]) {
        int a[] = { 5, 3, 6, 5, 2, 3, 7, 4, 5, 7 };
        int b[] = new int[a.length];
        int vis = -1;
        for (int i = 0; i < a.length; i++) {
            int count = 1;
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    count++;

                    b[j] = vis;
                }
            }
            if (b[i] != vis)
                b[i] = count;

        }
        System.out.println(" ");
        System.out.println("Element|Frequency");
        System.out.println(" ");
        for (int i = 0; i < b.length; i++) {
            if (b[i] != vis) {
                System.out.println(" " + a[i] + " | " + b[i]);
            }
            System.out.println(" ");
        }
    }
}
