package com.lieding.eureka.client.controller;

import com.lieding.eureka.client.domain.Parent;
import com.lieding.eureka.client.domain.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.util.Random;

/**
 * cccccc
 */
@RestController
public class MyController {

    @Value("${student.information.address}")
    private String address;
    @Value("${student.information.name}")
    private String name;

    @GetMapping("/info")
    public String info() {

        int randomInt = new Random().nextInt(1200);
        System.out.println("randomInt" + randomInt);
        try{
            Thread.sleep(randomInt);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
        String result = "welcome: " + this.name + ", your address is" + this.name;

        return result;
    }

    @GetMapping("/getStudent")
    public Student geStudentByGetRequest(@RequestParam("name") String name,
                                         @RequestParam("address") String address,
                                         HttpServletRequest request) {

        System.out.println("authKey" + request.getHeader("authKey"));
        System.out.println("authKey2" + request.getHeader("authKey2"));
        System.out.println("name: " + name);
        System.out.println("address: " + address);

        Parent parent = new Parent();
        parent.setId(10);
        parent.setName("parentName");
        parent.setAddress("parentAddress");

        Student student = new Student();
        student.setId(20);
        student.setName(name);
        student.setAddress(address);
        student.setParent(parent);


        return student;
    }


    @PostMapping("/postStudent")
    public Student getStudentByPostRequest(@RequestBody Parent parent,
                                           HttpServletRequest request) {
        System.out.println("authKey" + request.getHeader("authKey"));
        System.out.println("authKey2" + request.getHeader("authKey2"));
        System.out.println(parent.getId());
        System.out.println(parent.getName());
        System.out.println(parent.getAddress());

        Student student = new Student();
        student.setId(30);
        student.setName("theStudent");
        student.setAddress("theAddress");
        student.setParent(parent);

        return student;
    }
}
