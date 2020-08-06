package cn.chen.demo01;

import cn.chen.demo01.entity.User;
import cn.chen.demo01.mapper.UserMapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void TestQueryWrapper(){
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        //wrapper.ge("age", 20);
        wrapper.orderByAsc("age");

        List<User> users = userMapper.selectList(wrapper);
        System.out.println(users);
    }
}
