package day38;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListBulkOperation {
    public static void main(String[] args) {
        List<String> groceries = Arrays.asList("Eggs", "Milk", "Butter", "Apple", "Salmon");
        System.out.println("groceries = " + groceries);

        ArrayList<String> newLst = new ArrayList<>(groceries);
        newLst.add("Diet coke");
        newLst.add("Sugar");

        System.out.println("newLst = " + newLst);

        // Actually I have list of items for you here: Pasta, branzini, asparagus, spinach
        // good news is I already created a list object for you
        List<String> newItemsToAdd = Arrays.asList("Pasta", "branzini", "asparagus", "spinach");

        newLst.addAll(newItemsToAdd);
        System.out.println("new Lst with all items = " + newLst);


    }
}
