package com.rate_my_rejection_backend.rate_my_rejection.Service;

import java.util.List;
import java.util.Optional;

import com.rate_my_rejection_backend.rate_my_rejection.dto.Company;
import com.rate_my_rejection_backend.rate_my_rejection.dto.Review;
import com.rate_my_rejection_backend.rate_my_rejection.Repositories.CompanyRepository;
import org.springframework.stereotype.Service;


@Service
public class CompanyService {

    private CompanyRepository companyRepository;

    public CompanyService(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    public List<Company> getCompanies() {
        return companyRepository.findAll();
    }

    public Company checkCompany(String companyName) {
        Optional<Company> existingCompany = companyRepository.findByName(companyName);
        if (existingCompany.isPresent()) {
            return existingCompany.get();
        } else {
            Company newCompany = new Company(companyName, 0.0, 0.0, 0);
            // Set other default properties for the new company if needed
            return companyRepository.save(newCompany);
        }
    }

    public void loadCompany(Company company, List<Review> reviews) {
        Integer numReviews = reviews.size();
        Double avgRating = 0.0;
        Double avgCompetitiveness = 0.0;
        Integer percentApplyAgain = 0;

        for (int i = 0; i < numReviews; i++) {
            avgRating += reviews.get(i).getQuality();
            avgCompetitiveness += reviews.get(i).getCompetitiveness();
            if (reviews.get(i).getApplyAgain()) {
                percentApplyAgain++;
            }
        }

        avgRating /= numReviews;
        avgCompetitiveness /= numReviews;
        percentApplyAgain *= 100;
        percentApplyAgain /= numReviews;
        
        company.setRating(avgRating);
        company.setCompetitiveness(avgCompetitiveness);
        company.setApplyAgain(percentApplyAgain);

        companyRepository.save(company);
    }
}