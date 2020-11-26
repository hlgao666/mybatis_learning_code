package com.allen.dao;

import com.allen.pojo.User;

import java.util.List;
import java.util.Map;

/**
 * @author Allen
 * @date 2020/10/26 10:33
 */
public interface UserMapper {
    List<User> getUserList();

    User getUserById(int id);

    void insertUser(User user);

    void updateUser(User user);

    void deleteUser(int id);

    void insertUser2(Map<String, Object> map);

    //模糊查询
    List<User> getUserLike(String value);
}
