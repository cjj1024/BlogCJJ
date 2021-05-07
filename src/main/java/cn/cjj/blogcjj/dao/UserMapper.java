package cn.cjj.blogcjj.dao;

import cn.cjj.blogcjj.entity.User;
import org.springframework.stereotype.Controller;

/**
 * @author CuiJunJie
 * @create 2021/4/29-16:26
 */

@Controller
public interface UserMapper {
    public User getUserById(Integer id);

    public User getUserByUsername(String username);

    public boolean saveUser(User user);
}
