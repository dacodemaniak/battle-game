package org.aelion.services.exceptions;

public class TooManyPlayerException extends RuntimeException {
    public TooManyPlayerException(String message) {
        super(message);
    }
}
