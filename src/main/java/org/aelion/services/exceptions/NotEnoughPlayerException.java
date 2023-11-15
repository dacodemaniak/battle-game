package org.aelion.services.exceptions;

public class NotEnoughPlayerException extends RuntimeException {
    public NotEnoughPlayerException(String message) {
        super(message);
    }
}
