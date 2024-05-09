public class DeclarationOfMethod {
    public static int max(int x, int y) {
        if (x > y) {
            System.out.println("X No is greater");
            return x;
        } else {
            System.out.println("Y no is greater");
            return y;
        }
    }

    public static void main(String args[]) {
        System.out.println(max(24, 6));
    }
}