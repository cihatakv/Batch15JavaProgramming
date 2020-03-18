package day38;

import java.util.ArrayList;
import java.util.List;

public class TaskFromAkbarGradesList {
    public static void main(String[] args) {
        List<String> grades = new ArrayList<>();
        grades.add("79");
        grades.add("54");
        grades.add("100");
        grades.add("65");
        grades.add("44");
        grades.add("85");
        grades.add("75");
        grades.add("35");
        grades.add("95");
        grades.add("97");

        printPassFail(grades);
        System.out.println("======");
        cntAbove90(grades);
        System.out.println("======");
        averageScore(grades);
        System.out.println("======");
        updateValues(grades);
    }

    public static void printPassFail(List<String> list1) {
        // print pass if its more than 60 fail if not
        for (int i = 0; i < list1.size(); i++) {
            if (Integer.parseInt(list1.get(i)) > 60)
                System.out.println(Integer.parseInt(list1.get(i)) + " -> Pass");
            else
                System.out.println(Integer.parseInt(list1.get(i)) + " -> Fail");
        }
    }

    public static void cntAbove90(List<String> list1) {
        int cntAbove90 = 0;
        // count how many score are more than 90
        for (int i = 0; i < list1.size(); i++) {
            if (Integer.parseInt(list1.get(i)) > 90)
                cntAbove90++;
        }
        System.out.println(cntAbove90 + " grades are above 90");
    }

    public static void averageScore(List<String> list1) {
        int sumOfAllGrades = 0;

        for (int i = 0; i < list1.size(); i++) {
            sumOfAllGrades += Integer.parseInt(list1.get(i));
        }
        System.out.println("Average grade is " + (sumOfAllGrades / list1.size()));
    }

    public static void updateValues(List<String> list1) {
        for (int i = 0; i < list1.size(); i++) {
            int grade = Integer.parseInt(list1.get(i));
            if (grade > 90)
                list1.set(i, grade + "A");
            else if (grade > 80)
                list1.set(i, grade + "B");
            else if (grade > 70)
                list1.set(i, grade + "C");
            else if (grade > 60)
                list1.set(i, grade + "D");
            else
                list1.set(i, grade + "F");
        }
        System.out.println("list1 = " + list1);
    }
}
/*
Given a ArrayList of 10 String(yes String) as scores "79" , "54" , "100", "65", "44"....
* print pass if its more than 60 fail if not
* count how many score are more than 90
* get the average score
* update the values with score-grade pair
  for example
79C , 54F, 100A, 65D, 44F , 89B , 95A
Optionally create 4 methods according to above criteria
*/