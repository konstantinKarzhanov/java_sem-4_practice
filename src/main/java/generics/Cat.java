package generics;

public class Cat extends Animal {
    private static final String sound = "meow";

    @Override
    public String getSound() {
        return sound;
    }
}
