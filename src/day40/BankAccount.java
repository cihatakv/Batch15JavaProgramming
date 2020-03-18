package day40;

public class BankAccount {

    String accountType;
    String accountHolder;
    long accountNumber;
    private double balance;

    // setAllTheValue
    public void setAllTheValue(String newAccountType, String newAccountHolder, long newAccountNumber, double newBalance) {
        accountType = newAccountType;
        accountHolder = newAccountHolder;
        accountNumber = newAccountNumber;
        balance = newBalance;
    }


    // showAccountBalance()
    public void showAccountBalance() {
        // authentication
        System.out.println("Current balance = " + balance);
    }

    // showAccountHolderAccountType
    public void showAccountHolderAccountType() {
        System.out.println("AccountHolder is " + accountHolder + " | accountType = " + accountType);
    }

    // getBalance return the balance
    public double getBalance() {
        return balance;
    }
    // deposit (amount)

    public void deposit(double amount) {
        balance += amount;
    }

    // withdraw (amount)
    public void withdraw(double amount) {
        balance -= amount;
    }

    // withdraw100Cash()
    public void withdraw100Cash() {
        withdraw(100);
    }

    // product (productPrice, count)
    public void purchaseProduct(double productPrice, int count) {
        balance -= productPrice * count;
    }

    // toString()


    @Override
    public String toString() {
        return "BankAccount{" +
                "accountType='" + accountType + '\'' +
                ", accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }
}
