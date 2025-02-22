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
import java.util.Map;
import java.util.HashMap;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private ReviewService reviewService;

    @GetMapping("/reviews/{username}")
    public Map<String, Object> getUserReviews(@PathVariable String username) {
        List<Review> reviews = reviewService.getUserReviews(username);

        double totalConfidence = 0;
        double totalCompetitiveness = 0;
        int totalNumRounds = 0;
        int applyYes = 0;
        int applyNo = 0;
        Map<String, Long> rejectTypeCount = new HashMap<>();

        for (Review review : reviews) {
            totalConfidence += review.getConfidence();
            totalCompetitiveness += review.getCompetitiveness();
            totalNumRounds += review.getNumRounds();
            applyYes += review.getApplyAgain() ? 1 : 0;
            applyNo += review.getApplyAgain() ? 0 : 1;

            rejectTypeCount.put(review.getSelected(), rejectTypeCount.getOrDefault(review.getSelected(), 0L) + 1);
        }

        int reviewCount = reviews.size();
        double confidence = reviewCount > 0 ? totalConfidence / reviewCount : 0;
        double competitiveness = reviewCount > 0 ? totalCompetitiveness / reviewCount : 0;
        double numRounds = reviewCount > 0 ? (double) totalNumRounds / reviewCount : 0;
        String rejectType = rejectTypeCount.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);

        Map<String, Object> response = new HashMap<>();

        response.put("confidence", confidence);
        response.put("competitveness", competitiveness);
        response.put("rejectType", rejectType);
        response.put("numRounds", numRounds);
        response.put("applyYes", applyYes);
        response.put("applyNo", applyNo);
        response.put("reviews", reviews);

        return response;
    }
}