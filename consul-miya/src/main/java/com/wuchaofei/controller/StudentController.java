package com.wuchaofei.controller;

import com.wuchaofei.config.StudentConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wuchaofei
 * Created by cofco on 2019/3/28.
 */
@RestController
@RequestMapping("/test")
public class StudentController {
    @Value("${myName}")
    private String myName;

    @Autowired
    private StudentConfig studentConfig;

    @RequestMapping("/myname")
    public String testHello() {
        System.out.println("my name is : " + myName);
        return myName;
    }

    @RequestMapping("/config")
    public String testConfig() {
        System.out.println(studentConfig.toString());
        return studentConfig.toString();
    }
}
