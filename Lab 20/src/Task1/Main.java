package Task1;

import java.io.Serializable;

public class Main {
    public static void main(String[] args) {
        Integer t = 15;
        SerializableAnimal v = new SerializableAnimal("Dog", 12);
        String k = "hello";

        MyClass<Integer, SerializableAnimal, String> obj = new MyClass<>(t, v, k);
        obj.printClasses();
        System.out.println(obj.getT());
        System.out.println(obj.getV());
        System.out.println(obj.getK());
    }
}
