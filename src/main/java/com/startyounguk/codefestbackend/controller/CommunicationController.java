package com.startyounguk.codefestbackend.controller;

import com.startyounguk.codefestbackend.service.CommmunicationService;
import com.startyounguk.codefestbackend.service.UserService;
import com.startyounguk.codefestbackend.service.dto.Communication;
import com.startyounguk.codefestbackend.service.dto.UserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationToken;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class CommunicationController {

    @Autowired
    private CommmunicationService commmunicationService;

    @PostMapping(value = "/communication", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UserDetails> sendMessage(@RequestBody Communication comm) {

        commmunicationService.postMessage(comm);

        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
