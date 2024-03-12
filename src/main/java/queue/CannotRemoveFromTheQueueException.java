package queue;

public class CannotRemoveFromTheQueueException extends Throwable {
    public CannotRemoveFromTheQueueException(String message) {
        super(message);
    }
}
