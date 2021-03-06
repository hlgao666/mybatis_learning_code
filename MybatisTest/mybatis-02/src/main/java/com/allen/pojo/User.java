package com.allen.pojo;

import lombok.Data;
import org.apache.ibatis.type.Alias;

/**
 * @author Allen
 * @date 2020/10/26 9:38
 */

@Data
@Alias("user")
public class User {
    private Integer id;
    private String name;
    private String pwd;

    public User() {
    }

    public User(Integer id, String name, String pwd) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}
