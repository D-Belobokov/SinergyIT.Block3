package Lesson4.Exeptions;

public class LimitDimensionsException extends RuntimeException{
    public LimitDimensionsException(String message){
        super(message);
    }
}
