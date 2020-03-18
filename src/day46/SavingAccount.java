package day46;

public class SavingAccount extends BankAccount {

    //    String accountHolder;
    //    long accountNum;
    //    double balance;

    double interestRate;

    public SavingAccount(String accountHolder, long accountNum, double balance, double interestRate) {
        super(accountHolder, accountNum, balance);
        this.interestRate = interestRate;
    }

    public static void main(String[] args) {

        SavingAccount s1 = new SavingAccount("Cihat", 123456789, 95000, 4.2);
        System.out.println("s1 = " + s1);

    }

    // in our SavingAccount , if we withdraw amount you withdraw
    // you get 30 dollar penalty
    // so we will override the withdraw method to reflect this requirement
    @Override
    public void withdraw(int amount) {
        // taking away 30$ more on top of what you withdraw
        //balance -= 30 ;
        //balance = balance - amount -30 ;
        super.withdraw(amount);
        super.withdraw(30); // this is the penalty

    }
    // public void deposit(int amount){
    //        balance += amount;
    //    }

    @Override
    public void deposit(int amount) {

        int actualAmount = (int) (amount + amount * interestRate);
        super.deposit(actualAmount);
    }

    @Override
    public String toString() {
        return "SavingAccount{" +
                "interestRate=" + interestRate +
                ", accountHolder='" + accountHolder + '\'' +
                ", accountNum=" + accountNum +
                ", balance=" + balance +
                '}';
    }
}
