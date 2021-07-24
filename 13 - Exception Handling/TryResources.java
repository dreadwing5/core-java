import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TryResources {

    // static FileInputStream fileInputStream;

    // static Scanner sc;

    static void Divide() throws Exception {

        try (FileInputStream fileInputStream = new FileInputStream("./Test.txt");
                Scanner sc = new Scanner(fileInputStream)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            System.out.println(a / c);

        }

        // try {
        // fileInputStream = new FileInputStream("./Test.txt");
        // sc = new Scanner(fileInputStream);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();
        // System.out.println(a / c);

        // } finally {
        // fileInputStream.close();
        // sc.close();

        // }

    }

    public static void main(String[] args) throws Exception {

        try {
            Divide();

        } catch (Exception e) {
            System.out.println(e);
        }
        // int x = sc.nextInt();

        // System.out.println(x);

    }

}
