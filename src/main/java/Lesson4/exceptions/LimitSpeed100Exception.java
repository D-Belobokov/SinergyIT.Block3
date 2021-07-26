package Lesson4.exceptions;

public class LimitSpeed100Exception extends RuntimeException {
    public LimitSpeed100Exception(String message) {
        super(message);
    }
}
