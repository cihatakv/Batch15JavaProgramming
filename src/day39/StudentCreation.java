package day39;

public class StudentCreation {

    public static void main(String[] args) {

        // how do we create an object out of template

        Student s1 = new Student();

        s1.name = "Cihat";
        s1.age = 34;
        s1.gender = 'M';

        Student s2 = new Student();
        s2.name = "Juma";
        s2.age = 31;
        s2.gender = 'M';

        System.out.println("s2 age = " + s2.age);

        s2.age = 28;

        System.out.println(s2.name + " | " + s2.age + " | " + s2.gender);


    }

}
