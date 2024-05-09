class MyThread extends Thread {
    public void run() {
        int i = 1;
        for (; i < 5;) {
            System.out.println(i + "hello");
            i++;
        }
    }
}

class Test {
    public static void main(String args[]) {
        MyThread m = new MyThread();
        m.start();
        int i = 1;
        for (; i < 5;) {
            System.out.println(i + "world");
            i++;
        }
    }
}