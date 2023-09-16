package Task7;

public class Tester {
    public static void main(String[] args) {
        System.out.println("Task 7:\n");

        Pupil[] pupils = new Pupil[] {
                new Student("Andrew"),
                new Undergraduate("Igor"),
                new Student("Artemiy"),
                new Student("Anton"),
                new Undergraduate("Sergey")
        };

        System.out.println("Pupils:");
        for (Pupil pupil : pupils) {
            pupil.printInfo();
        }

        System.out.println("\nStudents:");
        for (int i = 0; i < pupils.length; ++i) {
            if (pupils[i].getClass() == Student.class) {
                pupils[i].printInfo();
            }
        }

        System.out.println("\nUndergraduate:");
        for (int i = 0; i < pupils.length; ++i) {
            if (pupils[i].getClass() == Undergraduate.class) {
                pupils[i].printInfo();
            }
        }
    }
}
