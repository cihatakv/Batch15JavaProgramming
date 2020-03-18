package day48;

public abstract class Employee {

    int id;
    String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;

    }

    public abstract void calculateAnnualSalary();

    public abstract String toString();


}
