package com.qhjys.fund.common.exception;

public class ValidationException extends Exception {

    private static final long serialVersionUID = -8438418921455249529L;

    public ValidationException() {
        super();
    }

    public ValidationException(Throwable cause) {
        super(cause);
    }

    public ValidationException(String message) {
        super(message);
    }

    public ValidationException(String message, Throwable cause) {
        super(message, cause);
    }
}