package com.foued.springcloudfullname.controller;

import com.foued.springcloudfullname.controller.service.FullNameService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class FullNameController {

    @Autowired
    RestTemplate client;

    @Autowired
    FullNameService fullNameService;
    @GetMapping("/fullname")
    public @ResponseBody String getFullName() {
        long start = System.currentTimeMillis();
        String output = fullNameService.getFirstName()+ " "  + fullNameService.getLastName() + ".";
        long end = System.currentTimeMillis();
        return output + "Elapsed time (ms): " + (end - start);
    }


}
