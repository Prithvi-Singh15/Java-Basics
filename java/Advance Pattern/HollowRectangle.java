public class HollowRectangle {
    public static void Hollow_Rectangle(int n, int r) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= r; j++) {
                if (i == 1 || i == n || j == 1 || j == r) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    public static void main(String args[]) {
        Hollow_Rectangle(4, 5);
    }

}