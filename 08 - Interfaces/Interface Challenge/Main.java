import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to Dungeons and Dragons!\n" + "Choose your character\n" + "1. Player\n"
                + "2.Monster\n" + "3.Exit");
        Scanner scanner = new Scanner(System.in);
        int ch = scanner.nextInt();
        scanner.nextLine();

        switch (ch) {
            case 1:
                Player player = new Player();
                readObject(player);
                System.out.println("Player created successfully!");
                loadObject(player);
                break;
            case 2:
                Monster monster = new Monster();
                readObject(monster);
                System.out.println("Monster created successfully!");
                loadObject(monster);
                break;

            default:
                break;
        }

    }

    public static ArrayList<String> readValues() {

        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" + "1. To enter a string\n" + "0 to quit");
        while (!quit) {
            System.out.println("Choose an Option : ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter a String : ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;

            }

        }
        return values;
    }

    public static void loadObject(ISaveable objectToSave) {
        for (int i = 0; i < objectToSave.write().size(); i++) {
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device");

        }
        System.out.println(objectToSave.toString());
    }

    public static void readObject(ISaveable objectToLoad) {
        ArrayList<String> values = readValues();
        objectToLoad.read(values);

    }
}
