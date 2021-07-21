package Lesson4.Exeptions;

public class LimitWeightException extends RuntimeException{
    public LimitWeightException(String message){
        super(message);
    }
}
