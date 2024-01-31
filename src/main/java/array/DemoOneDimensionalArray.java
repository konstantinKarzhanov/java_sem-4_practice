package array;

public class DemoOneDimensionalArray {
    public static void main(String[] args) {
        OneDimensionalArray arr = new OneDimensionalArray(3);

        System.out.println(arr); // [-2147483648, -2147483648, -2147483648]

        arr
                .insertElement(10, 0) // [10, -2147483648, -2147483648]
                .insertElement(12, 1) // [10, 12, -2147483648]
                .insertElement(12, 2); // [10, 12, 12]

        arr.traverse(); // 10, 12, 12

        System.out.println(arr.indexOf(12)); // index of the first found element: 1
        System.out.println(arr.indexOf(22)); // there is no element like 22: -1

        System.out.println(arr.deleteElement(12)); // number of deleted elements: 2
        System.out.println(arr.deleteElement(22)); // number of deleted elements: 0
        System.out.println(arr); // [10, -2147483648, -2147483648]

        System.out.println(arr.deleteElement(10)); // number of deleted elements: 1
        System.out.println(arr); // null
    }
}
