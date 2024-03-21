package recursion;

public class DemoRecursion {
    public static void main(String[] args) throws Exception {
        System.out.println("From decimal to binary: " +
                String.format("%8s", BinaryDecimalOperations.decimalToBinaryDivideByTwo(89))
                        .replace(" ", "0")
        ); // 01011001

        System.out.println("From binary to decimal: " +
                BinaryDecimalOperations.binaryToDecimalSumPowersOfTwo("01011001")
        ); // 89
    }
}
