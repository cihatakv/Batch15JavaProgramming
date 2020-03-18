package exercise.random;

import java.util.ArrayList;
import java.util.List;

public class ArrayListRemove {
    public static void main(String[] args) {

        List<String> lst = new ArrayList<>();
        lst.add("1");
        lst.add("2");
        lst.add("3");
        lst.add("4");
        lst.add("5");
        lst.add("6");
        lst.add("7");

        System.out.println("lst = " + lst);

        for (int i = 1; i < lst.size(); i++) {
            lst.remove(i);
        }

        System.out.println("lst = " + lst);

    }
}
