package com.rate_my_rejection_backend.rate_my_rejection.Service;

import java.util.Arrays;
import java.util.List;

import com.rate_my_rejection_backend.rate_my_rejection.dto.Company;
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

    public Company getCompany(String company) {
        return new Company("fuck you, chris", 6.0, 9.0, 420);
    }
}