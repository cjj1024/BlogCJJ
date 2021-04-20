package cn.cjj.blogcjj.controller;

import cn.cjj.blogcjj.entity.Person;
import cn.cjj.blogcjj.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author CuiJunJie
 * @create 2021/4/19-16:23
 */

@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }

    @Autowired
    private PersonService personService;

    @RequestMapping("/person/{id}")
    public String getPersonById(@PathVariable Integer id, Model model) {
        Person person = personService.getPersonById(id);
        System.out.println(person);
        model.addAttribute("person", person);

        return "person";
    }
}
