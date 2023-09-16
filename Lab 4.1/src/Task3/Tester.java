package Task3;

public class Tester {
    public static void main(String[] args) {
        System.out.println("Task 3:\n");

        Person person1 = new Person();
        Person person2 = new Person("Igor", 15);

        person1.talk();
        person2.move();
    }
}
