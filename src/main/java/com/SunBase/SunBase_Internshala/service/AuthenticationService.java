package com.SunBase.SunBase_Internshala.service;

import com.SunBase.SunBase_Internshala.model.AuthenticationToken;
import com.SunBase.SunBase_Internshala.repository.IAuthenticationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    @Autowired
    IAuthenticationRepository authenticationRepository;

    public boolean authenticateUser(String userEmail, String token) {
        AuthenticationToken token1 = authenticationRepository.findByToken(token);
        String expectedEmail = token1.getUser().getUserEmail();
        return  expectedEmail.equals(userEmail);
    }
}
