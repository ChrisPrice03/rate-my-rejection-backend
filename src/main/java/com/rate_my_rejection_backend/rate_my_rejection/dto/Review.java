package com.rate_my_rejection_backend.rate_my_rejection.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Review {

    @Id
    private Long id;

    @JsonProperty("role")
    private String role;

    @JsonProperty("quality")
    private Integer quality;

    @JsonProperty("confidence")
    private Integer confidence;

    @JsonProperty("competitiveness")
    private Integer competitiveness;

    @JsonProperty("selected")
    private String selected;

    @JsonProperty("numRounds")
    private Integer numRounds;

    @JsonProperty("other")
    private String other;

    // Default constructor
    public Review() {
        super();
    }

    public Review(String role, Integer quality, Integer confidence, Integer competitiveness, String selected, Integer numRounds, String other) {
        this.role = role;
        this.quality = quality;
        this.confidence = confidence;
        this.competitiveness = competitiveness;
        this.selected = selected;
        this.numRounds = numRounds;
        this.other = other;
    }

    // Getters and setters
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Integer getQuality() {
        return quality;
    }

    public void setQuality(Integer quality) {
        this.quality = quality;
    }

    public Integer getConfidence() {
        return confidence;
    }

    public void setConfidence(Integer confidence) {
        this.confidence = confidence;
    }

    public Integer getCompetitiveness() {
        return competitiveness;
    }

    public void setCompetitiveness(Integer competitiveness) {
        this.competitiveness = competitiveness;
    }

    public String getSelected() {
        return selected;
    }

    public void setSelected(String selected) {
        this.selected = selected;
    }

    public Integer getNumRounds() {
        return numRounds;
    }

    public void setNumRounds(Integer numRounds) {
        this.numRounds = numRounds;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }
}