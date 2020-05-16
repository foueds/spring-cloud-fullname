package com.foued.springcloudfullname.controller.dao;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("SPRING-CLOUD-FIRSTNAME")
public interface FirstNameClient {

    @GetMapping("/")
    String getFirstName();
}

