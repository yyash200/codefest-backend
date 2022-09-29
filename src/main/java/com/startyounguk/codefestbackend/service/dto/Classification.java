package com.startyounguk.codefestbackend.service.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Classification {

    private Boolean ReviewRecommended;

    public Boolean getReviewRecommended() {
        return ReviewRecommended;
    }

    public void setReviewRecommended(Boolean reviewRecommended) {
        ReviewRecommended = reviewRecommended;
    }
}
