package cn.cjj.blogcjj.service;

import cn.cjj.blogcjj.dao.PersonMapper;
import cn.cjj.blogcjj.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author CuiJunJie
 * @create 2021/4/19-19:26
 */

@Service
public class PersonService {
    @Autowired
    private PersonMapper personMapper;

    public Person getPersonById(Integer id) {
        return personMapper.getById(id);
    }
}
