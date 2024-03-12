package queue;

public class DemoQueue {
    public static void main(String[] args) throws CannotAddToTheQueueException, CannotRemoveFromTheQueueException{
        Queue queue = new Queue(10);

        System.out.println("Peek: " + queue.peek()); // Peek: the queue is empty

        queue
            .enqueue(1)
            .enqueue(2)
            .enqueue(3)
            .enqueue(4)
            .enqueue(5)
            .enqueue(6)
            .enqueue(7)
            .enqueue(8)
            .enqueue(9)
            .enqueue(10);
//            .enqueue(11); // will throw 'CannotAddToTheQueueException'

        System.out.println("Initial queue: " + queue.display()); // Initial queue: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
        System.out.println("Peek: " + queue.peek()); // Peek: 0

        System.out.println("Pop: " + queue.dequeue()); // Pop: 1
        System.out.println("Pop: " + queue.dequeue()); // Pop: 2
        System.out.println("Pop: " + queue.dequeue()); // Pop: 3

//        System.out.println("Pop: " + queue.dequeue());
//        System.out.println("Pop: " + queue.dequeue());
//        System.out.println("Pop: " + queue.dequeue());
//        System.out.println("Pop: " + queue.dequeue());
//        System.out.println("Pop: " + queue.dequeue());
//        System.out.println("Pop: " + queue.dequeue());
//        System.out.println("Pop: " + queue.dequeue());
//        System.out.println("Pop: " + queue.dequeue()); // will throw 'CannotRemoveFromTheQueueException'


        System.out.println("Current queue: " + queue.display()); // Current queue: 4, 5, 6, 7, 8, 9, 10
        System.out.println("Peek: " + queue.peek()); // Peek: 3

        queue.delete();
        System.out.println("After 'delete': " + queue.display()); // the queue is empty

        System.out.println("Is Empty: " + queue.isEmpty());
        System.out.println("Is Full: " + queue.isFull());
    }
}
