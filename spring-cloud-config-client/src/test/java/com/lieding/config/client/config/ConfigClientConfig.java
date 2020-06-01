package com.lieding.config.client.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

/**
 * cccccc
 */
@Configuration
@RefreshScope
public class ConfigClientConfig {
    @Value("${redis.host}")
    private String redisHost;
    @Value("${mysql.host}")
    private String mysqlHost;
    @Value("${mongo.host}")
    private String mongoHost;

    public String getRedisHost() {
        return redisHost;
    }

    public String getMysqlHost() {
        return mysqlHost;
    }

    public String getMongoHost() {
        return mongoHost;
    }
}
