import java.util.*;
import java.io.*;

class Account {

    String accNo;
    String accName;
    double bal;

    LinkedHashMap<String, Account> accountMap = new LinkedHashMap<String, Account>(10, 0.75f, true);

    static Scanner in = new Scanner(System.in);

    public Account() {
    }

    public Account(String accNo, String accName, double bal) {
        this.accNo = accNo;
        this.accName = accName;
        this.bal = bal;
    }

    public void createAccount() {

        System.out.println("Enter Account No.");
        String accNo = in.next();
        System.out.println("Enter Account Name");
        String accName = in.next();

        in.nextLine();
        System.out.println("Enter Balance");
        double bal = in.nextDouble();

        Account account = new Account(accNo, accName, bal);
        accountMap.put(accNo, account);
    }

    public void deleteAccount() {
        System.out.println("Enter The Account Number : ");
        String accNo = in.next();

        if (accountMap.containsKey(accNo)) {
            accountMap.remove(accNo);
        } else {
            System.out.println("Account Not Found");
        }

    }

    public void displayAccount() {
        System.out.println("Enter Account Number : ");
        String accNo = in.next();
        if (accountMap.containsKey(accNo)) {
            Account account = accountMap.get(accNo);
            System.out.println("Account No : " + account.accNo);
            System.out.println("Account Name : " + account.accName);
            System.out.println("Balance : " + account.bal);
        } else {
            System.out.println("Account Not Found");
        }

    }

    public void displayAllAccounts() {

        accountMap.forEach((key, value) -> {
            System.out.println(
                    "Account No  : " + value.accNo + " Account Name : " + value.accName + " Balance : " + value.bal);
        });
    }

    public void saveAccount() {
        File file = new File("./AccountData.txt");
        BufferedWriter bf = null;

        try {

            // create new BufferedWriter for the output file
            bf = new BufferedWriter(new FileWriter(file));
            bf.write("Account Number " + "Account Name " + "Account Balance\n");
            // iterate map entries
            for (HashMap.Entry<String, Account> entry : accountMap.entrySet()) {

                bf.write(entry.getValue().accNo + "          " + entry.getValue().accName + "           "
                        + entry.getValue().bal);

                // new line
                bf.newLine();
            }

            bf.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {

                // always close the writer
                bf.close();
            } catch (Exception e) {
            }
        }
    }

}

public class StudentChallenge {

    public static void main(String[] args) {
        Account ac = new Account();

        while (true) {

            System.out.println("Welcome to Anonymous Bank : ");
            System.out.println("1. Create Account");
            System.out.println("2. Delete Account");
            System.out.println("3. View Account");
            System.out.println("4. View All Accounts");
            System.out.println("5. Save Account");
            System.out.println("6. Exit");

            System.out.print("Enter your Choice : ");
            int choice = Account.in.nextInt();

            switch (choice) {
                case 1:
                    ac.createAccount();
                    break;
                case 2:
                    ac.deleteAccount();
                    break;
                case 3:
                    ac.displayAccount();
                    break;
                case 4:
                    ac.displayAllAccounts();
                    break;
                case 5:
                    ac.saveAccount();
                    break;
                case 6:
                    System.out.println("Thank you for using our bank service.");

                    System.exit(1);
                default:
                    System.out.println("Invalid Choice");

            }

        }

    }

}
