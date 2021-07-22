public class AbstractExample {

    public static void main(String[] args) {
        Sub s = new Sub();
        s.meth1();
        s.meth2();

    }

}

abstract class Super {
    public Super() {
        System.out.println("Super Constructor");
    }

    public void meth1() {
        System.out.println("Super -> meth1() is called");

    }

    abstract public void meth2();
}

class Sub extends Super {
    public Sub() {
        System.out.println("Sub Constructor");
    }

    public void meth1() {
        System.out.println("Sub -> meth1() is called");
    }

    @Override
    public void meth2() {
        System.out.println("Sub -> meth2() is called");
    }
}
