package com.wuchaofei.controller;

import com.wuchaofei.service.HiSchedualService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by cofco on 2019/3/25.
 */
@RestController
public class HiController {
    @Autowired
    HiSchedualService hiSchedualService;

    @RequestMapping(value = "/hi")
    public String sayHi(@RequestParam  String name){
        return hiSchedualService.sayHiServiceOne(name);
    }
}
