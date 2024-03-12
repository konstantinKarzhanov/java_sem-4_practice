package queue;

public class CannotAddToTheQueueException extends Throwable {
    public CannotAddToTheQueueException(String message) {
        super(message);
    }
}
