class my implements Runnable {
    public void run() {
        int i = 1;
        while (true) {
            System.out.println(i + "hello");
            i++;
        }
    }

    public static void main(String args[]) {
        my t = new my();
        Thread m = new Thread(t);
        m.start();

        int i = 1;
        while (true) {
            System.out.println(i + "Prithvi");
            i++;
        }
    }
}
