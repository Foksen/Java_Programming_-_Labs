package Task2;

public class Dog implements Nameable {
    private final String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
