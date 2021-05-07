package cn.cjj.blogcjj.controller;

import cn.cjj.blogcjj.entity.Message;
import cn.cjj.blogcjj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author CuiJunJie
 * @create 2021/4/29-19:24
 */

@Controller
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping(value = "checkUsername/{username}", method = RequestMethod.GET)
    @ResponseBody
    public Message checkUsername(@PathVariable String username) {
        Message message = userService.checkUsername(username);
        System.out.println(message);

        return message;
    }

    @RequestMapping(value = "register", method = RequestMethod.POST)
    public String register(String username, String password) {
        if (username != null && !username.equals("") && password != null && !password.equals("")) {
            userService.register(username, password);
            return "success";
        }

        return "error";
    }

    @RequestMapping(value = "register", method = RequestMethod.GET)
    public String toRegisterPate() {
        return "register";
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    @ResponseBody
    public Message login(String username, String password) {
        return userService.login(username, password);
    }

    @RequestMapping(value="login", method = RequestMethod.GET)
    public String toLoginPage() {
        return "login";
    }
}
