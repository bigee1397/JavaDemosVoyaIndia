package com.voterapp.exception;

public class UnderAgeException extends Exception{
    public UnderAgeException() {
    }

    public UnderAgeException(String message) {
        super(message);
    }
}
