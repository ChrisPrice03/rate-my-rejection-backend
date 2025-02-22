package com.rate_my_rejection_backend.rate_my_rejection.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.rate_my_rejection_backend.rate_my_rejection.dto.Review;

public interface ReviewRepository extends JpaRepository<Review, Long> {
    List<Review> findByCompanyName(String companyName);

    Review save(Review review);
}