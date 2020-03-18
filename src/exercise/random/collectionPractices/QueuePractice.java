package exercise.random.collectionPractices;

import java.util.*;

public class QueuePractice {
    public static void main(String[] args) {

        // Queue Methods
        // boolean add(object);
        // Object remove();
        // Object element();
        // Object peek();
        // Object poll;
        // boolean offer(object);

//        List obj = new ArrayList();
//
//        obj.add(1);
//        obj.add("a");
//
//        System.out.println("obj = " + obj);

        System.out.println("===========Queue=========");

        PriorityQueue<Integer> queue = new PriorityQueue<>();

        try {
            System.out.println("queue.peek() = " + queue.peek());
            System.out.println("queue.element() = " + queue.element());
        } catch (Exception e) {
            System.out.println("There is no element in the Queue");
        }

        for (int i = 10; i > 0; i--) {
            // boolean add(object);
            queue.add(i);
        }

        System.out.println("queue.element() = " + queue.element());

        queue.remove();

        System.out.println("After 1st remove() method - queue = " + queue);

        queue.remove();

        System.out.println("After 2nd remove() method - queue = " + queue);

        System.out.println("queue.element() = " + queue.element());

        queue.remove();

        System.out.println("queue.element() = " + queue.element());

        // Queue: (Front) 10 9 8 7 6 5 4 3 2 1 (Rear)
        // PriorityQueue sorts the data for us
        // Queue: (Front) 1 2 3 4 5 6 7 8 9 10 (Rear)

//        System.out.println("queue = " + queue);

        // Peeking -> Obtaining the head of Queue : 1

        System.out.println("queue.peek() = " + queue.peek()); // Peek, gets the head of Queue
        System.out.println("queue = " + queue);

        // Polling -> remove the head of the Queue
        queue.poll(); // Pool , removes the head
        System.out.println("After 1st Polling the queue = " + queue);
        System.out.println("queue.peek() = " + queue.peek());

        queue.poll();
        System.out.println("After 2nd Polling the queue = " + queue);
        System.out.println("queue.peek() = " + queue.peek());


        System.out.println("===========String Queue=========");
        Queue<String> queue1 = new PriorityQueue<>();
        for (int i = 10; i > 0; i--) {
            queue1.add(i + ". Element");
        }

        System.out.println("queue1 = " + queue1);

        System.out.println("===========Deque=========");
        Deque<String> arrayDeque = new ArrayDeque<>();

        for (int i = 10; i > 0; i--) {
            arrayDeque.add(i + ". Element");
        }

        System.out.println("arrayDeque = " + arrayDeque);

        System.out.println("arrayDeque.peek() = " + arrayDeque.peek());
        arrayDeque.poll();
        System.out.println("arrayDeque = " + arrayDeque);




    }



}
