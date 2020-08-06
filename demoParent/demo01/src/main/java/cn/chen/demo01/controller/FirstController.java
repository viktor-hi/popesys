package cn.chen.demo01.controller;


import cn.chen.demo01.entity.User;
import cn.chen.demo01.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/first")

public class FirstController {
    @Autowired
    private UserMapper userMapper;

    @RequestMapping(value = "/getName",method = RequestMethod.GET)
    String home(@RequestParam String name) {
        User user = new User();
        user.setName("chenhaixin1");
        user.setAge(25);

        userMapper.insert(user);
        return "Hello World!"+name;
    }
    @RequestMapping(value = "/getUserInfo",method = RequestMethod.GET)
    String getUserInfo(@RequestParam String name) {
        User user = new User();
        user.setName("chenhaixin1");
        user.setAge(25);

        List<User> users = userMapper.selectList(null);
        System.out.println(users);
        return "Hello World!"+name;
    }

    @RequestMapping(value = "/getRequestParam",method = RequestMethod.GET)
    String getRequestParam(User user) {
        userMapper.insert(user);
        System.out.println(user);
        System.out.println(userMapper.selectList(null));
        return "Hello World!"+user.getName();
    }
    @RequestMapping(value = "/updateUser/{userid}/{age}",method = RequestMethod.GET)
    String updateUser(@PathVariable("age") Integer age,@PathVariable("userid") Integer userid) {

        User user1 = userMapper.selectById(userid);
        user1.setAge(age);
        userMapper.updateById(user1);
        user1.setAge(29);
        userMapper.updateById(user1);
        //System.out.println(userMapper.selectList(null));
        return "Hello World!"+user1.getVersion();
    }

    @RequestMapping(value = "/deleteUser/{userid}",method = RequestMethod.GET)
    String deleteUser(@PathVariable("userid") Integer userid) {

        //User user1 = userMapper.selectById(userid);

        userMapper.deleteById(userid);
        //user1.setAge(29);
        //userMapper.updateById(user1);
        //System.out.println(userMapper.selectList(null));
        return "Hello World!"+userid;
    }
}
