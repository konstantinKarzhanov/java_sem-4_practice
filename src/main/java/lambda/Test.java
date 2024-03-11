package lambda;

// The program accepts a list of integers and uses lambda expressions to filter and calculate their powers.
// Returns the resulting list

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String... args) {
        List<Integer> intList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            intList.add(i);
        }

        FilterNumber filterNumberOdd = num -> num % 2 != 0;
        FilterNumber filterNumberEven = num -> num % 2 == 0;

        MapNumber calculateSquare = num -> num * num;

        System.out.println("Odd: ");
        System.out.println(filterAndMap(
                intList,
                filterNumberOdd,
                calculateSquare
        ).toString());

        System.out.println("Even: ");
        System.out.println(filterAndMap(
                intList,
                filterNumberEven,
                calculateSquare
        ).toString());
    }

    public static List<Integer> filterAndMap(List<Integer> intList, FilterNumber filterNumber, MapNumber mapNumber) {
        List<Integer> resultList = new ArrayList<>();

        for (Integer num : intList) {
            if (filterNumber.test(num)) {
                resultList.add(mapNumber.apply(num));
            }
        }

        return resultList;
    }

    @FunctionalInterface
    public interface FilterNumber {
        boolean test(Integer num);
    }

    @FunctionalInterface
    public interface MapNumber {
        Integer apply(Integer num);
    }
}