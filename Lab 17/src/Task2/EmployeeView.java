package Task2;

public class EmployeeView {
    public void printEmployeeDetails(String name, double salary, double daysAfterPayday, double payment) {
        System.out.printf("Name: %s\nSalary: %.2f\nDays after payday: %.2f\nPayment: %.2f\n",
                name, salary, daysAfterPayday, payment);
    }
}
