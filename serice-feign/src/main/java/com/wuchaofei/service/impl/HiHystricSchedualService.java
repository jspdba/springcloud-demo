package com.wuchaofei.service.impl;

import com.wuchaofei.service.HiSchedualService;
import org.springframework.stereotype.Component;

/**
 * @author wuchaofei
 * Created by cofco on 2019/3/25.
 */
@Component
public class HiHystricSchedualService implements HiSchedualService{
    @Override
    public String sayHiServiceOne(String name) {
        return "sorry "+name;
    }
}
