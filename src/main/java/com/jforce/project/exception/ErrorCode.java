package com.jforce.project.exception;

/**
 * @author Iraz Şanlı
 */
public enum ErrorCode {
    UNKNOWN(0),
    OK(200),

    BAD_REQUEST(400),
    UNAUTHORIZED(401),

    USER_DOES_NOT_EXIST(5001),
    WRONG_PASSWORD(5002),
    SMS_KEY_IS_NOT_VALID(5003),
    USER_TOKEN_DOES_NOT_EXISTS(5004),
    WORK_DATE_CANNOT_BE_IN_PAST(5005)
;
    private final int code;

    ErrorCode(int code) {
        this.code = code;
    }

    public int getCode() {
        return this.code;
    }

}