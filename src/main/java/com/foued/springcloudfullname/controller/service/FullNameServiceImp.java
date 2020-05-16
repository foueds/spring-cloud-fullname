package com.foued.springcloudfullname.controller.service;

import com.foued.springcloudfullname.controller.dao.FirstNameClient;
import com.foued.springcloudfullname.controller.dao.LastNameClient;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FullNameServiceImp implements FullNameService {

    @Autowired
    LastNameClient lastNameClient;
    @Autowired
    FirstNameClient firstNameClient;

    @Override
    @HystrixCommand(fallbackMethod = "getFallbackFirstName")
    public String getFirstName() {
        return firstNameClient.getFirstName();
    }

    @Override
    public String getFallbackFirstName() {
        return "randomfirstname";
    }

    @Override
    @HystrixCommand(fallbackMethod = "getFallbackLastName")
    public String getLastName() {
        return lastNameClient.getLastName();
    }

    @Override
    public String getFallbackLastName() {
        return "randomlastname";
    }
}
