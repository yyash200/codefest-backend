package com.startyounguk.codefestbackend.service.impl;

import com.startyounguk.codefestbackend.entity.UserMasterEntity;
import com.startyounguk.codefestbackend.repository.UserMasterRepository;
import com.startyounguk.codefestbackend.service.UserService;
import com.startyounguk.codefestbackend.service.dto.UserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMasterRepository userMasterRepository;

    @Override
    public UserDetails getUserDetails(String email) {
        UserDetails response = new UserDetails();
        UserMasterEntity userMasterEntity = userMasterRepository.findByEmail(email);
        response.setName(userMasterEntity.getFirstName()+" "+userMasterEntity.getLastName());
        response.setUserType(userMasterEntity.getUserTypeId().toString());
        return response;
    }
}
