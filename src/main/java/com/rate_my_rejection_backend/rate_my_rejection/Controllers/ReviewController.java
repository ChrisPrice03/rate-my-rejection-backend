package com.rate_my_rejection_backend.rate_my_rejection.controllers;

import com.rate_my_rejection_backend.rate_my_rejection.dto.Company;
import com.rate_my_rejection_backend.rate_my_rejection.dto.Review;
import com.rate_my_rejection_backend.rate_my_rejection.Service.CompanyService;
import com.rate_my_rejection_backend.rate_my_rejection.Service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/company")
public class ReviewController {

    @Autowired
    private CompanyService companyService;

    @Autowired
    private ReviewService reviewService;

    @GetMapping("/{companyName}")  // Dynamic path variable
    public Map<String, Object> getCompanyInfo(@PathVariable String companyName) {
        Company company = companyService.getCompany(companyName);
        List<Review> reviews = reviewService.getReviews(companyName);

        Map<String, Object> response = new HashMap<>();
        response.put("reviews", reviews);
        response.put("company", company);

        return response;
//        return "[\n" +
//                "  {\n" +
//                "  \"name\": \"companyName\",\n" +
//                "  \"rating\": 5,\n" +
//                "  \"competitiveness\": 5,\n" +
//                "  \"applyAgain\": 50\n" +
//                "  },\n" +
//                "  [\n" +
//                "    {\n" +
//                "      \"role\" : \"rolestr\",\n" +
//                "      \"quality\" : 3,\n" +
//                "      \"confidence\" : 3,\n" +
//                "      \"competitiveness\": 3,\n" +
//                "      \"selected\": \"selectStr\",\n" +
//                "      \"numRounds\": 3,\n" +
//                "      \"other\": \"otherInfo\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"role\" : \"rolestr2\",\n" +
//                "      \"quality\" : 3,\n" +
//                "      \"confidence\" : 4,\n" +
//                "      \"competitiveness\": 3,\n" +
//                "      \"selected\": \"selectStr\",\n" +
//                "      \"numRounds\": 2,\n" +
//                "      \"other\": \"otherInfo\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"role\" : \"rolestr3\",\n" +
//                "      \"quality\" : 8,\n" +
//                "      \"confidence\" : 6,\n" +
//                "      \"competitiveness\": 1,\n" +
//                "      \"selected\": \"selectStr\",\n" +
//                "      \"numRounds\": 2,\n" +
//                "      \"other\": \"otherInfo\"\n" +
//                "    }\n" +
//                "  ]\n" +
//                "]";
    }
}
