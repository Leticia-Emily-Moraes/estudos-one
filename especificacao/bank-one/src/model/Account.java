package model;

public class Account {
    private String name;
    private String accountType;
    private double balance;

    // Constructor
    public Account(String pName, String pAccountType, double pBalance){
        this.name = pName;
        this.accountType = pAccountType;
        this.balance = pBalance;
    }

    // Getters e Setters

    public String getName(){
        return name;
    }

    public String getAccountType(){
        return accountType;
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double pBalance){
        this.balance = pBalance;
    }

    @Override
    public String toString(){
         return "==============================\n"
             + "Customer name: " + name + "\n"
             + "Account type: " + accountType + "\n"
             + "Opening balance: R$ " + String.format("%.2f", balance) + "\n"
             + "==============================";
    }
}
