package Exceptions;

public class SetBasketSizeException extends RuntimeException {
    public SetBasketSizeException() {
    }

    public SetBasketSizeException(String message) {
        super(message);
    }
}
