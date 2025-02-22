package com.rate_my_rejection_backend.rate_my_rejection.service;

import com.rate_my_rejection_backend.rate_my_rejection.dto.Login;
import com.rate_my_rejection_backend.rate_my_rejection.Repositories.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.rate_my_rejection_backend.rate_my_rejection.dto.Review;


import java.util.List;

@Service
public class LoginService {

    @Autowired
    private LoginRepository loginRepository;

    public boolean validateCredentials(String username, String password) {
        return loginRepository.existsByUsernameAndPassword(username, password);
    }

    public Login createUser(String username, String password) {
        Login newUser = new Login(username, password);
        return loginRepository.save(newUser);
    }
}