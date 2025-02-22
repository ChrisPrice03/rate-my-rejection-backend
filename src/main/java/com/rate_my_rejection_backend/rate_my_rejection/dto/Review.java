package com.rate_my_rejection_backend.rate_my_rejection.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@Entity
@Table(name = "review") // Explicitly define table name
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Ensure database generates ID
    //@Column(nullable = false, unique = true)
    private Long id;

    @JsonProperty("companyName")
    //@Column(nullable = false)
    private String companyName;

    @JsonProperty("role")
    //@Column(nullable = false)
    private String role;

    @JsonProperty("quality")
    private Integer quality;

    @JsonProperty("confidence")
    private Integer confidence;

    @JsonProperty("competitiveness")
    private Integer competitiveness;

    @JsonProperty("selected")
    private String selected;

    @JsonProperty("applyAgain")
    private Boolean applyAgain;

    @JsonProperty("numRounds")
    private Integer numRounds;

    @JsonProperty("other")
    private String other;

    // Default constructor
    public Review() {}

    // Parameterized constructor
    public Review(String companyName, String role, Integer quality, Integer confidence, Integer competitiveness, String selected, Boolean applyAgain, Integer numRounds, String other) {
        this.companyName = companyName;
        this.role = role;
        this.quality = quality;
        this.confidence = confidence;
        this.competitiveness = competitiveness;
        this.selected = selected;
        this.applyAgain = applyAgain;
        this.numRounds = numRounds;
        this.other = other;
    }

    public Long getId() {
        return id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

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

    public Boolean getApplyAgain() {
        return applyAgain;
    }

    public void setApplyAgain(Boolean applyAgain) {
        this.applyAgain = applyAgain;
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
