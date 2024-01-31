package array;

import java.util.Arrays;

public class TwoDimensionalArray {
    // Define attributes
    private int[][] arr;

    // Define constructors
    public TwoDimensionalArray() {}

    public TwoDimensionalArray(int rowLength, int columnLength) {
        this.arr = new int[rowLength][columnLength];

        for (int i = 0; i < this.arr.length; i++) {
            for (int j = 0; j < this.arr[i].length; j++) {
                this.arr[i][j] = Integer.MIN_VALUE;
            }
        }
    }

    public TwoDimensionalArray(int[][] arr) {
        this.arr = arr;
    }

    // Define get methods
    public int[][] getTwoDimensionalArray() {
        return this.arr;
    }

    // Define set methods
    public void setTwoDimensionalArray(int rowLength, int columnLength) {
        this.arr = new int[rowLength][columnLength];

        for (int i = 0; i < this.arr.length; i++) {
            for (int j = 0; j < this.arr[i].length; j++) {
                this.arr[i][j] = Integer.MIN_VALUE;
            }
        }
    }

    // Define method to insert element at specified index
    public TwoDimensionalArray insertElement(int element, int rowIndex, int columnIndex) {
        try {
            int oldElement = this.arr[rowIndex][columnIndex];
            this.arr[rowIndex][columnIndex] = element;

            if (oldElement == Integer.MIN_VALUE) {
                System.out.println("Element succesfully inserted");
            } else {
                System.out.println("The existing element was successfully overwritten");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        return new TwoDimensionalArray(this.arr);
    }

    // Define method to traverse array
    public void traverse() {
        try {
            for (int[] elementArr : this.arr) {
                System.out.println(Arrays.toString(elementArr));
            }
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }

    // Define a method to find the index of the first occurrence of the specified element
    public String indexOf(int element) {
        String index = "-1";

        outerLoopLabel:
        for (int i = 0; i < this.arr.length; i++) {
            for (int j = 0; j < this.arr[i].length; j++)
                if (this.arr[i][j] == element) {
                    index = String.format("{%d, %d}", i, j);

                    break outerLoopLabel;
                }
        }

        return index;
    }

    // Define method to delete specified value from the array
    public int deleteElement(int value) {
        int countDeleted = 0;
        int countEmpty = 0;

        for (int i = 0; i < this.arr.length; i++) {
            for (int j = 0; j < this.arr[i].length; j++) {
                if (this.arr[i][j] == value) {
                    this.arr[i][j] = Integer.MIN_VALUE;
                    countDeleted++;
                }

                if (this.arr[i][j] == Integer.MIN_VALUE) countEmpty++;
            }
        }

        if (countEmpty == this.arr.length * this.arr[0].length) this.arr = null;

        return countDeleted;
    }

    // // Define method to delete the entire array
    // public boolean delete() {
    //   boolean flag = true;

    //   outerLoopLabel:
    //   for (int[] elementArr : this.arr) {
    //     for (int element : elementArr) {
    //       if (element != Integer.MIN_VALUE) {
    //         flag = false;

    //         break outerLoopLabel;
    //       };
    //     }
    //   }

    //   if (flag) {
    //     this.arr = null;
    //   }

    //   return flag;
    // }

    // Define method to represent the array
    @Override
    public String toString() {
        String arrayRepresentation = "";

        if (this.arr != null) {
            for (int i = 0; i < this.arr.length; i++) {
                arrayRepresentation += Arrays.toString(this.arr[i]);

                if (i != this.arr.length - 1) arrayRepresentation += ", ";
            }

            arrayRepresentation = String.format("[%s]", arrayRepresentation);
        }

        return arrayRepresentation != "" ? arrayRepresentation : null;
    }
}
