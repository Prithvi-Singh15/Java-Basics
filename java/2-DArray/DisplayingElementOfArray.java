public class DisplayingElementOfArray {
    public static void main(String args[]) {
        int B[][] = { { 2, 5, 6 }, { 3, 4, 5 }, { 5, 6, 7 } };
        for (int x[] : B) {
            for (int y : x) {
                System.out.print(y + " ");
            }
            System.out.println(" ");
        }

    }
}