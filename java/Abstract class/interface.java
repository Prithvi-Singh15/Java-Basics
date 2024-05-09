interface Member {
    void callback();

}

class Store {
    Member mem[] = new Member[10];
    int count = 0;

    void register(Member m) {
        mem[count + 1] = m;
    }

    void invitesale() {
        for (int i = 0; i < count; i++) {
            mem[i].callback();
        }
    }
}

class Customer implements Member {
    String name;

    Customer(String n) {
        name = n;

    }

    public void callback() {
        System.out.println("Ok I will come  " + name);
    }
}

class Test {
    public static void main(String args[]) {
        Customer c = new Customer("john");
        c.callback();
    }
}
