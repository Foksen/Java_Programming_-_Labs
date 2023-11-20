package Task1;

import java.io.Serializable;

public class SerializableAnimal extends Animal implements Serializable {
    private static final long serialVersionUID = 1L;

    public SerializableAnimal(String name, int age) {
        super(name, age);
    }
}
