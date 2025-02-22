package com.rate_my_rejection_backend.rate_my_rejection.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.rate_my_rejection_backend.rate_my_rejection.dto.Company;
import java.util.Optional;


public interface CompanyRepository extends JpaRepository<Company, Long> {
    Optional<Company> findByName(String name);
}