package com.rqwwp.service;

import com.rqwwp.pojo.User;

import java.util.ArrayList;
import java.util.List;

/**
 * @author LJH
 * @version 1.0
 */
public interface UserService {

    /**
     * 查询所有用户信息
     * @return 用户信息
     */
    public List<User> findAll();
}
