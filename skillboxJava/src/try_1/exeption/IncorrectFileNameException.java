package try_1.exeption;

public class IncorrectFileNameException extends RuntimeException {
    public IncorrectFileNameException() {
    }

    public IncorrectFileNameException(String message) {
        super(message);
    }
}
