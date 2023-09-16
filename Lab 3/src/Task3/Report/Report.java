package Task3.Report;

import java.util.Formatter;

public class Report {
    private static Formatter fmt = new Formatter();

    public static void generateReport() {
        System.out.println("--------------Отчёт о сотрудниках--------------");
        for (int i = 0; i < Employee.employers.length; ++i) {
            fmt.format("%3d. Name: %-15s %20s\n",
                    (i + 1),
                    (Employee.employers[i].getFullname()),
                    ("Salary: " + Employee.employers[i].getSalary()));
        }
        System.out.print(fmt);
        System.out.println("-----------------------------------------------");
    }
}
