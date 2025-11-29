package com.rqwwp;

import com.rqwwp.mapper.UserMapper;
import com.rqwwp.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest    // SpringBoot单元测试的注解 - 当前测试类中的测试方法运行时，
                    // 会启动springboot项目 - IOC容器也就创建好了
                    // IOC 容器创建好了，那如果想要测试IOC容器的哪个bean，直接在测试类注入就可以了
class SpringbootMybatisStartApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testFindAll() {
        List<User> users = userMapper.findAll();
        users.forEach(System.out::println);
    }

}
