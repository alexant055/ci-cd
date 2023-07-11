package com.jenkins.cicd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CiCdController {

    private final CiCdService service;

    public CiCdController(CiCdService service) {
        this.service = service;
    }

    @GetMapping("/applications")
    public List<Application> getApplications() {
        return service.getApplications();
    }
}
