package recursion;

public class BinaryDecimalOperations {
    public static String decimalToBinaryDivideByTwo(int value) {
        if (value == 0) return "";

        int nextValue = value / 2;

        return nextValue != 0 ? decimalToBinaryDivideByTwo(nextValue) + value % 2 : "1";
    }

    public static int binaryToDecimalSumPowersOfTwo(String binarySequence) throws Exception {
        if (binarySequence.isEmpty()) throw new Exception("the value cannot be empty");

        int binaryValue = binarySequence.charAt(0) - '0';
        int power = binarySequence.length() - 1;

        if (power < 1) return binaryValue;

        return binaryToDecimalSumPowersOfTwo(binarySequence.substring(1)) + binaryValue * (int) Math.pow(2, power);
    }
}
