package Task1;

public class ArrayQueueADT {
    private int size;
    private int head;
    private int tail;
    private Object[] elements = new Object[10];

    static void fixCapacity(ArrayQueueADT queue, int capacity) {
        if (queue == null) {
            System.out.println("Queue is null");
            return;
        }
        int len = queue.elements.length;
        if (capacity > len) {
            Object[] newElements = new Object[queue.elements.length * 2];
            int i = 0;
            while (queue.tail != queue.head) {
                newElements[i] = queue.elements[queue.head];
                queue.head = (queue.head + 1) % len;
                i++;
            }
            queue.head = 0;
            queue.tail = len - 1;
            queue.elements = newElements;
        }
    }

    public static void enqueue(ArrayQueueADT queue, Object element) {
        if (queue == null) {
            System.out.println("Queue is null");
            return;
        }
        if (element == null) {
            System.out.println("Element is null");
            return;
        }
        fixCapacity(queue, queue.size + 2);
        queue.elements[queue.tail] = element;
        queue.tail = (queue.tail + 1) % queue.elements.length;
        queue.size++;
    }

    public static Object element(ArrayQueueADT queue) {
        if (queue == null) {
            System.out.println("Queue is null");
            return null;
        }
        assert queue.size > 0;
        return queue.elements[queue.head];
    }

    public static Object dequeue(ArrayQueueADT queue) {
        if (queue == null) {
            System.out.println("Queue is null");
            return null;
        }
        Object ret = element(queue);
        queue.elements[queue.head] = null;
        queue.head = (queue.head + 1) % queue.elements.length;
        queue.size--;
        return ret;
    }

    public static int size(ArrayQueueADT queue) {
        if (queue == null) {
            System.out.println("Queue is null");
            return 0;
        }
        return queue.size;
    }

    public static boolean isEmpty(ArrayQueueADT queue) {
        if (queue == null) {
            System.out.println("Queue is null");
            return false;
        }
        return (queue.size == 0);
    }

    public static void clear(ArrayQueueADT queue) {
        if (queue == null) {
            System.out.println("Queue is null");
            return;
        }
        queue.head = queue.tail = queue.size = 0;
    }

    public static void push(ArrayQueueADT queue, Object element) {
        if (queue == null) {
            System.out.println("Queue is null");
            return;
        }
        if (element == null) {
            System.out.println("Element is null");
            return;
        }
        fixCapacity(queue, queue.size + 2);
        queue.head = queue.head - 1;
        if (queue.head < 0) {
            queue.head = queue.elements.length - 1;
        }
        queue.elements[queue.head] = element;
        queue.size++;
    }

    public static Object peek(ArrayQueueADT queue) {
        if (queue == null) {
            System.out.println("Queue is null");
            return null;
        }
        if (queue.size == 0) {
            System.out.println("Queue is empty!");
            return null;
        }
        int ltail = queue.tail - 1;
        if (ltail < 0) {
            ltail = queue.elements.length - 1;
        }
        return queue.elements[ltail];
    }

    public static Object remove(ArrayQueueADT queue) {
        if (queue == null) {
            System.out.println("Queue is null");
            return null;
        }
        if (queue.size == 0) {
            System.out.println("Queue is empty!");
            return null;
        }
        queue.tail = queue.tail - 1;
        if (queue.tail < 0)
        {
            queue.tail = queue.elements.length - 1;
        }
        Object ret = queue.elements[queue.tail];
        queue.elements[queue.tail] = null;
        queue.size--;
        return ret;
    }
}
