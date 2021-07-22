
class Super {
    public void meth1() {
        System.out.println("Super -> meth1() is called");
    }

    public void meth2() {
        System.out.println("Super -> meth2() is called");
    }
}

class Sub extends Super {

    public void meth1() {
        System.out.println("Sub -> meth1() is called");
    }

    @Override
    public void meth2() {
        System.out.println("Sub -> meth2() is called");
    }

    public void meth3() {
        System.out.println("Sub -> meth3() is called");
    }

}

/**
 * DynamicDispatch
 */
public class DynamicDispatch {

    public static void main(String[] args) {
        // Super s = new Sub();
        // s.meth1();
        // s.meth2();
        // s.meth3();

        Super s = new Super();
        s.meth1();
        s.meth2();
    }
}
