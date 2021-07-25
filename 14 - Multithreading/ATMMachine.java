class ATM {

    synchronized public void checkBalance(Customer customer) {
        System.out.println("Welcome " + customer.name + ", Your available balance is: " + customer.balance);
    }

    synchronized public void withdraw(Customer customer, int withdrawAmount) {
        System.out.println("How much would you like to withdraw? ");
        if (withdrawAmount > customer.balance) {
            System.out.println("You do not have enough money in your account.");
        } else {
            customer.balance = customer.balance - withdrawAmount;
            System.out.println("" + customer.name + ", You have withdrawn " + withdrawAmount
                    + " and your new balance is " + customer.balance);
        }
    }
}

class Customer extends Thread {
    ATM atm;
    String name;
    String id;
    int balance;

    public Customer(ATM atm, String name, String id, int balance) {
        this.atm = atm;
        this.name = name;
        this.id = id;
        this.balance = balance;
    }

    public void run() {
        checkBalance();
        withdraw(100);
    }

    public void checkBalance() {
        atm.checkBalance(this);

    }

    public void withdraw(int withdrawAmount) {
        atm.withdraw(this, withdrawAmount);
    }
}

public class ATMMachine {

    public static void main(String[] args) {

        ATM atm = new ATM();
        Customer customer1 = new Customer(atm, "John", "12345", 1000);
        Customer customer2 = new Customer(atm, "Mary", "54321", 500);
        Customer customer3 = new Customer(atm, "Bob", "11111", 200);
        customer1.start();
        customer2.start();
        customer3.start();

    }

}
