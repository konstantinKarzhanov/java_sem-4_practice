package generics;

public class GenericAnimalTest<T extends Animal> {
    private T animal;

    public GenericAnimalTest(T animal) {
        this.animal = animal;
    }

    public void printAnimalSound() {
        System.out.println(this.animal.getSound());
    }
}
