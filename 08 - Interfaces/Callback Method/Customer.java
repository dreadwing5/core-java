import java.lang.reflect.Member;

public class Customer implements IMember {

    private String name;
    private int id;

    public Customer(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public void callBack() {
        System.out.println("Customer: " + name + " " + id);
        System.out.println("You have been invited to the sale!");
    }

}
