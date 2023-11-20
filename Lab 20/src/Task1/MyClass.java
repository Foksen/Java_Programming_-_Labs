package Task1;

import java.io.Serializable;

public class MyClass <T extends Comparable<T>, V extends Animal & Serializable, K> {
    private T t;
    private V v;
    private K k;

    public MyClass(T t, V v, K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public T getT() {
        return t;
    }

    public V getV() {
        return v;
    }

    public K getK() {
        return k;
    }

    public void printClasses() {
        System.out.printf("%s %s %s\n", t.getClass().getName(), v.getClass().getName(), k.getClass().getName());
    }
}
