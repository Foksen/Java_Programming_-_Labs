package Task2;

public class EmployeeController {
    private Employee model;
    private EmployeeView view;

    public EmployeeController(Employee model, EmployeeView view) {
        this.model = model;
        this.view = view;
    }

    public String getEmployeeName() {
        return model.getName();
    }

    public void setEmployeeName(String name) {
        model.setName(name);
    }

    public double getEmployeeSalary() {
        return model.getSalary();
    }

    public void setEmployeeSalary(double salary) {
        model.setSalary(salary);
    }

    public double getEmployeeDaysAfterPayday() {
        return model.getDaysAfterPayday();
    }

    public void setEmployeeDaysAfterPayday(double daysAfterPayday) {
        model.setDaysAfterPayday(daysAfterPayday);
    }

    public double getEmployeePayment() {
        return model.getSalary() * (model.getDaysAfterPayday() / 30);
    }

    public void updateView() {
        view.printEmployeeDetails(getEmployeeName(), getEmployeeSalary(),
                getEmployeeDaysAfterPayday(), getEmployeePayment());
    }
}
