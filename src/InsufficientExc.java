
import java.lang.Exception;
public class InsufficientExc {

    static class InsufficientException extends Exception{
        InsufficientException(String s)
        {
            super(s);
        }
    }
}
