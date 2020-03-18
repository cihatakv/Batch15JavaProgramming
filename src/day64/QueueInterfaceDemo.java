package day64;

import java.util.*;

public class QueueInterfaceDemo {
    public static void main(String[] args) {

        Queue<String> taskQueue = new LinkedList<>();
        taskQueue.add("review the class");
        taskQueue.add("do your homework");
        taskQueue.add("attend the class");
        taskQueue.add("say bye to Java");

        System.out.println("taskQueue = " + taskQueue);
        taskQueue.remove();
        System.out.println("taskQueue = " + taskQueue);
        taskQueue.remove();
        System.out.println("taskQueue = " + taskQueue);
        taskQueue.remove();
        System.out.println("taskQueue = " + taskQueue);


    }
}
