package generics;

public class Dog extends Animal {
    private static final String sound = "woof";

    @Override
    public String getSound() {
        return sound;
    }
}
