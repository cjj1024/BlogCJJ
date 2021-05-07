package cn.cjj.blogcjj.service;

import cn.cjj.blogcjj.dao.UserMapper;
import cn.cjj.blogcjj.entity.Message;
import cn.cjj.blogcjj.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author CuiJunJie
 * @create 2021/4/29-16:26
 */

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public Message login(String username, String password) {
        User user = userMapper.getUserByUsername(username);
        if (user != null && user.login(username, password)) {
            return new Message(200, "success");
        }

        return new Message(400, "登录失败");
    }

    public boolean register(String username, String password) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);

        return userMapper.saveUser(user);
    }

    public Message checkUsername(String username) {
        User user = userMapper.getUserByUsername(username);
        if (user != null) {
            return new Message(400, "用户名已存在");
        }

        return new Message(200, "success");
    }
}
