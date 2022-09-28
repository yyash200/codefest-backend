package com.startyounguk.codefestbackend.service.dto;

import org.springframework.lang.NonNull;

public class LoginResponse {

    @NonNull
    private String jwt;

    @NonNull
    public String getJwt() {
        return jwt;
    }

    public void setJwt(@NonNull String jwt) {
        this.jwt = jwt;
    }
}
