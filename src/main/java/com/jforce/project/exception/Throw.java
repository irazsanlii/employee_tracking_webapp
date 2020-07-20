package com.jforce.project.exception;

public final class Throw {


    private Throw() {
    }

    public static void throwException(ErrorCode errorCode, String message, Object... args) throws GenericException {
        throw new GenericException(errorCode, String.format(message, args));
    }

    public static void throwException(ErrorCode errorCode, String message, Throwable t, Object... args) throws GenericException {
        throw new GenericException(errorCode, String.format(message, args), t);
    }

    public static void throwException(ErrorCode errorCode) throws GenericException {
        throw new GenericException(errorCode);
    }

    public static void throwException(ErrorCode errorCode, Throwable t) throws GenericException {
        throw new GenericException(errorCode, t);
    }

    public static void throwException(Throwable t) throws GenericException {
        throw new GenericException(ErrorCode.UNKNOWN, t);
    }

}