package com.rate_my_rejection_backend.rate_my_rejection.Service;

import java.util.Arrays;
import java.util.List;

import com.rate_my_rejection_backend.rate_my_rejection.dto.Company;
import org.springframework.stereotype.Service;

@Service
public class CompanyService {

    public List<Company> getCompany() {
        return Arrays.asList(new Company("fuck you, chris", 6.0, 9.0, 420));
    }

}