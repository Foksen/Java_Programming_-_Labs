package Task3;

public class Person {
    private String fullName;
    private int age;

    public Person() {}

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void move() {
        System.out.println("Person " + fullName + " is moving");
    }

    public void talk() {
        System.out.println("Person " + fullName + " is talking");
    }
}
