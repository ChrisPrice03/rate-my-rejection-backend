package com.rate_my_rejection_backend.rate_my_rejection.controllers;

import com.rate_my_rejection_backend.rate_my_rejection.Service.ReviewService;
import com.rate_my_rejection_backend.rate_my_rejection.dto.Review;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private ReviewService reviewService;

    @GetMapping("/reviews/{username}")
    public List<Review> getUserReviews(@PathVariable String username) {
        return reviewService.getUserReviews(username);
    }
}