package com.startyounguk.codefestbackend.controller;

import com.startyounguk.codefestbackend.entity.LandingEntity;
import com.startyounguk.codefestbackend.service.LandingService;
import com.startyounguk.codefestbackend.service.dto.LandingInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LandingController {

    @Autowired
    LandingService landingService;

    @GetMapping(value = "/land", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<LandingInfo> landingInfo() {

        return ResponseEntity.status(HttpStatus.OK).body(landingService.getLandingInfo());
    }

}
