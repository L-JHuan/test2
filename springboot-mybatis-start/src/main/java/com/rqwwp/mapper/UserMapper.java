package com.rqwwp.mapper;

import com.rqwwp.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author LJH
 * @version 1.0
 */
@Mapper             // 一旦添加了这个注解，应用程序在启动的时候会自动为这个接口创建一个实现类对象（代理对象），
                    // 并且会自动将这个实现类对象存入到IOC容器中  - bean
public interface UserMapper {

    /**
     * 查询所有用户
     */
    @Select("select * from user")
    public List<User> findAll();

    /**
     * 根据id删除用户
     */
    @Delete("delete from user where id = #{id} ")
    public void deleteById(Integer id);

    /**
     * 添加用户
     */
    @Insert("insert into user(username, password, name, age) values (#{username}, #{password}, #{name}, #{age})")
    public void insert(User user);

    /**
     * 修改用户
     */
    @Update("update user set username = #{username}, password = #{password}, name = #{name}, age = #{age} where id = #{id} ")
    public void update(User user);
}
