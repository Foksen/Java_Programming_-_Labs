package Task2;

public abstract class AbstractQueue {
    protected int size = 0;

    public void enqueue(Object elem) {
        if (elem == null) {
            System.out.println("Elem is null");
            return;
        }
        enqueueImpl(elem);
        size++;
    }

    protected abstract void enqueueImpl(Object elem);

    public Object element() {
        if (size == 0) {
            System.out.println("Queue is empty!");
            return null;
        }
        return elementImpl();
    }

    protected abstract Object elementImpl();

    public Object dequeue() {
        Object result = element();
        dequeueImpl();
        size--;
        return result;
    }

    protected abstract void dequeueImpl();

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        clearImpl();
        size = 0;
    }

    public Object[] toArray() {
        Object[] temp = new Object[size()];
        for (int i = 0; i < size(); i++) {
            temp[i] = dequeue();
            enqueue(temp[i]);
        }
        return temp;
    }

    protected abstract void clearImpl();

    protected abstract AbstractQueue createCopy();
}
