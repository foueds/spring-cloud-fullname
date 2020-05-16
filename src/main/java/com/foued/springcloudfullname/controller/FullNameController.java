package com.foued.springcloudfullname.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class FullNameController {

    @Autowired
    RestTemplate client;

    @GetMapping("/fullname")
    public @ResponseBody
    String getFullName() {
        return
              getName("SPRING-CLOUD-FIRSTNAME") + " "
                    + getName("SPRING-CLOUD-LASTNAME") + ".";
    }

    public String getName(String service) {
        return client.getForObject("http://" + service, String.class);
    }

}
