package MyExeptions.Exeptions;

public class LimitSpeed80Exception extends RuntimeException{
    public LimitSpeed80Exception(String message){
        super(message);
    }
}
