package day47;

public class FinalVariablePractice {

    public static void main(String[] args) {

        final int x;
        x = 10;


        final int a = 20;

        final Student s1 = new Student(101);

        // s1 = new Student(102);

        // s1.studentID = 200;

        System.out.println("s1.studentID = " + s1.studentID);
        System.out.println("s1.school = " + s1.school);


        System.out.println("Student.school = " + Student.school);

    }
}
