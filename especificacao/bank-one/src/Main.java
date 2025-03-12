import model.Account;
import service.BankService;
import util.InputUtils;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to the Virtual Banking System!");

        String name = InputUtils.readText("Enter the customer's name: ");
        String accountType = InputUtils.readText("Enter the account type (Checking, Savings, etc.): ");
        double openingBalance = InputUtils.readDouble("Enter the initial balance: R$ ");

        Account people = new Account(name, accountType, openingBalance);

        System.out.println("\nAccount created successfully!");
        System.out.println(people);

        BankService service = new BankService(people);
        service.startMenu();
    }
}
