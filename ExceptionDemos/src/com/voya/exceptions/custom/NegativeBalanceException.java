package com.voya.exceptions.custom;

public class NegativeBalanceException extends Exception{
    public NegativeBalanceException() {
    }

    public NegativeBalanceException(String message) {
        super(message);
    }
}
