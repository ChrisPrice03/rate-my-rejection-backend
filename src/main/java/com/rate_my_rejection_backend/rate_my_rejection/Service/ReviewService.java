package com.rate_my_rejection_backend.rate_my_rejection.Service;

import java.util.Arrays;
import java.util.List;

import com.rate_my_rejection_backend.rate_my_rejection.dto.Review;
import org.springframework.stereotype.Service;

@Service
public class ReviewService {

    public List<Review> getReviews(String company) {
        return Arrays.asList(new Review("role1", 1, 1, 1, "selected", 1, "other"));
    }

}