class Outer {
    static int x = 10;
    Inner inner = new Inner(); // Accessible within the outer class

    class Inner {

        int y = 20;

        public void innerDisplay() {
            System.out.println(x + " " + y);
        }
    }

    public void outerDisplay() {
        // Inner i = new Inner();
        // i.innerDisplay();
        System.out.println(inner.y); // we can only access y, by created i object of outer class
    }

}

public class NestedInner {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.outerDisplay();

        // Outer.Inner i = new Outer().new Inner(); // This is not useful
        // i.innerDisplay();
    }
}