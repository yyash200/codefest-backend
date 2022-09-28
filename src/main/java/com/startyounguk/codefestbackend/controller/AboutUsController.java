package com.startyounguk.codefestbackend.controller;

import com.startyounguk.codefestbackend.service.dto.AboutUs;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AboutUsController {

    @GetMapping(value = "/aboutUs", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<AboutUs> about() {

        AboutUs aboutUs = new AboutUs();
        aboutUs.setText(
         "As a upcoming charity our promise is to act as a resource for young people from the age of 5 up to the age of 18 living in underprivileged and/or disadvantaged areas of Newham, London and the surrounding area by providing advice and assistance.");

        return ResponseEntity.status(HttpStatus.OK).body(aboutUs);
    }

}
