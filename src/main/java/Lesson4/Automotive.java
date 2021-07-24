package Lesson4;

import Lesson4.Exeptions.LimitDimensionsException;
import Lesson4.Exeptions.LimitSpeed100Exception;
import Lesson4.Exeptions.LimitSpeed80Exception;
import Lesson4.Exeptions.LimitWeightException;

public interface Automotive {
    void speedCheck() throws LimitSpeed80Exception, LimitSpeed100Exception;
    void dimensions() throws LimitDimensionsException, LimitWeightException;
}
