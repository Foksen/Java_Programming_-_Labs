package Task7;

public class Undergraduate extends Pupil {
    public Undergraduate(String name) {
        super(name);
    }

    @Override
    public void printInfo() {
        System.out.println(name + " - RTU MIREA");
    }
}
