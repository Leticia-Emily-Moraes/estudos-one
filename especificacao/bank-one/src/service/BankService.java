package service;

import model.Account;
import util.InputUtils;

public class BankService {
    private final Account person;

    public BankService(Account pPerson){
        this.person = pPerson;
    }

    public void startMenu() {
        int option = 0;
        do {
            System.out.println("\n====== BANKING MENU ======");
            System.out.println("1 - Check balance");
            System.out.println("2 - Deposit");
            System.out.println("3 - Withdrawn");
            System.out.println("4 - Exit");
            System.out.println("Choose an option: ");
            String enter = InputUtils.readText("");

            try {
                option = Integer.parseInt(enter);
            } catch (NumberFormatException e) {
                System.out.println("Invalid option. Please, enter a number from 1 to 4.");
                continue;
            }

            switch (option) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdrawn();
                    break;
                case 4:
                    System.out.println("Shutting down the system. See you soon., " + person.getName() + "!");
                    break;
                default:
                    System.out.println("Invalid option. Enter a number from 1 to 4.");
            }
        } while (option != 4);
    }

    private void checkBalance() {
        System.out.println("Current balance: R$ " + String.format("%.2f", person.getBalance()));
    }

    private void deposit() {
        double value = InputUtils.readDouble("Enter the amount to deposit: R$ ");
        if (value <= 0) {
            System.out.println("Invalid value. Enter a positive number.");
            return;
        }
        double newBalance = person.getBalance() + value;
        person.setBalance(newBalance);
        System.out.println("Deposit made successfully!");
        checkBalance();
    }

    private void withdrawn() {
        double value = InputUtils.readDouble("Enter the amount to be withdrawn: R$ ");
        if(value <= 0){
            System.out.println("Invalid value. Enter a positive number.");
            return;
        }

        if(value > person.getBalance()){
            System.out.println("There is not enough balance for this operation.");
        }else{
            double newBalance = person.getBalance() - value;
            person.setBalance(newBalance);
            System.out.println("Withdrawal successful!");
            checkBalance();
        }
    }
}
