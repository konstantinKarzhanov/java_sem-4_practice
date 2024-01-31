package array;

public class DemoTwoDimensionalArray {
    public static void main(String[] args) {
        TwoDimensionalArray arr = new TwoDimensionalArray(2, 3);

        System.out.println(arr.toString()); // [[-2147483648, -2147483648, -2147483648], [-2147483648, -2147483648, -2147483648]]

        arr
                .insertElement(11, 0, 0) // [[11, -2147483648, -2147483648], [-2147483648, -2147483648, -2147483648]]
                .insertElement(11, 0, 1) // [[11, 11, -2147483648], [-2147483648, -2147483648, -2147483648]]
                .insertElement(11, 0, 2) // [[11, 11, 11], [-2147483648, -2147483648, -2147483648]]
                .insertElement(11, 1, 0) // [[11, 11, 11], [11, -2147483648, -2147483648]]
                .insertElement(11, 1, 1) // [[11, 11, 11], [11, 11, -2147483648]]
                .insertElement(99, 1, 2); // [[11, 11, 11], [11, 11, 99]]

        System.out.println(arr.toString()); // [[11, 11, 11], [11, 11, 99]]
        arr.traverse(); // [11, 11, 11], [11, 11, 99]

        System.out.println(arr.indexOf(99)); // position of the first found element: {1, 2}
        System.out.println(arr.indexOf(101)); // there is no element like 101: -1

        System.out.println(arr.deleteElement(11)); // number of deleted elements: 5
        System.out.println(arr); // [[-2147483648, -2147483648, -2147483648], [-2147483648, -2147483648, 99]]

        System.out.println(arr.deleteElement(99)); // number of deleted elements: 1
        System.out.println(arr); // null
    }
}
