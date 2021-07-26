package Lesson4.exceptions;

public class LimitDimensionsException extends RuntimeException {
    public LimitDimensionsException(String message) {
        super(message);
    }
}
