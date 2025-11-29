package com.rqwwp.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *
 * 用户信息实体类
 *
 * @author LJH
 * @version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    // 开发中不建议使用基本数据类型，建议使用包装类
    private Integer id;
    private String username;
    private String password;
    private String name;
    private Integer age;
    private LocalDateTime updateTime;
}
