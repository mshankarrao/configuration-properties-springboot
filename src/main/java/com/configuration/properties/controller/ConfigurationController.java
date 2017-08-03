package com.configuration.properties.controller;

import com.configuration.properties.config.MyConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by shankarraomata on 5/30/17.
 */
@RestController
public class ConfigurationController {

    @Autowired
    private MyConfig myConfig;

    @RequestMapping("/")
    public String testMessage()
    {
        return "Welcome";
    } 

    @RequestMapping("/message")
    public String testConfigurationProperties()
    {
        return myConfig.getAdminFirstName()+" is from Configuration/application properties";
    }
}
