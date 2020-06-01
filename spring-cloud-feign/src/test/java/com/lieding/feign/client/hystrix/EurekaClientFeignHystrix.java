package com.lieding.feign.client.hystrix;

import com.lieding.feign.client.EurekaClientFeign;
import com.lieding.feign.domain.Parent;
import com.lieding.feign.domain.Student;
import org.springframework.stereotype.Component;

/**
 * cccccc
 */
@Component
public class EurekaClientFeignHystrix implements EurekaClientFeign {
    @Override
    public String infoByFeign() {
        return "This is Feign with Hystrix";
    }

    @Override
    public Student getStudentByFeign(String name, String address) {
        return null;
    }

    @Override
    public Student postStudentByFeign(Parent parent) {
        return null;
    }
}
