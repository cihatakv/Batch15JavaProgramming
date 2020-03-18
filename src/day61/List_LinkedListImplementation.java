package day61;

import java.util.LinkedList;
import java.util.List;

public class List_LinkedListImplementation {

    public static void main(String[] args) {


        List<String> lst = new LinkedList<>();

        lst.add("Zeynep");
        lst.add("Ershat");
        lst.add("Karima");
        lst.add("Sabira");

        System.out.println("lst = " + lst);
        System.out.println(lst.get(2));

    }

}
