package day61;

import java.util.*;

public class JobHunter {
    public static void main(String[] args) {

        Job j1 = new Job("Austin", "Apple", 135000);
        Job j2 = new Job("Dallas", "Hilti", 145000);
        Job j3 = new Job("Austin", "Google", 125000);
        Job j4 = new Job("San Antonio", "USAA", 95000);
        Job j5 = new Job("Houston", "Exxon", 90000);

        List<Job> jobList = new LinkedList<>(Arrays.asList(j1, j2, j3, j4, j5));

        System.out.println("(BEFORE SORTING) jobList : \n==========================");

        for (Job each : jobList) {
            System.out.println(each);
        }

        Collections.sort(jobList);

        System.out.println("(AFTER SORTING) jobList : \n=========================");

        for (Job each : jobList) {
            System.out.println(each);
        }

        Iterator<Job> myIter = jobList.iterator();

        while (myIter.hasNext()) {
            if (myIter.next().getSalary() < 100000)
                myIter.remove();
        }

        System.out.println("(AFTER REMOVING) jobList : \n=========================");

        for (Job each : jobList) {
            System.out.println(each);
        }
    }
}


/*
while (myIter.hasNext()) {

//            System.out.println("myIter.next() = " + myIter.next());
            if (myIter.next() <= 10) {
                myIter.remove();
            }

        }
 */