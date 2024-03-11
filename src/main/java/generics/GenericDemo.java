package generics;

public class GenericDemo {
    public static void main(String[] args) {
        GenericTest<String> genericString = new GenericTest<>("test");
        GenericTest<Integer> genericInteger = new GenericTest<>(1);
        GenericTest<Double> genericDouble = new GenericTest<>(2.3d);

        GenericAnimalTest<Dog> animal = new GenericAnimalTest<>(new Dog());

        System.out.println(genericString.getGenericField());
        genericString.printClassName();

        System.out.println(genericInteger.getGenericField());
        genericInteger.printClassName();

        System.out.println(genericDouble.getGenericField());
        genericDouble.printClassName();

        animal.printAnimalSound();
    }
}
