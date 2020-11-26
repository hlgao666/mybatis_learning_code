package com.allen.dao;

import com.allen.pojo.User;

import java.util.List;
import java.util.Map;

/**
 * @author Allen
 * @date 2020/11/12 16:55
 */
public interface UserMapper {
    List<User> getUserList();

    void updateUser(Map<String,Object> map);

    void insertUser(Map<String,Object> map);

    List<User> getPageList(Map<String,Object> map);
}
