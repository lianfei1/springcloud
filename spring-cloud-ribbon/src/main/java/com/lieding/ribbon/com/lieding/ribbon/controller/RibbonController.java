package com.lieding.ribbon.com.lieding.ribbon.controller;

import com.lieding.ribbon.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * cccccc
 */
@RestController
public class RibbonController {

    @Autowired
    private RibbonService ribbonService;

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @GetMapping("/info")
    public String info() {
        return this.ribbonService.info();
    }

    @GetMapping("/serviceInfo")
    public Integer serviceInfo() {
        ServiceInstance serviceInstance = this.loadBalancerClient.choose("eureka-client");

        Integer port = serviceInstance.getPort();

        return port;


    }
}
