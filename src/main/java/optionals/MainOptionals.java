package optionals;

import java.util.Optional;

public class MainOptionals {
    public static void main(String[] args) {
        Optional<String> empty = Optional.empty();
        System.out.println(empty);
        System.out.println(empty.isPresent());
        System.out.println(empty.isEmpty());

        //        String stringHelloUpper = empty.map(String::toUpperCase).orElse("the variable is empty");
        String stringEmpty = empty.map(String::toUpperCase).orElseGet(() -> {
            // ... we can add any extra computation to retrieve the value
            return "the variable is empty. Result = computed string";
        });
        System.out.println(stringEmpty);

        Optional<String> stringHello = Optional.of("hello");
        System.out.println(stringHello);
        System.out.println(stringHello.isPresent());
        System.out.println(stringHello.isEmpty());

        String stringOrElse = stringHello.orElse("world");
        System.out.println(stringOrElse);

//        we shouldn't use Optional.of(null) NullPointerException
//        Optional<String> stringNull = Optional.of(null);

//        Optional<String> stringNull = Optional.ofNullable(null);
        Optional<String> stringNull = Optional.ofNullable("not null anymore");
        System.out.println(stringNull);

        stringNull.ifPresentOrElse(System.out::println, () -> System.out.println("still null"));
    }
}
