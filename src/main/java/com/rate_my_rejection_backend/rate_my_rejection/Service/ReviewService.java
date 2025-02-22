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

}