package com.rqwwp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LJH
 * @version 1.0
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello(String name) {
        System.out.println("hello world");
        return "Hello !" +  name;
    }
}
