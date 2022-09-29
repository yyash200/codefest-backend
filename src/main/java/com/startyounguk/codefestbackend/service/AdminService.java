package com.startyounguk.codefestbackend.service;

import com.startyounguk.codefestbackend.entity.CommunicationEntity;

import java.util.List;

public interface AdminService {

    List<CommunicationEntity> getMessages();

}
