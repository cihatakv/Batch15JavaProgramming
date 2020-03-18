package day61;

public class Job implements Comparable<Job> {

    private String location;
    private String companyName;
    private int salary;

    public Job(String location, String companyName, int salary) {
        setLocation(location);
        setCompanyName(companyName);
        setSalary(salary);
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Job{" +
                "location='" + location + '\'' +
                ", companyName='" + companyName + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Job o) {
        if (this.salary > o.getSalary())
            return 1;
        else if (this.salary < o.getSalary())
            return -1;
        else {
            return 0;
        }

//        return Comparator.comparing(Job::getSalary)
//                .thenComparing(Job::getLocation)
//                .compare(this, o);

    }


}


/*

return Comparator.comparing(Person::getAge)
                .thenComparing(Job::getName)
                .compare(this, o);


 */