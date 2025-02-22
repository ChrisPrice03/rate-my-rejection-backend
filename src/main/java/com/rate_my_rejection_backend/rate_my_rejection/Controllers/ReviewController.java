package com.rate_my_rejection_backend.rate_my_rejection.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/company")
public class ReviewController {

    @GetMapping("/{companyName}")  // Dynamic path variable
    public String getCompanyInfo(@PathVariable String companyName) {
        return "company name";
    }
}
