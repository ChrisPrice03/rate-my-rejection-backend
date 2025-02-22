package com.rate_my_rejection_backend.rate_my_rejection.controllers;

import com.rate_my_rejection_backend.rate_my_rejection.Service.CompanyService;
import com.rate_my_rejection_backend.rate_my_rejection.dto.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/home")
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @GetMapping
    public List<Company> companyList() {
        return companyService.getCompanies();
    }
}
