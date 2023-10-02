package Task2;

public class Tester {
    public static void main(String[] args) {
        Nameable[] entities = new Nameable[] {
                new Human("Игорь"),
                new Dog("Шарик"),
                new Human("Антон"),
                new Dog("Рыжик")
        };
        for (Nameable entity : entities) {
            System.out.println("Сущность: " + entity.getName());
        }
    }
}
