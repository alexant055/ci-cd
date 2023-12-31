package com.jenkins.cicd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CiCdServiceTest {

    @Autowired
    private CiCdService service;

    @Test
    public void verifyApplicationCount() {
        Assertions.assertEquals(3, service.getApplications().size());
    }
}
