package exception;

public class IncorrectDataException extends Exception {
    public IncorrectDataException() {
    }

    public IncorrectDataException(String message) {
        super(message);
    }
}
