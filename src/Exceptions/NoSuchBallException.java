package Exceptions;

public class NoSuchBallException extends RuntimeException {

    public NoSuchBallException() {
        super();
    }

    public NoSuchBallException(String s) {
        super(s);
    }
}
