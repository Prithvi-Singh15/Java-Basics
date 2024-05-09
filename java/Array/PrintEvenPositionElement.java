public class PrintEvenPositionElement {
    public static void main(String args[]) {

        int a[] = { 4, 5, 3, 2, 6, 7, 8 };
        System.out.println("Element  at Even postion");
        for (int i = 1; i < a.length; i = i + 2) {
            System.out.println(a[i] + " ");
        }
    }
}
