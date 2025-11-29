package com.rqwwp.controller;

import cn.hutool.core.io.IoUtil;
import com.rqwwp.pojo.User;
import com.rqwwp.service.UserService;
import com.rqwwp.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * 用户信息Controller
 *
 * @author LJH
 * @version 1.0
 */
@RestController
public class UserController {

    @Autowired    // 应用程序运行时，会自动查询该类型的bean对象，并赋值给该成员变量
    private UserService userService;

    @RequestMapping("/list")
    public List<User> list() {
        List<User> userList = userService.findAll();
        return userList;
    }
}
