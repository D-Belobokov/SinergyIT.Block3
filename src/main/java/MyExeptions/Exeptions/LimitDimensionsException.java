package MyExeptions.Exeptions;

public class LimitDimensionsException extends RuntimeException{
    public LimitDimensionsException(String message){
        super(message);
    }
}
