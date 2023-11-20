package Task1;

import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        ArrayQueueModule.push(1);
        System.out.println(ArrayQueueModule.element());
        ArrayQueueModule.push(2);
        System.out.println(ArrayQueueModule.element());
        ArrayQueueModule.dequeue();
        System.out.println(ArrayQueueModule.element());
        ArrayQueueModule.dequeue();
        System.out.println(ArrayQueueModule.element());

        ArrayQueueADT queueADT = new ArrayQueueADT();
        ArrayQueueADT.push(queueADT, 1);
        System.out.println(ArrayQueueADT.element(queueADT));
        ArrayQueueADT.push(queueADT,2);
        System.out.println(ArrayQueueADT.element(queueADT));
        ArrayQueueADT.dequeue(queueADT);
        System.out.println(ArrayQueueADT.element(queueADT));
        ArrayQueueADT.dequeue(queueADT);
        System.out.println(ArrayQueueADT.element(queueADT));

        ArrayQueue queue = new ArrayQueue();
        queue.push(1);
        System.out.println(queue.element());
        queue.push(2);
        System.out.println(queue.element());
        queue.dequeue();
        System.out.println(queue.element());
        queue.dequeue();
        System.out.println(queue.element());
    }
}
