package com.wuchaofei;

import brave.sampler.Sampler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author wuchaofei
 * Created by wuchaofei on 2019/3/28.
 */
@SpringBootApplication
@RestController
@RequestMapping("/zipkin")
public class ZipkinServiceHiApplication {
    private static final Logger logger = LoggerFactory.getLogger(ZipkinServiceHiApplication.class);
    @Autowired
    private RestTemplate restTemplate;

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(ZipkinServiceHiApplication.class, args);
    }

    @RequestMapping("hi")
    public String callHome(){
        logger.info("calling trace zipkin-service-hi");
        return restTemplate.getForObject("http://localhost:8989/zipkin/miya", String.class);
    }

    @RequestMapping("info")
    public String info(){
        logger.info("calling trace zipkin-service-hi");
        return "I'm service-hi";
    }

    @Bean
    public Sampler getSampler(){
        return Sampler.ALWAYS_SAMPLE;
    }

}
