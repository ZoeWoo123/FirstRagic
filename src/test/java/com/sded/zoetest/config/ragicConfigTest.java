package com.sded.zoetest.config;

import com.sded.zoetest.service.CandidateService;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class ragicConfigTest {
    @Test
    public void ragicTest() {
        ApplicationProperties applicationProperties = new ApplicationProperties();
        System.out.println(applicationProperties.getKey());
        // CandidateService testCan = new CandidateService();
        // try{
        // testCan.getCandidate(" ");
        // }catch(Exception e){
        // e.printStackTrace();
        // }
    }

}
