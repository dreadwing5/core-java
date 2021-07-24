import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a, b, c;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two numbers : ");
        a = scanner.nextInt();
        b = scanner.nextInt();

        try {

            c = a / b;
            System.out.println("Result is : " + c);
        } catch (ArithmeticException e) {

            System.out.println("Error -> " + e);

            System.out.println("Denominator shouldn't be 0, try again");
        }
        System.out.println("Upper Block was executed successfully");
    }

}
