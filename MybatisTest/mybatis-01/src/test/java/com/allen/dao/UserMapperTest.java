package com.allen.dao;

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

    @Test
    public void getUserLike(){

        SqlSession sqlSession = null;
        try{
            //获取SqlSession对象
            sqlSession = MybatisUtils.getSqlSession();
            //执行UserDao, getMapper()
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            List<User> userList = userMapper.getUserLike("a");
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

    @Test
    public void getUserById(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        System.out.println(mapper.getUserById(1));

        sqlSession.close();
    }

    @Test
    public void insertUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.insertUser(new User(2,"eeeee","125635"));

        //增删改需要提交事务
        sqlSession.commit();

        sqlSession.close();
    }

    //总结：如果参数过多，我们可以考虑直接使用Map实现，如果参数比较少，直接传递参数即可;
    //在使用方法的时候，Map的 key 为 sql中取的值即可，没有顺序要求！
    @Test
    public void insertUser2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("id",5);
        map.put("pwd","2223333");
        mapper.insertUser2(map);

        //增删改需要提交事务
        sqlSession.commit();

        sqlSession.close();
    }

    @Test
    public void updateUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.updateUser(new User(1,"gggggghkkkk","ghkgh"));

        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void deleteUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.deleteUser(2);
        sqlSession.commit();
        sqlSession.close();
    }
}
