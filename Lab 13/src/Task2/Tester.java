package Task2;

public class Tester {
    public static void main(String[] args) {
        Person p1 = new Person("Жолобов", "Игорь", "Вадимович");
        Person p2 = new Person("Агапкин", "Артём");
        Person p3 = new Person("Смирнов");

        System.out.println(p1.getInitials());
        System.out.println(p2.getInitials());
        System.out.println(p3.getInitials());
    }
}
