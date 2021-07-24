// import java.io.FileInputStream;

class LowBalanceException extends Exception {

    @Override
    public String toString() {
        return "Balance should not be less than 5000";
    }

}

public class CheckedUnchecked {

    static void fun1() {
        // FileInputStream f1 = new FileInputStream("file1"); // ->Syntax Error, Checked
        // Exception
        try {
            throw new LowBalanceException();
            // System.out.println(10 / 0); // Compiler doesn't give any error -> Unchecked
            // Exception
        } catch (LowBalanceException e) {

            System.out.println(e);

            // System.out.println("Exception: " + e.getMessage());
            // e.printStackTrace(); // Helps in generating log messages
        }
    }

    static void fun2() {
        fun1();
    }

    static void fun3() {
        fun2();
    }

    public static void main(String[] args) {
        fun3();
    }

}
