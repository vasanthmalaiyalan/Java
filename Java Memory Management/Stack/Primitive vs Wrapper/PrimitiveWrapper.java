class Account {
    int balance;  // primitive
    String owner; // object (wrapper(heap) - like reference)

    void deposit(int amount) {
        balance += amount;
    }

    void display() {
        System.out.println("Owner: " + owner);
        System.out.println("Balance: " + balance);
    }
}

public class PrimitiveWrapper {
    public static void main(String[] args) {

        int x = 100;      // primitive
        Integer y = 100;  // wrapper

        Account acc = new Account(); //object

        acc.owner = "Vasanth"; // String (object)
        acc.deposit(x);    // primitive pass
        acc.deposit(y);    // wrapper auto-unboxing

        acc.display();
    }
}