package lambda;

public class Animal implements Printable {
    private final String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public String print(String species) {
        return this.name + " " + "is a" + " " + species;
    }
}
