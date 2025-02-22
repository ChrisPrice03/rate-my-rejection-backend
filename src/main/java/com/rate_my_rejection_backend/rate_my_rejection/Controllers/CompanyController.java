//package com.rate_my_rejection_backend.rate_my_rejection.controllers;
//
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/home")
//public class CompanyController {
//
//    @GetMapping
//    public String companyList() {
//        return "[\n" +
//                "  {\n" +
//                "    \"name\": \"Google\",\n" +
//                "    \"rating\": 4.8,\n" +
//                "    \"competitiveness\": 5,\n" +
//                "    \"applyAgain\": 80\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"name\": \"Microsoft\",\n" +
//                "    \"rating\": 4.5,\n" +
//                "    \"competitiveness\": 4,\n" +
//                "    \"applyAgain\": 70\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"name\": \"Amazon\",\n" +
//                "    \"rating\": 4.2,\n" +
//                "    \"competitiveness\": 5,\n" +
//                "    \"applyAgain\": 60\n" +
//                "  }" +
//                "]";
//    }
//}

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
