package com.pjqdyd.repository;

import com.pjqdyd.entity.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    /**
     * 测试保存用户
     */
    @Test
    public void save(){
        User user = new User();
        user.setId(1);
        user.setUserName("小明");
        user.setAge(18);
        User result = userRepository.save(user);
        Assert.assertNotNull(result);
    }

    @Test
    public void findById(){
        User result = userRepository.findById(1);
        System.out.println(result.toString());
        Assert.assertNotNull(result);
    }

}