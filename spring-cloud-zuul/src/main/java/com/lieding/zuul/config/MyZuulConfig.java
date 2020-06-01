package com.lieding.zuul.config;

import com.lieding.zuul.filter.MyZuulFilter;
import com.netflix.zuul.ZuulFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * cccccc
 */
@Configuration
public class MyZuulConfig {

    @Bean
    public ZuulFilter myZuulFilter() {
        return new MyZuulFilter();
    }
}
