package cn.cjj.blogcjj.entity;

import org.springframework.stereotype.Component;

/**
 * @author CuiJunJie
 * @create 2021/4/29-16:25
 */
@Component
public class User {
    private Integer id;
    private String username;
    private String password;

    public User() {
    }



    public User(Integer id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public boolean login(String username, String password) {
        if (this.username != null && this.username.equals(username) && this.password != password && this.password.equals(password)) {
            return true;
        }

        return false;
    }
}
