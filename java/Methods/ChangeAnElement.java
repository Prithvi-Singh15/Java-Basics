public class ChangeAnElement {
    public static void change(int A[], int index, int value) {
        A[index] = value;
    }

    public static void main(String args[]) {
        int A[] = { 4, 5, 3, 7 };
        change(A, 2, 43);
        for (int x : A) {
            System.out.println(x);
        }

    }
}
