package day41;

public class Person {
    private String name;
    private int age;
    private long ssn;


    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        age = newAge;
    }

    public void setSsn(long newSsn) {
        ssn = newSsn;
    }

    public void setAll(String newName, int newAge, long newSsn) {
        name = newName;
        age = newAge;
        ssn = newSsn;

    }


    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", ssn=" + ssn +
                '}';
    }
}