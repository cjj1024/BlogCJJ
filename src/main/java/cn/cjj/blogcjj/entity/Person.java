package cn.cjj.blogcjj.entity;

import org.springframework.stereotype.Component;

/**
 * @author CuiJunJie
 * @create 2021/4/19-19:18
 */

@Component
public class Person {
    private Integer id;
    private String name;

    public Person() {
        System.out.println("Person()");
    }

    public Person(Integer id, String name) {
        System.out.println("Person(Integer id, String name)");
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
