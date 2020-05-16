package com.foued.springcloudfullname.controller.service;

public interface FullNameService {

    public String getFirstName();

    public String getLastName();

    public String getFallbackLastName();

    public String getFallbackFirstName();
}
