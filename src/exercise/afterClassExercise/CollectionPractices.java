package exercise.afterClassExercise;

import java.util.*;

public class CollectionPractices {

    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("word");

        StringBuilder sb2 = sb1;

        sb1 = new StringBuilder("hello");

        System.out.println("sb1 = " + sb1);
        System.out.println("sb2 = " + sb2);



        Stack<Integer> s = new Stack<>();
        String[] arr = new String[]{"1","2","3"};
        List<String> linkedList = new LinkedList<String>(Arrays.asList(arr));
        ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(arr));

        s.add(5);
        s.add(15);
        s.add(25);
        s.add(35);
        s.add(45);

        System.out.println("s.pop() = " + s.pop());
        System.out.println("s.pop() = " + s.pop());

        System.out.println("s = " + s);

        // System.out.println("s.get(3) = " + s.get(3));


    }
}
