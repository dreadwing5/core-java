enum Dept {
    CS("John", "Block A"), IT("Smith", "Block B"), EC("Srinivas", "Block C"), EE("Dave", "Block D");
    // When enum is loaded object will be created

    String head, loc;

    private Dept(String head, String loc) {
        this.head = head;
        this.loc = loc;

        // System.out.println(this.name());
    } // Constructor is called automatically when an object of this enum is created.

    public String getHead() {
        return head;
    }

    public String getLoc() {
        return loc;
    }

    public void display() {
        System.out.println(this.name() + " " + this.ordinal());
    }
}

// Useful in Switch cases

public class EnumDemo {

    public static void main(String[] args) {
        Dept d = Dept.CS;
        // d.display();
        System.out.println(d.getHead());
        System.out.println(d.getLoc());
        // System.out.println(d.ordinal() + " " + d.name());
        // System.out.println(Dept.valueOf("IT"));

        // Dept list[] = Dept.values();
        // for (Dept d1 : list) {
        // System.out.println(d1.ordinal() + " " + d1.name());
        // }

        // switch (d) {
        // case CS:
        // System.out.println("Head : John \nBlock : A");
        // break;
        // case IT:
        // System.out.println("Head : Smith \nBlock : B");
        // break;
        // case EC:
        // System.out.println("Head : Srinivas \nBlock : C");
        // break;
        // case EE:
        // System.out.println("Head : Dave \nBlock : D");
        // break;
        // }

    }

}
