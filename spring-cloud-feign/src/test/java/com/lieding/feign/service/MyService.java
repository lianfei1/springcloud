package com.lieding.feign.service;

import com.lieding.feign.domain.Parent;
import com.lieding.feign.domain.Student;

public interface MyService {
    String inforByFeign();

    Student getStudentByFeign(String name,String address);

    Student postStudentByFeign(Parent parent);
}