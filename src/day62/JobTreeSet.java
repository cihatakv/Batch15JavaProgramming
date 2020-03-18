package day62;

import day61.Job;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class JobTreeSet {

    public static void main(String[] args) {


        Job j1 = new Job("Austin", "Apple", 135000);
        Job j2 = new Job("Dallas", "Hilti", 145000);
        Job j3 = new Job("Austin", "Google", 125000);
        Job j4 = new Job("San Antonio", "USAA", 95000);
        Job j5 = new Job("Houston", "Exxon", 95000);

        SortedSet<Job> jobSet = new TreeSet<>(Arrays.asList(j1, j2, j3, j4, j5));

        System.out.println("-----WITH FOR EACH LOOP-----");
        for (Job each : jobSet) {
            System.out.println("each = " + each);
        }

//        System.out.println("-----WITH ITERATOR-----");
//        Iterator<Job> iterJob = jobSet.iterator();
//        while (iterJob.hasNext())
//            System.out.println("iterJob.next() = " + iterJob.next());


//        System.out.println("======QUEUE=======");
//        Queue<Job> jobQueue = new PriorityQueue<>(Arrays.asList(j2, j1, j3, j4, j5));
//
//        for (Job job : jobQueue) {
//            System.out.println("job = " + job);
//        }

    }
}
