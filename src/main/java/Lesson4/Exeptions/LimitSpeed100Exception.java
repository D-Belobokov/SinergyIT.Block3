package Lesson4.Exeptions;

public class LimitSpeed100Exception extends RuntimeException{
    public LimitSpeed100Exception(String message){
        super(message);
    }
}