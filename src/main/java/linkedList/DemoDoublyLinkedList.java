package linkedList;

public class DemoDoublyLinkedList {
    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();

        doublyLinkedList
                .insertLast(0)
                .insertLast(1)
                .insertFirst(2)
                .insertFirst(3)
                .insertAtIndex(4, 2);

        doublyLinkedList.traverse();
        doublyLinkedList.traverseBackwards();
    }
}
