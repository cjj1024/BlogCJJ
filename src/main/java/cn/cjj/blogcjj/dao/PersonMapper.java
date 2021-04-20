package cn.cjj.blogcjj.dao;

import cn.cjj.blogcjj.entity.Person;
import org.springframework.stereotype.Repository;

/**
 * @author CuiJunJie
 * @create 2021/4/19-19:19
 */

@Repository
public interface PersonMapper {
    Person getById(Integer id);
}
