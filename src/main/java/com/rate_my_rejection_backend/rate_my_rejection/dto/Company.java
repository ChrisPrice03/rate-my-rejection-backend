package com.rate_my_rejection_backend.rate_my_rejection.dto;

// import jakarta.persistence.Entity;

// @Entity
public class Company {

    private Long id;

    private String name;
    private Double rating;
    private Double competitiveness;
    private Integer applyAgain;

    public Company() {
        super();
    }

    public Company(String name, Double rating, Double competitiveness, Integer applyAgain) {
        this.name = name;
        this.rating = rating;
        this.competitiveness = competitiveness;
        this.applyAgain = applyAgain;
    }

    public String getName() {
        return name;
    }

    public Double getRating() {
        return rating;
    }

    public Double getCompetitiveness() {
        return competitiveness;
    }

    public Integer getApplyAgain() {
        return applyAgain;
    }

}