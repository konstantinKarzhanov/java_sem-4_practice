package generics;

public abstract class Animal {
    private static final String sleepSound = "Zzz..";
    public String getSleepSound() {
        return sleepSound;
    }

    public abstract String getSound();
}
