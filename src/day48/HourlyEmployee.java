package day48;

public class HourlyEmployee extends Employee {

    double hourlyWage;
    int numsOfHours;

    public HourlyEmployee(int id, String name, double hourlyWage, int numsOfHours) {
        super(id, name);
        this.hourlyWage = hourlyWage;
        this.numsOfHours = numsOfHours;
    }

    @Override
    public void calculateAnnualSalary() {
        double salary = hourlyWage * numsOfHours;
        System.out.println("Hourly employee's salary = " + salary);
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "hourlyWage=" + hourlyWage +
                ", numsOfHours=" + numsOfHours +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", Hourly employee's salary=" + hourlyWage * numsOfHours +
                '}';
    }
}
