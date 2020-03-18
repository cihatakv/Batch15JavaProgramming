package day64;

import java.util.*;


public class Deque_For_LIFO {
    public static void main(String[] args) {

        Deque<String> lifoQue = new LinkedList<>();
        lifoQue.add("review the class");
        lifoQue.add("do your homework");
        lifoQue.add("attend the class");
        lifoQue.add("say bye to Java");

        System.out.println(lifoQue.getFirst());

        System.out.println("lifoQue = " + lifoQue);
        lifoQue.removeLast();
        System.out.println("lifoQue = " + lifoQue);
        lifoQue.removeLast();
        System.out.println("lifoQue = " + lifoQue);
        lifoQue.removeLast();
        System.out.println("lifoQue = " + lifoQue);
        lifoQue.removeLast();
        System.out.println("lifoQue = " + lifoQue);

    }
}
