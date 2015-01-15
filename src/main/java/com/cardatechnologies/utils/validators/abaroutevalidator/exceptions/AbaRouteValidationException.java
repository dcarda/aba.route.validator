package com.cardatechnologies.utils.validators.abaroutevalidator.exceptions;

public class AbaRouteValidationException extends Exception {

    public AbaRouteValidationException(String message) {
        super(message);
    }

    public AbaRouteValidationException(String message, Throwable cause) {
        super(message, cause);
    }

    public AbaRouteValidationException(Throwable cause) {
        super(cause);
    }

    protected AbaRouteValidationException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
