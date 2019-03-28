package com.wuchaofei;

import com.wuchaofei.config.StudentConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wuchaofei
 * Created by cofco on 2019/3/28.
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableConfigurationProperties({StudentConfig.class})
@RestController
public class ConsulMiyaApplication {
    public static void main(String[] args) {
//        new SpringApplicationBuilder(ConsulMiyaApplication.class).web(true).run(args);
        SpringApplication.run(ConsulMiyaApplication.class);
    }

    @RequestMapping("/hi")
    public String home() {
        return "hi ,i'm miya";
    }
}
