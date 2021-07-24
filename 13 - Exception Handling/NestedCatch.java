public class NestedCatch {

    public static void main(String[] args) {

        int A[] = { 30, 20, 10, 40, 0 };

        try {

            int c = A[0] / A[1];
            System.out.println("Result is " + c);
            try {
                System.out.println(A[5]);

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Caught exception : " + e);
            }
        } catch (ArithmeticException e) {
            System.out.println("Caught exception: " + e);
        }

    }

}
