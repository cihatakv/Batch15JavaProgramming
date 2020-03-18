package MyMentoring;

public class PersonAction {
    public static void main(String[] args) {

        Person p1 = new Person();

        Person p2 = new Person("John", 35);

        System.out.println(p1.name + " | " + p1.age);

        System.out.println(p2.name + " | " + p2.age);
        // p1.goForward();

    }
}
