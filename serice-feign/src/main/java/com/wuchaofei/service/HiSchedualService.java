package com.wuchaofei.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author wuchaofei
 * Created by wuchaofei on 2019/3/25.
 */

@FeignClient(value = "eureka-client")
public interface HiSchedualService {
    @RequestMapping(value = "hi", method = RequestMethod.GET)
    String sayHiServiceOne(@RequestParam(value = "name") String name);
}
