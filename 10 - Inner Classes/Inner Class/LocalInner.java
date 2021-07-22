/* abstract class My {
    abstract public void show();} */

interface My {

    public void show();
}

class Outer {
    int x = 10;
    // public void display() {
    // class Inner {
    // public void show() {
    // System.out.println("Hello");
    // }
    // }
    // /*
    // * Inner i = new Inner(); i.show();
    // */
    // new Inner().show(); // Anonymous object
    // }

    public void display() {

        new My() {
            public void show() {
                System.out.println("Hello");
                System.out.println(x); //
            }
        }.show();// Anonymous class
        // m.show();
    }

}

/**
 * LocalInner
 */
public class LocalInner {
    public static void main(String[] args) {

        Outer outer = new Outer();
        outer.display();
    }
}
