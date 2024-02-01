package linkedList;

public class DemoSinglyLinkedList {
    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList(0);

        singlyLinkedList
                .insertFirst(1)
                .insertLast(2)
                .insertAtIndex(3, 1);

        singlyLinkedList.traverse();
    }

}
