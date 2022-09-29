package com.startyounguk.codefestbackend.service.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.startyounguk.codefestbackend.entity.CommunicationEntity;
import com.startyounguk.codefestbackend.entity.UserMasterEntity;
import com.startyounguk.codefestbackend.repository.CommunicationRepository;
import com.startyounguk.codefestbackend.repository.UserMasterRepository;
import com.startyounguk.codefestbackend.service.CommmunicationService;
import com.startyounguk.codefestbackend.service.ContentModeratorService;
import com.startyounguk.codefestbackend.service.dto.Communication;
import com.startyounguk.codefestbackend.service.dto.Moderate;
import com.startyounguk.codefestbackend.service.dto.UserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.util.Date;
import java.util.Map;

@Service
public class CommunicationServiceImpl implements CommmunicationService {

    @Autowired
    private ContentModeratorService contentModeratorService;

    @Autowired
    private CommunicationRepository communicationRepository;


    @Override
    public void postMessage(Communication comm) throws MalformedURLException, URISyntaxException, JsonProcessingException {

        CommunicationEntity communicationEntity = new CommunicationEntity();
        communicationEntity.setFromUser(comm.getSponsorId());
        communicationEntity.setToChild(comm.getChildId());
        communicationEntity.setDateSubmitted(new Date());
        communicationEntity.setMessage(comm.getMessage());

        //Call ML Content Moderator & save in DB
        ContentModeratorService.ModerateResponse moderateResponse = contentModeratorService.moderateMessage(comm.getMessage());

        if(moderateResponse.getHttpStatus().is2xxSuccessful()){

            ObjectMapper objectMapper = new ObjectMapper();
            Moderate moderate = objectMapper.readValue(moderateResponse.getResponse(), Moderate.class);

            communicationEntity.setMlCheckStatus(moderate.getClassification().getReviewRecommended() ? "Pass": "Fail");
            communicationEntity.setMsgStatus("Awaiting Admin Review");
//            communicationEntity.setMlComments(moderate.getClassification().get);
        }

        communicationRepository.save(communicationEntity);
    }
}
