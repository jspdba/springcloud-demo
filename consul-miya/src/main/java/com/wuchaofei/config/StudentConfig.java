package com.wuchaofei.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 *
 * @author wuchaofei
 * 在本文中consul作为配置中心，有一个点需要注意，通过@Value注入的属性，修改consul的配置后，属性不能立即生效，需要服务重启。而通过@ConfigurationProperties注入的属性，修改consul的配置后，属性会立即生效，所以建议如果需要动态生效的配置，最好使使用@ConfigurationProperties进行属性的注入。
 * Created by cofco on 2019/3/28.
 */
@ConfigurationProperties(prefix = "student")
public class StudentConfig {
    private String name;
    private int age;
    private String sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "StudentConfig{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
