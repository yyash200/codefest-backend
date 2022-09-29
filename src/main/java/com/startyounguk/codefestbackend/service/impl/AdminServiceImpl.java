package com.startyounguk.codefestbackend.service.impl;

import com.startyounguk.codefestbackend.entity.CommunicationEntity;
import com.startyounguk.codefestbackend.repository.CommunicationRepository;
import com.startyounguk.codefestbackend.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private CommunicationRepository communicationRepository;

    @Override
    public List<CommunicationEntity> getMessages() {
        return communicationRepository.findByMsgStatus("To Review");
    }
}
