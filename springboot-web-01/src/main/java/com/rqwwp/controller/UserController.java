package com.rqwwp.controller;

import cn.hutool.core.io.IoUtil;
import com.rqwwp.pojo.User;
import com.rqwwp.service.UserService;
import com.rqwwp.service.impl.UserServiceImpl;
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

    private UserService userService = new UserServiceImpl();

    @RequestMapping("/list")
    public List<User> list() {
        List<User> userList = userService.findAll();
        return userList;
    }
}
