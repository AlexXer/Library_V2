package exception;

/**
 * The type Parser exception.
 */
public class ParserException extends Exception{
    public ParserException(String message, Exception cause) {
        super(message, cause);
    }

    public ParserException(String message) {
        super(message);
    }

    public ParserException() {
    }
}
