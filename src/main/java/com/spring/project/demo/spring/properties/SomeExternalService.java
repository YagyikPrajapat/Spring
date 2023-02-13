package com.spring.project.demo.spring.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SomeExternalService {

    @Value("${external.service.url}")
    private String url;

    public String getServiceUrl(){
        return url;
    }
}
