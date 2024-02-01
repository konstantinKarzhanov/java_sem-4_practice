package linkedList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class TestSinglyLinkedList {
    SinglyLinkedList linkedList;

    @Test
    public void testEmptyLinkedList() {
        this.linkedList = new SinglyLinkedList();

        Assertions.assertNull(this.linkedList.head);
        Assertions.assertNull(this.linkedList.tail);
        Assertions.assertTrue(this.linkedList.size == 0);
    }

    @Test
    public void testInsertFirst() {
        this.linkedList = new SinglyLinkedList();
        int[] arr = { 1, 2, 3, 4 };
        int[] reversedArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            this.linkedList.insertFirst(arr[i]);
            reversedArr[arr.length - 1 - i] = arr[i];
        }

        Assertions.assertEquals(arr.length, this.linkedList.size);
        Assertions.assertArrayEquals(reversedArr, new int[] {
                this.linkedList.head.value,
                this.linkedList.head.next.value,
                this.linkedList.head.next.next.value,
                this.linkedList.tail.value
        });
    }

    @Test
    public void testInsertLast() {
        this.linkedList = new SinglyLinkedList();
        int[] arr = { 1, 2, 3, 4 };

        for (int element : arr) {
            this.linkedList.insertLast(element);
        }

        Assertions.assertEquals(arr.length, this.linkedList.size);
        Assertions.assertArrayEquals(arr, new int[] {
                this.linkedList.head.value,
                this.linkedList.head.next.value,
                this.linkedList.head.next.next.value,
                this.linkedList.tail.value
        });
    }

    @Test
    public void testInsertAtIndex() {
        this.linkedList = new SinglyLinkedList();
        int[] arr = {1, 2, 3, 4};

        this.linkedList
                .insertAtIndex(arr[0], 0)
                .insertAtIndex(arr[1], 1)
                .insertAtIndex(arr[2], 1)
                .insertAtIndex(arr[3], 0);

        Assertions.assertEquals(arr.length, this.linkedList.size);
        Assertions.assertArrayEquals(new int[] { 4, 1, 3, 2 }, new int[] {
                this.linkedList.head.value,
                this.linkedList.head.next.value,
                this.linkedList.head.next.next.value,
                this.linkedList.tail.value
        });
    }

    @Test
    public void testDeleteFirst() {
        this.linkedList = new SinglyLinkedList();
        int[] arr = { 1, 2, 3, 4 };

        for (int element : arr) {
            this.linkedList.insertLast(element);
        }

        this.linkedList.deleteFirst();

        Assertions.assertEquals(arr.length - 1, this.linkedList.size);
        Assertions.assertArrayEquals(Arrays.copyOfRange(arr, 1, arr.length), new int[] {
                this.linkedList.head.value,
                this.linkedList.head.next.value,
                this.linkedList.tail.value
        });
    }

    @Test
    public void testDeleteLast() {
        this.linkedList = new SinglyLinkedList();
        int[] arr = { 1, 2, 3, 4 };

        for (int element : arr) {
            this.linkedList.insertLast(element);
        }

        this.linkedList.deleteLast();

        Assertions.assertEquals(arr.length - 1, this.linkedList.size);
        Assertions.assertArrayEquals(Arrays.copyOfRange(arr, 0, arr.length - 1), new int[] {
                this.linkedList.head.value,
                this.linkedList.head.next.value,
                this.linkedList.tail.value
        });
    }

    @Test
    public void testDeleteAtIndex() {
        this.linkedList = new SinglyLinkedList();
        int[] arr = { 1, 2, 3, 4 };

        for (int element : arr) {
            this.linkedList.insertLast(element);
        }

        this.linkedList.deleteAtIndex(1);

        Assertions.assertEquals(arr.length - 1, this.linkedList.size);
        Assertions.assertArrayEquals(new int[] { 1, 3, 4 }, new int[] {
                this.linkedList.head.value,
                this.linkedList.head.next.value,
                this.linkedList.head.next.next.value
        });
    }
}
