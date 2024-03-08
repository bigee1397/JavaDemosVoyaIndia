package com.voya.exceptions.custom;

public class VoyaBank {
    double balance;

    public VoyaBank(double balance) {
        this.balance = balance;
    }
    void withdraw(double amount) throws OutOfLimitsException, NegativeBalanceException {
        try {
            if (balance - amount <= 0)
                throw new NegativeBalanceException("Balance is negative.");
            if (amount > 1000)
                throw new OutOfLimitsException("Limit is exceeded.");
        } catch (Exception e) {
            System.out.println("Exception...." + e.getMessage());
            throw e;
        } finally {
            System.out.println("Close connection.");
        }
    }
}
