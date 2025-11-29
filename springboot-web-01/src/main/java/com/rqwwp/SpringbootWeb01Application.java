package com.rqwwp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// 这个注解声明了@ComponentScan注解，扫描的默认范围是启动类当前包及子包下的所有类，@Component注解要被这个扫描注解扫描到才能生效
public class SpringbootWeb01Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootWeb01Application.class, args);
    }

}
