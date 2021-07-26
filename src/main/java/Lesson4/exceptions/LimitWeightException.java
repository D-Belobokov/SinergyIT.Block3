package Lesson4.exceptions;

public class LimitWeightException extends RuntimeException {
    public LimitWeightException(String message) {
        super(message);
    }
}
