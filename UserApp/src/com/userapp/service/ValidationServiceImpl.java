package com.userapp.service;

import com.userapp.exception.NameExistsException;
import com.userapp.exception.TooLongException;
import com.userapp.exception.TooShortException;

public class ValidationServiceImpl implements IValidationService {
    @Override
    public boolean validatePassword(String password) throws TooLongException, TooShortException {
        if(password.length() >= 16) throw new TooLongException("Password is too long.");
        if(password.length() <= 5) throw  new TooShortException("Password is too short.");
        return true;
    }

    @Override
    public boolean validateUsername(String username) throws NameExistsException {
        String[] usernamesList = {"bhargav", "ashwini","mohit","bhagya"};
        for (String userName : usernamesList ) {
            if(userName.equalsIgnoreCase(username)) {
                throw new NameExistsException("Name already Exists..");
            }
        }
//        return false;
                return true;
    }
}
