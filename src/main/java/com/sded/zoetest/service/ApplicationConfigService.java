package com.sded.zoetest.service;

import com.sded.zoetest.config.ApplicationProperties;

import org.springframework.stereotype.Service;

@Service
public class ApplicationConfigService {
    
    private final ApplicationProperties applicationProperties;
    
    public ApplicationConfigService(ApplicationProperties applicationProperties){
        this.applicationProperties = applicationProperties;
    }

    public String testPick(){
        return applicationProperties.getKey();
    }
}
