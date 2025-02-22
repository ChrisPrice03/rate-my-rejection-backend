package com.rate_my_rejection_backend.rate_my_rejection.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class DatabaseController {

    @GetMapping
    public String companyList() {
        return "[\n" +
                "  {\n" +
                "    \"name\": \"Google\",\n" +
                "    \"rating\": 4.8,\n" +
                "    \"competitiveness\": 5,\n" +
                "    \"applyAgain\": 80\n" +
                "  },\n" +
                "  {\n" +
                "    \"name\": \"Microsoft\",\n" +
                "    \"rating\": 4.5,\n" +
                "    \"competitiveness\": 4,\n" +
                "    \"applyAgain\": 70\n" +
                "  },\n" +
                "  {\n" +
                "    \"name\": \"Amazon\",\n" +
                "    \"rating\": 4.2,\n" +
                "    \"competitiveness\": 5,\n" +
                "    \"applyAgain\": 60\n" +
                "  }" +
                "]";
    }
}
