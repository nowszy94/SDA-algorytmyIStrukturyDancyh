package test.algorytmy.structures.queue;

import algorytmy.structures.queue.FIFOQueue;
import algorytmy.structures.queue.Queue;

public class FIFOQueueTests {
    public static void main(String[] args) {
        Queue queue = new FIFOQueue();
        queue.push(2);
        queue.push(3);
        queue.push(4);
        System.out.println(queue);
        System.out.println(queue);

        Queue clonedQueue = queue.clone();
        System.out.println(clonedQueue);
        clonedQueue.pop();
        System.out.println(queue);
        System.out.println(clonedQueue);

        queue.pop();
        System.out.println(queue);
        queue.pop();
        queue.push(8);
        System.out.println(queue);
        queue.pop();
        System.out.println(queue);
        queue.pop();
    }
}
