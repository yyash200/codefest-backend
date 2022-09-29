package com.startyounguk.codefestbackend.service;

import com.startyounguk.codefestbackend.service.dto.Communication;
import org.springframework.http.HttpStatus;

import java.net.MalformedURLException;
import java.net.URISyntaxException;

public interface ContentModeratorService {

    ModerateResponse moderateMessage(String message) throws MalformedURLException, URISyntaxException;

    class ModerateResponse {

         HttpStatus httpStatus;
         String response;

        public HttpStatus getHttpStatus() {
            return httpStatus;
        }

        public void setHttpStatus(HttpStatus httpStatus) {
            this.httpStatus = httpStatus;
        }

        public String getResponse() {
            return response;
        }

        public void setResponse(String response) {
            this.response = response;
        }
    }
}
