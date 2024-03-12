package queue;

public class Queue {
    private int head;
    private int tail;
    private int[] arr;

    public Queue(int length) {
        if (length < 0) {
            length = 0;
        }

        this.arr = new int[length];
        this.head = this.tail = -1;
    }

    public boolean isEmpty() {
        return this.head == -1 && this.tail == -1;
    }

    public boolean isFull() {
        if (this.tail == -1) return false;

        return this.tail == this.arr.length - 1;
    }

    public Queue enqueue(int element) throws CannotAddToTheQueueException {
        if (this.tail == this.arr.length - 1) {
            throw new CannotAddToTheQueueException("the queue is full");
        }

        this.arr[++this.tail] = element;

        if (this.tail == 0) this.head = 0;

        return this;
    }

    public int dequeue() throws CannotRemoveFromTheQueueException {
        if (this.isEmpty()) {
            throw new CannotRemoveFromTheQueueException("the queue is empty");
        }

        int elementIndex = this.head++;

        if (this.head > this.tail) {
            this.head = this.tail = -1;
        }

        return this.arr[elementIndex];
    }

    public String peek() {
        return this.head >= 0 ? "" + this.head : "the queue is empty";
    }

    public String display() {
        if (this.isEmpty()) return "the queue is empty";

        StringBuilder queue = new StringBuilder();

        for (int i = this.head; i <= this.tail; i++) {
            queue.append(i == this.tail ? this.arr[i] : this.arr[i] + ", ");
        }

        return queue.toString();
    }

    public void delete() {
        this.head = this.tail = -1;
    }
}