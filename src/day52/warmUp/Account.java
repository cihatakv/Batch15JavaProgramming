package day52.warmUp;

public class Account implements Transferable, Comparable<Account> {

    protected String name;
    private int balance;

    public Account(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

//    public void setName(String name){
//        this.name = name;
//    }


    public String getName() {
        return name;
    }

//    public void setBalance(int balance){
//        this.balance = balance;
//    }

    public void transferAll(Account otherAccount) {
        otherAccount.balance += this.balance;
        this.balance = 0;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) {
        balance -= amount;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }

    public boolean isPalindrome() {

        String copyName = name.toUpperCase().replace(" ", "");
        int head = 0;
        int tail = name.length() - 1;
        while (head < tail) {
            if (copyName.charAt(head) != copyName.charAt(tail))
                return false;
            head++;
            tail--;
        }
        return true;
    }

    @Override
    public int compareTo(Account otherAccount) {
        if (this.balance > otherAccount.balance)
            return 1;
        else if (this.balance < otherAccount.balance)
            return -1;
        else
            return 0;
    }
}

/*
    Warm up Task
        *
        * Create a class called Account
* it has 2 fields
        *     name as String (protected) , balance as int (private)
        *
        *   -- add constructor to set name and balance
        *   -- add getters to the balance field
        *   -- add deposit method that accept 1 int arugument
        *          -- it will change the balance
        *   -- add withdraw method that accept 1 int arugument
        *          -- reduce the balance
        *   -- add toString method for nice output
        *  Create an interface called Transferable
*  it has single abstract method
        *      - transferAll accept another Account object as parameter
        *      - void transferAll(Account otherAccount)
        *
        *  Account implements Transferable interface
*      logic inside transferAll implementation
        *          it should take all the balance from current account to other Account
        *
        *   Create a class called   Account Action with main method
*      Test your code by creating few Account objects
        *
        *
        *
        *   Optionally : let Account implements Comparable<Account>
*          Create List<Account> and sort them using Collecions.sort(..)
        *
        *   to honor Palindrome day ,
        *   add a method inside Account class called
*          isPalindrome return true if account name is palidrome (case and space should not matter)
        *
        */