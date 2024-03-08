package com.voya.exceptions.custom;

public class OutOfLimitsException extends Exception{
    public OutOfLimitsException() {
        super();
    }

    public OutOfLimitsException(String message) {
        super(message);
    }
}
