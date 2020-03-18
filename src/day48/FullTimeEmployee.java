package day48;

public class FullTimeEmployee extends Employee {

    double monthlySalary;

    public FullTimeEmployee(int id, String name, double monthlySalary) {
        super(id, name);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public void calculateAnnualSalary() {
        double salary = monthlySalary * 12;
        System.out.println("Full Time Employee's salary = " + salary);

    }

    @Override
    public String toString() {
        return "FullTimeEmployee{" +
                "monthlySalary=" + monthlySalary +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", FulTime Employee's Salary='" + monthlySalary * 12 +
                '}';
    }
}
