package com.lieding.feign.client;

import com.lieding.feign.client.config.FeignClientConfig;
import com.lieding.feign.client.config.FeignClientInterceptorConfig;
import com.lieding.feign.client.hystrix.EurekaClientFeignHystrix;
import com.lieding.feign.domain.Parent;
import com.lieding.feign.domain.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "eureka-client",configuration = {FeignClientConfig.class, FeignClientInterceptorConfig.class},fallback = EurekaClientFeignHystrix.class)
public interface EurekaClientFeign {
    @GetMapping("/info")
    String infoByFeign();

    @GetMapping("/getStudent")
    Student getStudentByFeign(@RequestParam("name") String name, @RequestParam("address") String address);

    @PostMapping("/postStudent")
    Student postStudentByFeign(@RequestBody Parent parent) ;

}
