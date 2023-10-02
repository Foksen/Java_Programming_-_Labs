import java.util.Formatter;

public class Student implements Comparable<Student> {
    private final String name;
    private final String surname;
    private final String specialization;
    private final int course;
    private final String group;
    private final int GPA;

    public Student(String name, String surname, String specialization, int course, String group, int GPA) {
        this.name = name;
        this.surname = surname;
        this.specialization = specialization;
        this.course = course;
        this.group = group;
        this.GPA = GPA;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getSpecialization() {
        return specialization;
    }

    public int getCourse() {
        return course;
    }

    public String getGroup() {
        return group;
    }

    public int getGPA() {
        return GPA;
    }

    @Override
    public String toString() {
        Formatter fmt = new Formatter();
        fmt.format("Имя:  %-20s Фамилия:  %-20s Специализация:  %-16s " +
                "Курс:  %-3s Группа:  %-12s Ср. балл:  %-5s", name, surname,
                specialization, course, group, GPA);
        return fmt.toString();
    }

    @Override
    public int compareTo(Student o) {
        return course - o.getCourse();
    }
}
