package day48;

public class HR_Action {
    public static void main(String[] args) {
        // Cannot create abstract class object

        HourlyEmployee h1 = new HourlyEmployee(101, "Cihat", 67, 2080);
        h1.calculateAnnualSalary();
        System.out.println("h1 = " + h1);

        HourlyEmployee e1 = new HourlyEmployee(102, "Subi", 55, 2000);
        e1.calculateAnnualSalary();

        System.out.println("e1 = " + e1);

        HourlyEmployee e2 = new HourlyEmployee(103, "Roksana", 57, 2080);
        e2.calculateAnnualSalary();
        System.out.println("e2 = " + e2);

        FullTimeEmployee e3 = new FullTimeEmployee(104, "Ainura", 10000);
        e3.calculateAnnualSalary();
        System.out.println("e3 = " + e3);

        FullTimeEmployee e4 = new FullTimeEmployee(105, "Dennis", 13000);
        e4.calculateAnnualSalary();
        System.out.println("e4 = " + e4);


    }
}
