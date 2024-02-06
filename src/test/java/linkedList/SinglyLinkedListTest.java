package linkedList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class SinglyLinkedListTest {
    SinglyLinkedList singlyLinkedList;

    @Test
    public void testDefaultConstructor() {
        this.singlyLinkedList = new SinglyLinkedList();

        Assertions.assertTrue(this.singlyLinkedList.size == 0);

        Assertions.assertNull(this.singlyLinkedList.head);
        Assertions.assertNull(this.singlyLinkedList.tail);
    }

    @Test
    public void testParameterizedConstructor() {
        int value = 1;
        this.singlyLinkedList = new SinglyLinkedList(value);

        Assertions.assertTrue(this.singlyLinkedList.size == 1);

        Assertions.assertNull(this.singlyLinkedList.head.next);
        Assertions.assertNull(this.singlyLinkedList.tail.next);

        Assertions.assertEquals(value, this.singlyLinkedList.head.value);
        Assertions.assertEquals(value, this.singlyLinkedList.tail.value);
    }

    @Test
    public void testInsertFirst() {
        this.singlyLinkedList = new SinglyLinkedList();
        int[] arr = { 1, 2, 3, 4 };
        int[] reversedArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            this.singlyLinkedList.insertFirst(arr[i]);
            reversedArr[reversedArr.length - 1 - i] = arr[i];
        }

        Assertions.assertEquals(arr.length, this.singlyLinkedList.size);
        Assertions.assertArrayEquals(reversedArr, new int[] {
                this.singlyLinkedList.head.value,
                this.singlyLinkedList.head.next.value,
                this.singlyLinkedList.head.next.next.value,
                this.singlyLinkedList.tail.value
        });
    }

    @Test
    public void testInsertLast() {
        this.singlyLinkedList = new SinglyLinkedList();
        int[] arr = { 1, 2, 3, 4 };

        for (int element : arr) {
            this.singlyLinkedList.insertLast(element);
        }

        Assertions.assertEquals(arr.length, this.singlyLinkedList.size);
        Assertions.assertArrayEquals(arr, new int[] {
                this.singlyLinkedList.head.value,
                this.singlyLinkedList.head.next.value,
                this.singlyLinkedList.head.next.next.value,
                this.singlyLinkedList.tail.value
        });
    }

    @Test
    public void testInsertAtIndex() {
        this.singlyLinkedList = new SinglyLinkedList();
        int[] arr = { 1, 2, 3, 4 };

        this.singlyLinkedList
                .insertAtIndex(arr[0], 0)
                .insertAtIndex(arr[1], 1)
                .insertAtIndex(arr[2], 1)
                .insertAtIndex(arr[3], 0);

        Assertions.assertEquals(arr.length, this.singlyLinkedList.size);
        Assertions.assertArrayEquals(new int[] { 4, 1, 3, 2 }, new int[] {
                this.singlyLinkedList.head.value,
                this.singlyLinkedList.head.next.value,
                this.singlyLinkedList.head.next.next.value,
                this.singlyLinkedList.tail.value
        });
    }

    @Test
    public void testDeleteFirst() {
        this.singlyLinkedList = new SinglyLinkedList();
        int[] arr = { 1, 2, 3, 4 };

        for (int element : arr) {
            this.singlyLinkedList.insertLast(element);
        }

        this.singlyLinkedList.deleteFirst();

        Assertions.assertEquals(arr.length - 1, this.singlyLinkedList.size);
        Assertions.assertArrayEquals(Arrays.copyOfRange(arr, 1, arr.length), new int[] {
                this.singlyLinkedList.head.value,
                this.singlyLinkedList.head.next.value,
                this.singlyLinkedList.tail.value
        });
    }

    @Test
    public void testDeleteLast() {
        this.singlyLinkedList = new SinglyLinkedList();
        int[] arr = { 1, 2, 3, 4 };

        for (int element : arr) {
            this.singlyLinkedList.insertLast(element);
        }

        this.singlyLinkedList.deleteLast();

        Assertions.assertEquals(arr.length - 1, this.singlyLinkedList.size);
        Assertions.assertArrayEquals(Arrays.copyOfRange(arr, 0, arr.length - 1), new int[] {
                this.singlyLinkedList.head.value,
                this.singlyLinkedList.head.next.value,
                this.singlyLinkedList.tail.value
        });
    }

    @Test
    public void testDeleteAtIndex() {
        this.singlyLinkedList = new SinglyLinkedList();
        int[] arr = { 1, 2, 3, 4 };

        for (int element : arr) {
            this.singlyLinkedList.insertLast(element);
        }

        this.singlyLinkedList.deleteAtIndex(1);

        Assertions.assertEquals(arr.length - 1, this.singlyLinkedList.size);
        Assertions.assertArrayEquals(new int[] { 1, 3, 4 }, new int[] {
                this.singlyLinkedList.head.value,
                this.singlyLinkedList.head.next.value,
                this.singlyLinkedList.head.next.next.value
        });
    }


    @Test
    public void testContains() {
        this.singlyLinkedList = new SinglyLinkedList();
        int[] arr = { 1, 2, 3, 4 };

        for (int element : arr) {
            this.singlyLinkedList.insertLast(element);
        }

        Assertions.assertEquals(arr.length, this.singlyLinkedList.size);
        Assertions.assertTrue(this.singlyLinkedList.contains(1));
    }

    @Test
    public void testNotContains() {
        this.singlyLinkedList = new SinglyLinkedList();
        int[] arr = { 1, 2, 3, 4 };

        for (int element : arr) {
            this.singlyLinkedList.insertLast(element);
        }

        Assertions.assertEquals(arr.length, this.singlyLinkedList.size);
        Assertions.assertFalse(this.singlyLinkedList.contains(22));
    }

    @Test
    public void testIndexOf() {
        this.singlyLinkedList = new SinglyLinkedList();
        int[] arr = { 1, 2, 3, 4 };

        for (int element : arr) {
            this.singlyLinkedList.insertLast(element);
        }

        Assertions.assertEquals(arr.length, this.singlyLinkedList.size);
        Assertions.assertEquals(3, this.singlyLinkedList.indexOf(4));
    }

    @Test
    public void testIndexOfNotFound() {
        this.singlyLinkedList = new SinglyLinkedList();
        int[] arr = { 1, 2, 3, 4 };

        for (int element : arr) {
            this.singlyLinkedList.insertLast(element);
        }

        Assertions.assertEquals(arr.length, this.singlyLinkedList.size);
        Assertions.assertEquals(-1, this.singlyLinkedList.indexOf(22));
    }
}
