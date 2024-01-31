package array;

import java.util.Arrays;

public class OneDimensionalArray {
    // Define attributes
    private int[] arr;

    // Define constructors
    public OneDimensionalArray(){};

    public OneDimensionalArray(int length) {
        this.arr = new int[length];

        for (int i = 0; i < length; i++) {
            this.arr[i] = Integer.MIN_VALUE;
        }
    }

    public OneDimensionalArray(int[] arr) {
        this.arr = arr;
    }

    // Define get methods
    public int[] getOneDimensionalArray() {
        return this.arr;
    }

    // Define set methods
    public void setOneDimensionalArray(int length) {
        this.arr = new int[length];

        for (int i = 0; i < length; i++) {
            this.arr[i] = Integer.MIN_VALUE;
        }
    }

    // Define method to insert value at specified index
    public OneDimensionalArray insertElement(int value, int index) {
        try {
            int oldElement = this.arr[index];
            this.arr[index] = value;

            if (oldElement == Integer.MIN_VALUE) {
                System.out.println("Value successfully inserted");
            } else {
                System.out.println("The existing element was successfully overwritten");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        return new OneDimensionalArray(this.arr);
    }

    // Define method to traverse array
    public void traverse() {
        try {
            for (int element : this.arr) {
                System.out.println(element);
            }
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }

    // Define a method to find the index of the first occurrence of the specified value
    public int indexOf(int value) {
        int index = -1;

        for (int i = 0; i < this.arr.length; i++) {
            if (this.arr[i] == value) {
                index = i;

                break;
            }
        }

        return index;
    }

    // Define method to delete specified value from the array
    public int deleteElement(int value) {
        int countDeleted = 0;
        int countEmpty = 0;

        for (int i = 0; i < this.arr.length; i++) {
            if (this.arr[i] == value) {
                this.arr[i] = Integer.MIN_VALUE;
                countDeleted++;
            }

            if (this.arr[i] == Integer.MIN_VALUE) countEmpty++;
        }

        if (countEmpty == this.arr.length) this.arr = null;

        return countDeleted;
    }

    // // Define method to delete the entire array
    // public boolean delete() {
    //   boolean flag = true;

    //   for (int element : this.arr) {
    //     if (element != Integer.MIN_VALUE) {
    //       flag = false;

    //       break;
    //     };
    //   }

    //   if (flag) {
    //     this.arr = null;
    //   }

    //   return flag;
    // }

    // Define method to represent the array
    @Override
    public String toString() {
        return Arrays.toString(this.arr);
    }
}