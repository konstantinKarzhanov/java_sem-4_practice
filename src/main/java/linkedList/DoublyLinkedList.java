package linkedList;

public class DoublyLinkedList {
    public Node head;
    public Node tail;
    public int size;

    public class Node {
        public int value;
        public Node prev;
        public Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public DoublyLinkedList() {}

    public DoublyLinkedList(int value) {
        Node node = new Node(value);

        this.head = node;
        this.tail = node;
        this.size = 1;
    }

    public DoublyLinkedList insertFirst(int value) {
        Node node = new Node(value);

        if (this.head == null) {
            this.head = node;
            this.tail = node;
        } else {
            node.next = this.head;
            this.head.prev = node;
            this.head = node;
        }

        this.size++;

        return this;
    }

    public DoublyLinkedList insertLast(int value) {
        Node node = new Node(value);

        if (this.head == null) {
            this.head = node;
            this.tail = node;
        } else {
            node.prev = this.tail;
            this.tail.next = node;
            this.tail = node;
        }

        this.size++;

        return this;
    }

    public DoublyLinkedList insertAtIndex(int value, int index) {
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
        node.prev = tempNode;
        tempNode.next = node;
        node.next.prev = node;

        this.size++;

        return this;
    }

    public boolean deleteFirst() {
        boolean isDeleted = false;

        if (this.head != null) {
            Node node = this.head.next;
            this.head.next = null;
            node.prev = null;
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

            tempNode.next = null;
            this.tail.prev = null;
            this.tail = tempNode;

            this.size--;

            isDeleted = true;
        }

        return isDeleted;
    }

    public boolean deleteAtIndex(int index) {
        boolean isDeleted = false;

        if (index == 0) {
            isDeleted = this.deleteFirst();
        } else if (this.size <= index) {
            isDeleted = this.deleteLast();
        } else {
            Node tempNode = this.head;

            for (int i = 0; i < index - 1; i++) {
                tempNode = tempNode.next;
            }

            Node node = tempNode.next;
            tempNode.next = node.next;
            node.next.prev = tempNode;
            node.next = null;
            node.prev = null;

            this.size--;

            isDeleted = true;
        }

        return isDeleted;
    }

    public boolean contains(int value) {
        boolean isContains = false;

        if (this.head != null) {
            Node tempNode = this.head;

            for (int i = 0; i < this.size; i++) {
                if (tempNode.value == value) {
                    isContains = true;

                    break;
                }

                tempNode = tempNode.next;
            }
        }

        return isContains;
    }

    public int indexOf(int value) {
        int index = -1;

        if (this.head != null) {
            Node tempNode = this.head;

            for (int i = 0; i < this.size; i++) {
                if (tempNode.value == value) {
                    index = i;

                    break;
                }

                tempNode = tempNode.next;
            }
        }

        return index;
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

    public void traverseBackwards() {
        if (this.head == null) {
            System.out.println("The linked list is empty");
            return;
        }

        Node tempNode = this.tail;

        for (int i = this.size; i > 0; i--) {
            System.out.print(tempNode.value);

            if (i != 1) System.out.print(" -> ");
            tempNode = tempNode.prev;
        }

        System.out.println();
    }
}
