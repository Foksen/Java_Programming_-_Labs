package Task7;

public class Student extends Pupil {
    protected Student(String name) {
        super(name);
    }

    @Override
    public void printInfo() {
        System.out.println(name + " - Gymnasia 2");
    }
}
