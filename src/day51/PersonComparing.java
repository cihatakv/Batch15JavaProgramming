package day51;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonComparing {

    public static void main(String[] args) {

        Person p1 = new Person("Cihat", 34);

        Person p2 = new Person("Oznur", 33);

        System.out.println("p1 = " + p1);

        System.out.println("p2 = " + p2);

        Person p3 = new Person("Ali", 18);

        System.out.println("p3 = " + p3);

//        if (p1.age > p2.age)
//            System.out.println(1);
//        else if (p1.age < p2.age)
//            System.out.println((-1));
//        else
//            System.out.println(0);

        // System.out.println(p1.compareTo(p2));


        List<Person> lst = new ArrayList<>();
        lst.add(p1);
        lst.add(p2);
        lst.add(p3);
        lst.add(new Person("Jon Snow", 27));
        System.out.println("lst = " + lst);

        Collections.sort(lst);
        System.out.println("lst = " + lst);

    }


}
