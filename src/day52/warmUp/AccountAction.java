package day52.warmUp;

public class AccountAction {
    public static void main(String[] args) {


        Account a1 = new Account("Cihat", 97000);
        System.out.println("a1 = " + a1);
        Account a2 = new Account("Oznur", 13000);
        System.out.println("a2 = " + a2);
        a1.deposit(10000);
        System.out.println("(After depositing $10000) a1 = " + a1);
        a1.withdraw(3000);
        System.out.println("(After withdrawing $3000) a1 = " + a1);

        a1.transferAll(a2);
        System.out.println("(After Transfering all to a2) a1 = " + a1);

        System.out.println("(After Transfering all to a2) a2 = " + a2);

        Account a3 = new Account("Hanah", 47000);

        System.out.println(a3.isPalindrome());

    }
}


// Create a class called   Account Action with main method
//*      Test your code by creating few Account objects

// Optionally : let Account implements Comparable<Account>
//*          Create List<Account> and sort them using Collecions.sort(..)
//        *
//        *   to honor Palindrome day ,
//        *   add a method inside Account class called
//*          isPalindrome return true if account name is palidrome (case and space should not matter)
//        *