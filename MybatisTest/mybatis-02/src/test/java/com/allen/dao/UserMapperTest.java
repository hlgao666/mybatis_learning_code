package com.allen.dao;

import com.allen.dao.UserMapper;
import com.allen.pojo.User;
import com.allen.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Allen
 * @date 2020/10/26 10:52
 */
public class UserMapperTest {
    @Test
    public void getUserList(){

        SqlSession sqlSession = null;
        try{
            //获取SqlSession对象
            sqlSession = MybatisUtils.getSqlSession();
            //执行UserDao, getMapper()
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            List<User> userList = userMapper.getUserList();
            for (User user : userList) {
                System.out.println(user);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            //关闭sqlSession
            assert sqlSession != null;
            sqlSession.close();
        }
    }

}
