package array;

import java.util.Arrays;

class DemoArray {
    public static void main(String[] args) {
        String[] strArr = {
                "Corretto", "Espresso", "Frappucino", "Cortado",
                "Macchiato", "Doppio", "Lungo", "Marocchino",
                "Ristretto", "Affogato", "Freddo", "Americano", "Cappuccino" };

        // ===============================
        // // 1. System.arrayCopy -----
        // String[] copyStrArr = new String[2];

        // System.out.println(Arrays.toString(copyStrArr)); // [null, null]
        // System.arraycopy(strArr, strArr.length - 2, copyStrArr, 0, 2);
        // System.out.println(Arrays.toString(copyStrArr)); // [Americano, Cappuccino]
        // // System.arrayCopy -----
        // ===============================

        // ===============================
        // // 2. Arrays.copyOfRange -----
        // String[] copyStrArr = Arrays.copyOfRange(strArr, strArr.length - 2, strArr.length);
        // System.out.println(Arrays.toString(copyStrArr)); // [Americano, Cappuccino]
        // // Arrays.copyOfRange -----
        // ===============================

        // ===============================
        // // 3. Arrays.binarySearch -----
        // String strToSearch = "Freddo";
        // // result is not correct because array isn't sorted
        // System.out.println(Arrays.toString(strArr));
        // System.out.println(Arrays.binarySearch(strArr, strToSearch)); // -5

        // // before using binary search we need to sort array first
        // Arrays.sort(strArr);

        // System.out.println(Arrays.toString(strArr));
        // System.out.println(Arrays.binarySearch(strArr, strToSearch)); // 8
        // // Arrays.binarySearch -----
        // ===============================

        // ===============================
        // // 4. Arrays.equals -----
        // String[] copyStrArr = Arrays.copyOfRange(strArr, 0, strArr.length);

        // System.out.println(strArr == strArr); // true
        // System.out.println(strArr == copyStrArr); // false

        // System.out.println(Arrays.equals(strArr, copyStrArr)); // true
        // // Arrays.equals -----
        // ===============================

        // ===============================
        // // 5. Arrays.fill -----
        // System.out.println(Arrays.toString(strArr));
        // Arrays.fill(strArr, "test");
        // // [test, test, test, test, test, test, test, test, test, test, test, test, test]
        // System.out.println(Arrays.toString(strArr));
        // // Arrays.fill -----
        // ===============================

        Arrays.stream(strArr).map(coffee -> coffee + " ").forEach(System.out::print);
    }
}