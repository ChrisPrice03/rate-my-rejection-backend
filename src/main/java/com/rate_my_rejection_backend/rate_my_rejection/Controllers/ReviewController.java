package com.rate_my_rejection_backend.rate_my_rejection.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/company")
public class ReviewController {

    @GetMapping("/{companyName}")  // Dynamic path variable
    public String getCompanyInfo(@PathVariable String companyName) {
        return "[\n" +
                "  {\n" +
                "  \"name\": \"companyName\",\n" +
                "  \"rating\": 5,\n" +
                "  \"competitiveness\": 5,\n" +
                "  \"applyAgain\": 50\n" +
                "  },\n" +
                "  [\n" +
                "    {\n" +
                "      \"role\" : \"rolestr\",\n" +
                "      \"quality\" : 3,\n" +
                "      \"confidence\" : 3,\n" +
                "      \"competitiveness\": 3,\n" +
                "      \"selected\": \"selectStr\",\n" +
                "      \"numRounds\": 3,\n" +
                "      \"other\": \"otherInfo\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"role\" : \"rolestr2\",\n" +
                "      \"quality\" : 3,\n" +
                "      \"confidence\" : 4,\n" +
                "      \"competitiveness\": 3,\n" +
                "      \"selected\": \"selectStr\",\n" +
                "      \"numRounds\": 2,\n" +
                "      \"other\": \"otherInfo\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"role\" : \"rolestr3\",\n" +
                "      \"quality\" : 8,\n" +
                "      \"confidence\" : 6,\n" +
                "      \"competitiveness\": 1,\n" +
                "      \"selected\": \"selectStr\",\n" +
                "      \"numRounds\": 2,\n" +
                "      \"other\": \"otherInfo\"\n" +
                "    }\n" +
                "  ]\n" +
                "]";
    }
}
