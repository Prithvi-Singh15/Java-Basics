import javax.swing.text.StyleConstants;

public class SortingTheArray {
    public static void main(String args[]) {
        String A[] = { "java", "python", "pascal", "smalltalk", "ada", "basic" };
        java.util.Arrays.sort(A);
        for (String x : A) {
            System.out.print(x + " ");
        }
    }
}
