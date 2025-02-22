package com.rate_my_rejection_backend.rate_my_rejection.controllers;

import com.rate_my_rejection_backend.rate_my_rejection.dto.Company;
import com.rate_my_rejection_backend.rate_my_rejection.dto.Review;
import com.rate_my_rejection_backend.rate_my_rejection.Service.CompanyService;
import com.rate_my_rejection_backend.rate_my_rejection.Service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
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
        Company company = companyService.getCompany(companyName);
        List<Review> reviews = reviewService.getReviews(companyName);

        Map<String, Object> response = new HashMap<>();
        response.put("reviews", reviews);
        response.put("company", company);

        return response;

    }
}
