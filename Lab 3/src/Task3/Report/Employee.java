package Task3.Report;

public class Employee {
    private final String fullname;
    private final double salary;

    public static Employee[] employers = new Employee[]{
            new Employee("Igor", 29990),
            new Employee("Sergey", 15990),
            new Employee("Anton", 4990)
    };

    private Employee(String fullname, double salary) {
        this.fullname = fullname;
        this.salary = salary;
    }

    public String getFullname() {
        return fullname;
    }

    public double getSalary() {
        return salary;
    }
}
