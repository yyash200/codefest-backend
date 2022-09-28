package com.startyounguk.codefestbackend.controller;

import com.startyounguk.codefestbackend.entity.UserMasterEntity;
import com.startyounguk.codefestbackend.repository.UserMasterRepository;
import com.startyounguk.codefestbackend.security.JwtHelper;
import com.startyounguk.codefestbackend.service.dto.LoginResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.HashMap;
import java.util.Map;

@RestController
public class LoginController {

    private final JwtHelper jwtHelper;
    @Autowired
    private UserMasterRepository userMasterRepository;
    private final PasswordEncoder passwordEncoder;

    public LoginController(JwtHelper jwtHelper, PasswordEncoder passwordEncoder) {
        this.jwtHelper = jwtHelper;
        this.passwordEncoder = passwordEncoder;
    }

    @PostMapping(path = "login", consumes = {MediaType.APPLICATION_FORM_URLENCODED_VALUE})
    public LoginResponse login(@RequestParam String email, @RequestParam String password) {
        UserMasterEntity userDetails;
        try {
            userDetails = userMasterRepository.findByEmail(email);
        } catch (UsernameNotFoundException e) {
            throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, "User not found");
        }

        if(password.equals(userDetails.getPassword())) {
            Map<String, String> claims = new HashMap<>();
            claims.put("email", email);
            claims.put("userId", userDetails.getEntityId());

            String jwt = jwtHelper.createJwtForClaims(email, claims);
            LoginResponse loginResponse = new LoginResponse();
            loginResponse.setJwt(jwt);
            return loginResponse;
        }
        throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, "User not authenticated");
    }
}
