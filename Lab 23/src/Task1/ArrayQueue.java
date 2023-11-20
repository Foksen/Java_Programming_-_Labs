package Task1;

public class ArrayQueue {
    private int size;
    private int head;
    private int tail;
    //private int capacity;
    private Object[] elements = new Object[10];

    private void fixCapacity(int capacity) {
        int len = elements.length;
        if (capacity > len) {
            Object[] newElements = new Object[elements.length * 2];
            int i = 0;
            while (tail != head) {
                newElements[i] = elements[head];
                head = (head + 1) % len;
                i++;
            }
            head = 0;
            tail = len - 1;
            elements = newElements;
        }
    }

    public void enqueue(Object element) {
        if (element == null) {
            System.out.println("Element is null");
            return;
        }
        fixCapacity(size + 2);
        elements[tail] = element;
        tail = (tail + 1) % elements.length;
        size++;
    }

    public Object element() {
        if (size == 0) {
            System.out.println("Queue is empty!");
            return null;
        }
        return elements[head];
    }

    public Object dequeue() {
        Object elem = element();
        elements[head] = null;
        head = (head + 1) % elements.length;
        --size;
        return elem;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        head = tail = size = 0;
    }

    public void push(Object element) {
        assert element != null;
        fixCapacity(size + 2);
        head -= 1;
        if (head < 0) {
            head = elements.length - 1;
        }
        elements[head] = element;
        ++size;
    }

    public Object peek() {
        if (size == 0) {
            System.out.println("Queue is empty!");
            return null;
        }
        int ltail = tail - 1;
        if (ltail < 0) {
            ltail = elements.length - 1;
        }
        return elements[ltail];
    }

    public Object remove() {
        if (size == 0) {
            System.out.println("Queue is empty!");
            return null;
        }
        tail -= 1;
        if (tail < 0) {
            tail = elements.length - 1;
        }
        Object elem = elements[tail];
        elements[tail] = null;
        --size;
        return elem;
    }
}
