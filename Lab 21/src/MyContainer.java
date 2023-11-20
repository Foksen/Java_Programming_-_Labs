public class MyContainer <T> {
    private T container[];

    public MyContainer(T[] container) {
        this.container = container;
    }

    public T[] getContainer() {
        return container;
    }
}
