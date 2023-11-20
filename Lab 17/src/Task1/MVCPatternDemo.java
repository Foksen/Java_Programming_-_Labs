package Task1;

public class MVCPatternDemo {
    public static void main(String[] args) {
        Student model = retrieveStudentFromDatabase();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);

        controller.updateView();
        controller.setStudentName("Anton");
        controller.setStudentRollNo("4");
        controller.updateView();
    }

    public static Student retrieveStudentFromDatabase() {
        Student student = new Student();
        student.setName("Igor");
        student.setRollNo("7");
        return student;
    }
}
