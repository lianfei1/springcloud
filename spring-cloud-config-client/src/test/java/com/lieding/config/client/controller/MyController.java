package com.lieding.config.client.controller;

import com.lieding.config.client.config.ConfigClientConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * cccccc
 */
@RestController
public class MyController {

    @Autowired
    private ConfigClientConfig configClientConfig;

    @RequestMapping(value = "/hosts")
    public String getHost() {
        return configClientConfig.getRedisHost() + ", " +
                configClientConfig.getMysqlHost() + ", " +
                configClientConfig.getMongoHost();

    }
}
