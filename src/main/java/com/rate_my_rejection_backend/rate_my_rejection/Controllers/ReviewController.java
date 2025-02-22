package com.rate_my_rejection_backend.rate_my_rejection.controllers;

import com.rate_my_rejection_backend.rate_my_rejection.dto.Company;
import com.rate_my_rejection_backend.rate_my_rejection.dto.Review;
import com.rate_my_rejection_backend.rate_my_rejection.Service.CompanyService;
import com.rate_my_rejection_backend.rate_my_rejection.Service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/company")
public class ReviewController {

    @Autowired
    private CompanyService companyService;

    @Autowired
    private ReviewService reviewService;

    @GetMapping("/{companyName}")  // Dynamic path variable
    public Map<String, Object> getCompanyInfo(@PathVariable String companyName) {
        Company company = companyService.checkCompany(companyName);
        List<Review> reviews = reviewService.getReviews(companyName);

        Map<String, Object> response = new HashMap<>();
        response.put("reviews", reviews);
        response.put("company", company);

        return response;
    }

//    @PostMapping("/review")
//    public Review createReview(@RequestBody Review review) {
//        Company company = companyService.checkCompany(review.getCompanyName());
//        //Review newReview = reviewService.createReview(companyName, role, quality, confidence, competitiveness, selected, applyAgain, numRounds, other);
//        List<Review> reviews = reviewService.getReviews(review.getCompanyName());
//
//        companyService.loadCompany(company, reviews);
//        return review;
//    }
    @PostMapping("/review")
    public Review createReview(@RequestBody Map<String, Object> requestBody) {
        // Extract values with proper type casting and naming adjustments
        String companyName = (String) requestBody.get("companyName");
        String role = (String) requestBody.get("role");
        Integer quality = (Integer) requestBody.get("quality");
        Integer confidence = (Integer) requestBody.get("confidence");
        Integer competitiveness = (Integer) requestBody.get("compet"); // JSON: "compet" → Constructor: "competitiveness"
        String selected = (String) requestBody.get("rejected"); // JSON: "rejected" → Constructor: "selected"
        Integer numRounds = (Integer) requestBody.get("rounds"); // JSON: "rounds" → Constructor: "numRounds"
        String other = (String) requestBody.get("other");
        Boolean applyAgain = (Boolean) requestBody.get("applyAgain");

        // Ensure company exists
        Company company = companyService.checkCompany(companyName);

        // Create Review object with the correctly mapped values
        Review review = reviewService.createReview(companyName, role, quality, confidence, competitiveness, selected, applyAgain, numRounds, other);

        // Save and associate review with company
        List<Review> reviews = reviewService.getReviews(companyName);
        companyService.loadCompany(company, reviews);

        return review; // Persist the review
    }
}
