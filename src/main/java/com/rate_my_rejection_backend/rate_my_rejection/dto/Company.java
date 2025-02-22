//package com.rate_my_rejection_backend.rate_my_rejection.dto;
//
//import com.fasterxml.jackson.annotation.JsonProperty;
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.Id;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//
//@Entity
//public class Company {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @JsonProperty("name")
//    private String name;
//
//    @JsonProperty("rating")
//    private Double rating;
//
//    @JsonProperty("competitiveness")
//    private Double competitiveness;
//
//    @JsonProperty("applyAgain")
//    private Integer applyAgain;
//
//    // Default constructor
//    public Company() {
//        super();
//    }
//
//    // Parameterized constructor
//    public Company(String name, Double rating, Double competitiveness, Integer applyAgain) {
//        this.name = name;
//        this.rating = rating;
//        this.competitiveness = competitiveness;
//        this.applyAgain = applyAgain;
//    }
//
//    // Getters and setters
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public Double getRating() {
//        return rating;
//    }
//
//    public void setRating(Double rating) {
//        this.rating = rating;
//    }
//
//    public Double getCompetitiveness() {
//        return competitiveness;
//    }
//
//    public void setCompetitiveness(Double competitiveness) {
//        this.competitiveness = competitiveness;
//    }
//
//    public Integer getApplyAgain() {
//        return applyAgain;
//    }
//
//    public void setApplyAgain(Integer applyAgain) {
//        this.applyAgain = applyAgain;
//    }
//}

package com.rate_my_rejection_backend.rate_my_rejection.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@Entity
@Table(name = "company") // Explicitly define the table name
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Ensure DB generates the ID
    private Long id;

    @JsonProperty("name")
    @Column(nullable = false) // Ensure the column is NOT NULL
    private String name;

    @JsonProperty("rating")
    private Double rating;

    @JsonProperty("competitiveness")
    private Double competitiveness;

    @JsonProperty("applyAgain")
    private Integer applyAgain;

    // Default constructor
    public Company() {}

    // Parameterized constructor
    public Company(String name, Double rating, Double competitiveness, Integer applyAgain) {
        this.name = name;
        this.rating = rating;
        this.competitiveness = competitiveness;
        this.applyAgain = applyAgain;
    }

    // Getters and setters
    public Long getId() { // Add getter for ID
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public Double getCompetitiveness() {
        return competitiveness;
    }

    public void setCompetitiveness(Double competitiveness) {
        this.competitiveness = competitiveness;
    }

    public Integer getApplyAgain() {
        return applyAgain;
    }

    public void setApplyAgain(Integer applyAgain) {
        this.applyAgain = applyAgain;
    }
}
