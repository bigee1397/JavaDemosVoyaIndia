package com.voterapp.service;

import com.voterapp.exception.NotEligibleException;
import com.voterapp.exception.UnderAgeException;

public interface IElectionBoothService {
    boolean checkEligibility(int age, String locality, int vId) throws NotEligibleException;
}
