package com.lieding.feign.client.config;

import brave.sampler.Sampler;
import feign.Logger;
import feign.Retryer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static java.util.concurrent.TimeUnit.SECONDS;

/**
 * cccccc
 */
@Configuration
public class FeignClientConfig {

    @Bean
    public Retryer feignClientRetryer() {
        return new Retryer.Default(50,SECONDS.toMillis(2),6);
    }

    @Bean
    public Logger.Level feignClientLogLevel() {
        return Logger.Level.FULL;
    }

   /* @Bean
    public Sampler mySampler() {
        return Sampler.NEVER_SAMPLE;
    }*/


}
