package com.startyounguk.codefestbackend.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.startyounguk.codefestbackend.service.dto.Communication;
import com.startyounguk.codefestbackend.service.dto.UserDetails;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.util.Map;

public interface CommmunicationService {

    void postMessage(Communication comm) throws MalformedURLException, URISyntaxException, JsonProcessingException;

}
