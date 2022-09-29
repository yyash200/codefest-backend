package com.startyounguk.codefestbackend.service.impl;

import com.startyounguk.codefestbackend.entity.CommunicationEntity;
import com.startyounguk.codefestbackend.repository.CommunicationRepository;
import com.startyounguk.codefestbackend.service.CommmunicationService;
import com.startyounguk.codefestbackend.service.ContentModeratorService;
import com.startyounguk.codefestbackend.service.dto.Communication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;

@Service
public class ContentModeratorServiceImpl implements ContentModeratorService {

    @Value("${content-service.host}")
    private String contentServiceHost;

    @Value("${content-service.endpoint}")
    private String contentServiceEndpoint;

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public ModerateResponse moderateMessage(String message) throws MalformedURLException, URISyntaxException {


        String url = contentServiceHost + contentServiceEndpoint;

        UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(url)
                // Add query parameter
                .queryParam("PII", "true")
                .queryParam("classify", "True");

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.set("Ocp-Apim-Subscription-Key", "4dfd4c0f9e7d418f893c54ca54030e2e");
        httpHeaders.set("Content-Type", "text/plain");

        HttpEntity<String> httpEntity = new HttpEntity<>(message, httpHeaders);
        ResponseEntity<String> result = restTemplate.exchange(builder.build().toUri(), HttpMethod.POST, httpEntity, String.class);

        ModerateResponse moderateResponse = new ModerateResponse();
        moderateResponse.setHttpStatus(result.getStatusCode());
        moderateResponse.setResponse(result.getBody());

        return moderateResponse;
    }
}
