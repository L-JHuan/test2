package com.rqwwp.dao;

import java.util.ArrayList;

/**
 * @author LJH
 * @version 1.0
 */
public interface UserDao {

    /**
     * 加载用户数据
     * @return 用户数据
     */
    public ArrayList<String> findAll();
}
