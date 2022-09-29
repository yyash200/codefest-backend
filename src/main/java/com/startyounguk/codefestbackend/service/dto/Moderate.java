package com.startyounguk.codefestbackend.service.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Moderate {

    private String OriginalText;
    private String NormalizedText;
    private Classification Classification;

    public String getOriginalText() {
        return OriginalText;
    }

    public void setOriginalText(String originalText) {
        OriginalText = originalText;
    }

    public String getNormalizedText() {
        return NormalizedText;
    }

    public void setNormalizedText(String normalizedText) {
        NormalizedText = normalizedText;
    }

    public com.startyounguk.codefestbackend.service.dto.Classification getClassification() {
        return Classification;
    }

    public void setClassification(com.startyounguk.codefestbackend.service.dto.Classification classification) {
        Classification = classification;
    }
}
