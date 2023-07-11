package com.jenkins.cicd;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CiCdService {
    public List<Application> getApplications() {
        List<Application> list = new ArrayList<>();

        list.add(new Application("1", "Java", "Alex", "Oracle"));
        list.add(new Application("2", "Jenkins", "Alex", "Jen"));
        list.add(new Application("3", "Docker", "Kirubha", "Con"));

        return list;
    }
}
