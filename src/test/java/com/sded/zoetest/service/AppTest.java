package com.sded.zoetest.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class AppTest {
    @Autowired
    ApplicationConfigService service;
    @Test
    public void testPick(){
        System.out.println(service.testPick());
    }
}
