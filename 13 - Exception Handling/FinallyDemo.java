public class FinallyDemo {

    static void meth1() throws Exception {

        try {
            throw new Exception("Exception in Meth1");
        } finally {
            System.out.println("Meth1: " + "Executed");
        }

    }

    // Exception is handled by JVM
    public static void main(String[] args) throws Exception {
        meth1();

        // try {

        // System.out.println(10 / 0);
        // } finally {
        // System.out.println("This is finally block");
        // }
        // System.out.println("Final Message");

    }

}
