package Task2;

public class Main {
    public static void main(String[] args) {
        Employee model = retrieveEmployeeFromDB();
        EmployeeView view = new EmployeeView();
        EmployeeController controller = new EmployeeController(model, view);

        controller.updateView();
        controller.setEmployeeName("Sergey");
        controller.setEmployeeSalary(3500);
        controller.setEmployeeDaysAfterPayday(2);
        controller.updateView();
    }

    public static Employee retrieveEmployeeFromDB() {
        Employee employee = new Employee();
        employee.setName("Igor");
        employee.setSalary(2000);
        employee.setDaysAfterPayday(14);
        return employee;
    }
}
