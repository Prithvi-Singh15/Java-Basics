public class BinomialToDecimal {
    public static void BTD(int n) {
        int mynum = n;
        int pow = 0;
        int decnum = 0;

        while (n > 0) {
            int lastdigit = n % 10;
            decnum = decnum + (lastdigit * (int) Math.pow(2, pow));
            pow++;
            n = n / 10;
        }
        System.out.println("decimal of " + mynum + " = " + decnum);
    }

    public static void main(String args[]) {
        BTD(110);

    }
}
