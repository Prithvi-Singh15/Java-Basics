class indexOfAnArray {
    public static int linersearch(int number[], int key) {
        for (int i = 1; i <= number.length; i++) {
            if (number[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int number[] = { 7, 5, 3, 6, 9 };
        int key = 3;
        int index = linersearch(number, key);
        if (index == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index : " + index);
        }

    }
}