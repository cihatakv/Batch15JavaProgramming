package MyMentoring;

import java.util.*;

public class MyClass {
    private final int AGE;

    public MyClass(int age) {
        AGE = age;
    }

    public int getAGE() {
        return AGE;
    }
}

class MyPractice {
    public static void main(String[] args) {
        MyClass m = new MyClass(35);
        MyClass m1 = new MyClass(36);

        System.out.println("m1.getAGE() = " + m1.getAGE());

        System.out.println("m.getAGE() = " + m.getAGE());

        ArrayList<Integer> dropdown = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 1));

        System.out.println("List dropdown = " + dropdown);
        HashSet<Integer> optionsSet = new HashSet<>(dropdown);
        System.out.println("optionsSet = " + optionsSet);

        if (optionsSet.size() == dropdown.size()) {
            System.out.println("Expected is the same as actual");
        } else {
            System.out.println("Options contain duplicates");
        }

        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,1,3));
        Set<Integer> set = new HashSet<>(list);

        List<Integer> duplicates = new ArrayList<>();
        for (Integer eachSetElement : set) {
            int cnt = 0;
            for (Integer eachListElement : list) {
                if (eachListElement == eachSetElement)
                    cnt++;
            }
            if (cnt > 1)
                System.out.println("duplicates = " + eachSetElement);
        }


        PriorityQueue<String> priorityQueue = new PriorityQueue<>();
        priorityQueue.add("John");
        priorityQueue.add("Kate");
        priorityQueue.add("Tom");
        System.out.println("Queue: " + priorityQueue);

        Iterator iter = priorityQueue.iterator();
        while (iter.hasNext()) {
            System.out.println(priorityQueue.poll());
        }

//        System.out.println(priorityQueue.peek());
//        System.out.println(priorityQueue.poll());
//        System.out.println(priorityQueue);
    }
}
