package com.lieding.feign.service.impl;

import com.lieding.feign.client.EurekaClientFeign;
import com.lieding.feign.domain.Parent;
import com.lieding.feign.domain.Student;
import com.lieding.feign.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * cccccc
 */
@Service
public class MyServiceImpl implements MyService {
    @Autowired
    private EurekaClientFeign eurekaClientFeign;
    @Override
    public String inforByFeign() {
        return this.eurekaClientFeign.infoByFeign();
    }

    @Override
    public Student getStudentByFeign(String name, String address) {
        return this.eurekaClientFeign.getStudentByFeign(name,address);
    }

    @Override
    public Student postStudentByFeign(Parent parent) {
        return this.eurekaClientFeign.postStudentByFeign(parent);
    }
}
