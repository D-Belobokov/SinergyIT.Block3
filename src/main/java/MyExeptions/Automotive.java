package MyExeptions;

import MyExeptions.Exeptions.LimitDimensionsException;
import MyExeptions.Exeptions.LimitSpeed100Exception;
import MyExeptions.Exeptions.LimitSpeed80Exception;
import MyExeptions.Exeptions.LimitWeightException;

public interface Automotive {
    void speedCheck() throws LimitSpeed80Exception, LimitSpeed100Exception;
    void dimensions() throws LimitDimensionsException, LimitWeightException;
}
