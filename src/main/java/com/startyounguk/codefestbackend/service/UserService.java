package com.startyounguk.codefestbackend.service;

import com.startyounguk.codefestbackend.service.dto.UserDetails;

public interface UserService {

    UserDetails getUserDetails(String email);

}
