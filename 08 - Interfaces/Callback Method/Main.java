public class Main {

    public static void main(String[] args) {

        Store store = new Store();
        Customer customer1 = new Customer("Sachin", 1);
        Customer customer2 = new Customer("Rohit", 2);
        Customer customer3 = new Customer("Kunal", 3);
        Customer customer4 = new Customer("Shivani", 4);

        store.register(customer1);
        store.register(customer2);
        store.register(customer3);
        store.register(customer4);

        store.inviteSale();
    }

}
