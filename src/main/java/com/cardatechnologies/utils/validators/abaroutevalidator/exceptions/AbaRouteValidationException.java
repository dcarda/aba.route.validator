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

    public boolean isNumeric(final String str) {

        // Cycle through the character array
        for (char _char : str.toCharArray()) {
            if (!Character.isDigit(_char)) {

                // This is bad!
                return (false);
            }
        }

        // All is well!
        return (true);
    }


}
