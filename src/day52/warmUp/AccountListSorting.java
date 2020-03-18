package day52.warmUp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AccountListSorting {
    public static void main(String[] args) {

        List<Account> accountList = new ArrayList<>();

        accountList.add(new Account("Jon Snow", 10000));
        accountList.add(new Account("Vlad", 11000));
        accountList.add(new Account("Svetlana", 13000));
        accountList.add(new Account("Muhammed", 8000));
        accountList.add(new Account("Emme", 17000));
        accountList.add(new Account("Ata", 15000));

        System.out.println("accountList before = \n" + accountList);

        Collections.sort(accountList);

        System.out.println("accountList after = \n" + accountList);


        // Create another account with your name:
        // transfer everyone's money to your account

        Account a = new Account("Ata", 10000);

//        for (int i = 0; i < accountList.size(); i++) {
//            accountList.get(i).transferAll(a);
//        }

        for (Account each : accountList) {
            each.transferAll(a);
        }

        System.out.println("a = " + a);

        System.out.println("accountList = " + accountList);

        Account a1 = new Account("Polymorphism", 10000);


    }
}
