package com.foued.springcloudfullname.controller.dao;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("SPRING-CLOUD-LASTNAME")
public interface LastNameClient {

    @GetMapping("/")
    String getLastName();
}
