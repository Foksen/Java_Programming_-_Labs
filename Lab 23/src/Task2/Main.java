package Task2;

import Task2.ArrayQueue;

public class Main {
    public static void main(String[] args) {
        ArrayQueue arrayQueue = new ArrayQueue();
        arrayQueue.enqueue(1);
        System.out.println(arrayQueue.element());
        arrayQueue.enqueue(2);
        System.out.println(arrayQueue.element());
        arrayQueue.dequeue();
        System.out.println(arrayQueue.element());
        arrayQueue.dequeue();
        System.out.println(arrayQueue.element());

        LinkedQueue linkedQueue = new LinkedQueue();
        linkedQueue.enqueue(1);
        System.out.println(linkedQueue.element());
        linkedQueue.enqueue(2);
        System.out.println(linkedQueue.element());
        linkedQueue.dequeue();
        System.out.println(linkedQueue.element());
        linkedQueue.dequeue();
        System.out.println(linkedQueue.element());
    }
}
