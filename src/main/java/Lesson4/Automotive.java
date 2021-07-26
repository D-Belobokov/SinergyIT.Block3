package Lesson4;

import Lesson4.exceptions.LimitDimensionsException;
import Lesson4.exceptions.LimitSpeed100Exception;
import Lesson4.exceptions.LimitSpeed80Exception;
import Lesson4.exceptions.LimitWeightException;

public interface Automotive {
    void speedCheck() throws LimitSpeed80Exception, LimitSpeed100Exception;

    void dimensions() throws LimitDimensionsException, LimitWeightException;
}
