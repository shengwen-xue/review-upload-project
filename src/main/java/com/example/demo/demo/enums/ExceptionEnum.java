package com.example.demo.demo.enums;

/**
 * Create by
 *
 * @author xueshengwen
 */
public enum ExceptionEnum implements IExceptionEnum {
    /**
     * collections empty
     */
    COLLECTIONS_EMPTY(10001, "collections empty!"),
    /**
     * run time exception
     */
    RUN_TIME_EXCEPTION(10002, "run time exception"),

    /**
     * param exception
     */
    PARAM_EXCEPTION(10003, "param exception");


    private final int code;
    private final String message;

    ExceptionEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public int getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
