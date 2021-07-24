class NegativeDimensionException extends Exception {
    public String toString() {
        return "l and b can't be negative";
    }
}

public class ThrowThrowsDemo {

    static int area(int l, int b) throws NegativeDimensionException {
        if (l < 0 || b < 0)
            throw new NegativeDimensionException();
        return l * b;
    }

    static void meth1() {
        try {

            System.out.println("Area is " + area(-5, 5));
        } catch (NegativeDimensionException e) {
            System.out.println("Caught " + e);
            // e.printStackTrace();
        }
    }

    // static int meth1() {
    // return 10 / 0;
    // }

    // static void meth2() {
    // meth1();
    // }

    // static void meth3() {
    // meth2();
    // }

    public static void main(String[] args) {

        meth1();
        // try {
        // meth3();

        // } catch (Exception e) {

        // System.out.println(e);
        // }
    }

}
