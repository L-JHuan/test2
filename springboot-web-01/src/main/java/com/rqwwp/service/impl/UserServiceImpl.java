package com.rqwwp.service.impl;

import com.rqwwp.dao.UserDao;
import com.rqwwp.dao.impl.UserDaoImpl;
import com.rqwwp.pojo.User;
import com.rqwwp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 * @author LJH
 * @version 1.0
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> findAll() {
        List<String> lines = userDao.findAll();

        List<User> userList = lines.stream().map(s ->{
            String[] split = s.split(",");
            return new User(Integer.parseInt(split[0]), split[1], split[2], split[3], Integer.parseInt(split[4]), LocalDateTime.parse(split[5], DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        }).toList();

        return userList;
    }
}
