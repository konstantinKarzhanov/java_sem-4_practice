package generics;

public class GenericTest<T> {
    private T genericField;

    public GenericTest(T genericField) {
        this.genericField = genericField;
    }

    public T getGenericField() {
        return this.genericField;
    }

    public void setGenericField(T genericField) {
        this.genericField = genericField;
    }

    public void printClassName() {
        System.out.println(this.genericField.getClass());
    }
}
