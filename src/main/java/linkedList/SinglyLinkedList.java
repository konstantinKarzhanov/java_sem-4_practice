package linkedList;

public class SinglyLinkedList {
    public Node head;
    public Node tail;
    public int size;

    public class Node {
        public int value;
        public Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public SinglyLinkedList() {}

    public SinglyLinkedList(int value) {
        Node node = new Node(value);

        this.head = node;
        this.tail = node;
        this.size = 1;
    }

    public SinglyLinkedList insertFirst(int value) {
        Node node = new Node(value);

        if (this.head == null) {
            this.head = node;
            this.tail = node;
        } else {
            node.next = this.head;
            this.head = node;
        }

        this.size++;

        return this;
    }

    public SinglyLinkedList insertLast(int value) {
        Node node = new Node(value);

        if (this.head == null) {
            this.head = node;
            this.tail = node;
        } else {
            this.tail.next = node;
            this.tail = node;
        }

        this.size++;

        return this;
    }

    public SinglyLinkedList insertAtIndex(int value, int index) {
        if (index == 0) {
            return this.insertFirst(value);
        } else if (this.size <= index) {
            return this.insertLast(value);
        }

        Node tempNode = this.head;

        for (int i = 0; i < index - 1; i++) {
            tempNode = tempNode.next;
        }

        Node node = new Node(value);

        node.next = tempNode.next;
        tempNode.next = node;

        this.size++;

        return this;
    }

    public void traverse() {
        if (this.head == null) {
            System.out.println("The linked list is empty");
            return;
        }

        Node tempNode = this.head;

        for (int i = 0; i < this.size; i++) {
            System.out.print(tempNode.value);

            if (i != this.size - 1) System.out.print(" -> ");
            tempNode = tempNode.next;
        }

        System.out.println();
    }

    public boolean deleteFirst() {
        boolean isDeleted = false;

        if (this.head != null) {
            Node node = this.head.next;
            this.head.next = null;
            this.head = node;

            this.size--;

            isDeleted = true;
        }

        return isDeleted;
    }

    public boolean deleteLast() {
        boolean isDeleted = false;

        if (this.head != null) {
            Node tempNode = this.head;

            for (int i = 0; i < this.size - 2; i++) {
                tempNode = tempNode.next;
            }

            this.tail = tempNode;
            this.tail.next = null;

            this.size--;

            isDeleted = true;
        }

        return isDeleted;
    }

    public boolean deleteAtIndex(int index) {
        if (index == 0) {
            return this.deleteFirst();
        } else if (index >= this.size){
            return this.deleteLast();
        }

        boolean isDeleted = false;

        Node tempNode = this.head;

        for (int i = 0; i < index - 1; i++) {
            tempNode = tempNode.next;
        }

        Node node = tempNode.next;
        tempNode.next = node.next;
        node.next = null;

        this.size--;

        isDeleted = true;

        return isDeleted;
    }
}
