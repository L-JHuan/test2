package com.rqwwp.dao.impl;

import cn.hutool.core.io.IoUtil;
import com.rqwwp.dao.UserDao;
import com.rqwwp.pojo.User;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/**
 * @author LJH
 * @version 1.0
 */
public class UserDaoImpl implements UserDao {
    @Override
    public ArrayList<String> findAll() {
        InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("user.txt");
        ArrayList<String> list = IoUtil.readLines(inputStream, StandardCharsets.UTF_8, new ArrayList<>());
        return list;
    }
}
