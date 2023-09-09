package Program5;

public class Kennel {
    private final int DOG_CAPACITY = 10;
    private int k = 0;
    private Dog[] dogs;

    public Kennel() {
        dogs = new Dog[DOG_CAPACITY];
    }

    public Boolean addDog(String name, int age) {
        if (k < DOG_CAPACITY) {
            dogs[k++] = new Dog(name, age);
            return true;
        }
        return false;
    }

    public void printInfo() {
        System.out.println("Kennel info: ");
        for (int i = 0; i < k; ++i) {
            System.out.println(dogs[i].toString());
        }
        System.out.println();
    }
}
