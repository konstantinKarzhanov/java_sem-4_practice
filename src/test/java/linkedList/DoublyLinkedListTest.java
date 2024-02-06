package linkedList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class DoublyLinkedListTest {
    DoublyLinkedList doublyLinkedList;

    @Test
    public void testDefaultConstructor() {
        this.doublyLinkedList = new DoublyLinkedList();

        Assertions.assertTrue(this.doublyLinkedList.size == 0);

        Assertions.assertNull(this.doublyLinkedList.head);
        Assertions.assertNull(this.doublyLinkedList.tail);
    }

    @Test
    public void testParameterizedConstructor() {
        int value = 1;
        this.doublyLinkedList = new DoublyLinkedList(value);

        Assertions.assertTrue(this.doublyLinkedList.size == 1);

        Assertions.assertNull(this.doublyLinkedList.head.prev);
        Assertions.assertEquals(value, this.doublyLinkedList.head.value);
        Assertions.assertNull(this.doublyLinkedList.head.next);

        Assertions.assertNull(this.doublyLinkedList.tail.prev);
        Assertions.assertEquals(value, this.doublyLinkedList.tail.value);
        Assertions.assertNull(this.doublyLinkedList.tail.next);
    }

    @Test
    public void testInsertFirst() {
        this.doublyLinkedList = new DoublyLinkedList();
        int[] arr = { 1, 2, 3, 4 };
        int[] reversedArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            this.doublyLinkedList.insertFirst(arr[i]);
            reversedArr[reversedArr.length - 1 - i] = arr[i];
        }

        Assertions.assertEquals(arr.length, this.doublyLinkedList.size);
        Assertions.assertArrayEquals(reversedArr, new int[] {
                this.doublyLinkedList.head.value,
                this.doublyLinkedList.head.next.value,
                this.doublyLinkedList.head.next.next.value,
                this.doublyLinkedList.tail.value,
        });
    }

    @Test
    public void testPrevAndNextNodeAfterInsertFirst() {
        this.doublyLinkedList = new DoublyLinkedList();

        int firstValue = 1;
        int secondValue = 2;

        this.doublyLinkedList
                .insertFirst(firstValue)
                .insertFirst(secondValue);

        Assertions.assertEquals(2, this.doublyLinkedList.size);

        Assertions.assertNull(this.doublyLinkedList.head.prev);
        Assertions.assertEquals(secondValue, this.doublyLinkedList.head.value);
        Assertions.assertEquals(firstValue, this.doublyLinkedList.head.next.value);

        Assertions.assertEquals(secondValue, this.doublyLinkedList.tail.prev.value);
        Assertions.assertEquals(firstValue, this.doublyLinkedList.tail.value);
        Assertions.assertNull(this.doublyLinkedList.tail.next);
    }

    @Test
    public void testInsertLast() {
        this.doublyLinkedList = new DoublyLinkedList();
        int[] arr = { 1, 2, 3, 4 };

        for (int element : arr) {
            this.doublyLinkedList.insertLast(element);
        }

        Assertions.assertEquals(arr.length, this.doublyLinkedList.size);
        Assertions.assertArrayEquals(arr, new int[] {
                this.doublyLinkedList.head.value,
                this.doublyLinkedList.head.next.value,
                this.doublyLinkedList.head.next.next.value,
                this.doublyLinkedList.tail.value
        });
    }

    @Test
    public void testPrevAndNextNodeAfterInsertLast() {
        this.doublyLinkedList = new DoublyLinkedList();

        int firstValue = 1;
        int secondValue = 2;

        this.doublyLinkedList
                .insertLast(firstValue)
                .insertLast(secondValue);

        Assertions.assertEquals(2, this.doublyLinkedList.size);

        Assertions.assertNull(this.doublyLinkedList.head.prev);
        Assertions.assertEquals(firstValue, this.doublyLinkedList.head.value);
        Assertions.assertEquals(secondValue, this.doublyLinkedList.head.next.value);

        Assertions.assertEquals(firstValue, this.doublyLinkedList.tail.prev.value);
        Assertions.assertEquals(secondValue, this.doublyLinkedList.tail.value);
        Assertions.assertNull(this.doublyLinkedList.tail.next);
    }

    @Test
    public void testInsertAtIndex() {
        this.doublyLinkedList = new DoublyLinkedList();
        int[] arr = { 1, 2, 3, 4 };

        this.doublyLinkedList
                .insertAtIndex(arr[0], 0)
                .insertAtIndex(arr[1], 1)
                .insertAtIndex(arr[2], 1)
                .insertAtIndex(arr[3], 0);

        Assertions.assertEquals(arr.length, this.doublyLinkedList.size);
        Assertions.assertArrayEquals(new int[] { 4, 1, 3, 2 }, new int[] {
                this.doublyLinkedList.head.value,
                this.doublyLinkedList.head.next.value,
                this.doublyLinkedList.head.next.next.value,
                this.doublyLinkedList.tail.value
        });
    }

    @Test
    public void testPrevAndNextNodeAfterInsertAtIndex() {
        this.doublyLinkedList = new DoublyLinkedList();

        int firstValue = 1;
        int secondValue = 2;
        int thirdValue = 3;

        this.doublyLinkedList
                .insertAtIndex(firstValue, 0)
                .insertAtIndex(secondValue, 1)
                .insertAtIndex(thirdValue, 1);

        Assertions.assertEquals(3, this.doublyLinkedList.size);

        Assertions.assertNull(this.doublyLinkedList.head.prev);
        Assertions.assertEquals(firstValue, this.doublyLinkedList.head.value);
        Assertions.assertEquals(thirdValue, this.doublyLinkedList.head.next.value);

        Assertions.assertEquals(firstValue, this.doublyLinkedList.head.next.prev.value);
        Assertions.assertEquals(secondValue, this.doublyLinkedList.head.next.next.value);

        Assertions.assertEquals(thirdValue, this.doublyLinkedList.tail.prev.value);
        Assertions.assertEquals(secondValue, this.doublyLinkedList.tail.value);
        Assertions.assertNull(this.doublyLinkedList.tail.next);
    }

    @Test
    public void testDeleteFirst() {
        this.doublyLinkedList = new DoublyLinkedList();
        int[] arr = { 1, 2, 3, 4 };

        for (int element : arr) {
            this.doublyLinkedList.insertLast(element);
        }

        Assertions.assertTrue(doublyLinkedList.deleteFirst());
        Assertions.assertEquals(arr.length - 1, this.doublyLinkedList.size);
        Assertions.assertArrayEquals(Arrays.copyOfRange(arr, 1, arr.length), new int[] {
                this.doublyLinkedList.head.value,
                this.doublyLinkedList.head.next.value,
                this.doublyLinkedList.tail.value
        });
    }

    @Test
    public void testPrevAndNextNodeAfterDeleteFirst() {
        this.doublyLinkedList = new DoublyLinkedList();
        int[] arr = { 1, 2, 3 };

        for (int element : arr) {
            this.doublyLinkedList.insertLast(element);
        }

        Assertions.assertTrue(doublyLinkedList.deleteFirst());
        Assertions.assertEquals(arr.length - 1, this.doublyLinkedList.size);

        Assertions.assertNull(this.doublyLinkedList.head.prev);
        Assertions.assertEquals(this.doublyLinkedList.head.value, this.doublyLinkedList.tail.prev.value);
        Assertions.assertEquals(this.doublyLinkedList.head.next.value, this.doublyLinkedList.tail.value);
        Assertions.assertNull(this.doublyLinkedList.tail.next);
    }

    @Test
    public void testDeleteLast() {
        this.doublyLinkedList = new DoublyLinkedList();
        int[] arr = { 1, 2, 3 };

        for (int element : arr) {
            this.doublyLinkedList.insertLast(element);
        }

        Assertions.assertTrue(doublyLinkedList.deleteLast());
        Assertions.assertEquals(arr.length - 1, this.doublyLinkedList.size);

        Assertions.assertNull(this.doublyLinkedList.head.prev);
        Assertions.assertEquals(this.doublyLinkedList.head.value, this.doublyLinkedList.tail.prev.value);
        Assertions.assertEquals(this.doublyLinkedList.head.next.value, this.doublyLinkedList.tail.value);
        Assertions.assertNull(this.doublyLinkedList.tail.next);
    }

    @Test
    public void testDeleteAtIndex() {
        this.doublyLinkedList = new DoublyLinkedList();
        int[] arr = { 1, 2, 3 };

        for (int element : arr) {
            this.doublyLinkedList.insertLast(element);
        }

        Assertions.assertTrue(doublyLinkedList.deleteAtIndex(1));
        Assertions.assertEquals(arr.length - 1, this.doublyLinkedList.size);

        Assertions.assertNull(this.doublyLinkedList.head.prev);
        Assertions.assertEquals(this.doublyLinkedList.head.value, this.doublyLinkedList.tail.prev.value);
        Assertions.assertEquals(this.doublyLinkedList.head.next.value, this.doublyLinkedList.tail.value);
        Assertions.assertNull(this.doublyLinkedList.tail.next);
    }

    @Test
    public void testContains() {
        this.doublyLinkedList = new DoublyLinkedList();
        int[] arr = { 1, 2, 3, 4 };

        for (int element : arr) {
            this.doublyLinkedList.insertLast(element);
        }

        Assertions.assertEquals(arr.length, this.doublyLinkedList.size);
        Assertions.assertTrue(this.doublyLinkedList.contains(arr[0]));
    }

    @Test
    public void testNotContains() {
        this.doublyLinkedList = new DoublyLinkedList();
        int[] arr = { 1, 2, 3, 4 };

        for (int element : arr) {
            this.doublyLinkedList.insertLast(element);
        }

        Assertions.assertEquals(arr.length, this.doublyLinkedList.size);
        Assertions.assertFalse(this.doublyLinkedList.contains(22));
    }

    @Test
    public void testIndexOf() {
        this.doublyLinkedList = new DoublyLinkedList();
        int[] arr = { 1, 2, 3, 4 };

        for (int element : arr) {
            this.doublyLinkedList.insertLast(element);
        }

        Assertions.assertEquals(arr.length, this.doublyLinkedList.size);
        Assertions.assertEquals(3, this.doublyLinkedList.indexOf(4));
    }

    @Test
    public void testIndexOfNotFound() {
        this.doublyLinkedList = new DoublyLinkedList();
        int[] arr = { 1, 2, 3, 4 };

        for (int element : arr) {
            this.doublyLinkedList.insertLast(element);
        }

        Assertions.assertEquals(arr.length, this.doublyLinkedList.size);
        Assertions.assertEquals(-1, this.doublyLinkedList.indexOf(22));
    }
}
