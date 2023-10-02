import java.util.Arrays;
import java.util.Comparator;

public class Main {
    private static Student[] students1;
    private static Student[] students2;

    public static void main(String[] args) {
        setArray();

        outArray(students1);
        SelectionSort.sort(students1);
        outArray(students1);

        outArray(students2);
        QuickSort.sort(students2, new CompGPA());
        outArray(students2);

        Student[] students = new Student[students1.length + students2.length];
        System.arraycopy(students1, 0, students, 0, students1.length);
        System.arraycopy(students2, 0, students, students1.length, students2.length);
        MergeSort.sort(students);
        outArray(students);
    }

    private static void setArray() {
        students1 = new Student[] {
                new Student("Игорь", "Жолобов",
                        "Прог. инж.", 2, "ИКБО-16-22", 20),
                new Student("Марк", "Иванов",
                        "Прик. инф.", 3, "ИНБО-03-21", 15),
                new Student("Иван", "Смирнов",
                        "Историк", 1, "КВВБ-01-23", 5),
                new Student("Вася", "Пупкин",
                        "Прог. инж.", 2, "ИКБО-13-22", 10),
                new Student("Константин", "Константинопольский",
                        "Экономист", 4, "ИЛБО-02-20", 15)
        };

        students2 = new Student[] {
                new Student("Аркадий", "Молотков",
                        "Физик", 3, "ФИЗО-14-21", 25),
                new Student("Матвей", "Фролов",
                        "Математик", 2, "МММО-15-22", 20),
                new Student("Павел", "Павлов",
                        "Прог. инж.", 4, "ИКБО-07-20", 15),
                new Student("Сергей", "Карпов",
                        "Техник", 4, "РПОК-12-20", 10),
                new Student("Роман", "Романов",
                        "Прик. инф.", 3, "АБВГ-16-21", 20)
        };
    }

    private static void outArray(Student[] arr) {
        for (Student student : arr) {
            System.out.println(student);
        }
        System.out.println();
    }
}