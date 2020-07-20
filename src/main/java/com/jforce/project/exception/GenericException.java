package com.jforce.project.exception;

public class GenericException extends Exception {
    private final ErrorCode messageCode;
    private final String customMessage;

    public GenericException(ErrorCode messageCode) {
        this.messageCode = messageCode;
        this.customMessage = null;
    }

    public GenericException(ErrorCode messageCode, String message) {
        super(message);
        this.messageCode = messageCode;
        this.customMessage = message;
    }

    public GenericException(ErrorCode messageCode, String message, Throwable cause) {
        super(message, cause);
        this.messageCode = messageCode;
        this.customMessage = message;
    }

    public GenericException(ErrorCode messageCode, Throwable cause) {
        super(cause);
        this.messageCode = messageCode;
        this.customMessage = null;
    }

    public ErrorCode getMessageCode() {
        return messageCode;
    }

    public String getCustomMessage() {
        return customMessage;
    }
}
