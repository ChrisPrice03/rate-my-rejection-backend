package com.rate_my_rejection_backend.rate_my_rejection.Service;

import java.util.List;

import com.rate_my_rejection_backend.rate_my_rejection.dto.Review;
import com.rate_my_rejection_backend.rate_my_rejection.Repositories.ReviewRepository;
import org.springframework.stereotype.Service;

@Service
public class ReviewService {

    private ReviewRepository reviewRepository;

    public ReviewService(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    public List<Review> getReviews(String companyName) {
        return reviewRepository.findByCompanyName(companyName);
    }

    public Integer allReviews() {
        List<Review> total = reviewRepository.findAll();
        return total.size();
    }

    public Review createReview(String username, String companyName, String role, Integer quality, Integer confidence, Integer competitiveness, String selected, Boolean applyAgain, Integer numRounds, String other) {
        Review newReview = new Review(username, companyName, role, quality, confidence, competitiveness, selected, applyAgain, numRounds, other);
        return reviewRepository.save(newReview);
    }

    public List<Review> getUserReviews(String username) {
        return reviewRepository.findByUsername(username);
    }
}