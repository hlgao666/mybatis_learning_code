import com.allen.dao.UserMapper;
import com.allen.pojo.User;
import com.allen.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Allen
 * @date 2020/11/12 17:11
 */
public class MyTest {

    static Logger logger = Logger.getLogger(MyTest.class);

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
            sqlSession.close();
        }
    }

    @Test
    public void updateUser(){
        SqlSession sqlSession = null;
        try{
            //获取SqlSession对象
            sqlSession = MybatisUtils.getSqlSession();
            //执行UserDao, getMapper()
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

            Map<String,Object> userMap = new HashMap<>();

            userMap.put("id",1);
            userMap.put("username","mazu");
            userMap.put("password","asdf");
            userMapper.updateUser(userMap);

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            //关闭sqlSession
            sqlSession.commit();
            sqlSession.close();
        }
    }

    @Test
    public void insertUser() {
        SqlSession sqlSession = null;

        try {
            sqlSession = MybatisUtils.getSqlSession();
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

            Map<String,Object> map = new HashMap<>();
            map.put("username","wangzai");
            map.put("password","1266666");
            userMapper.insertUser(map);

            // output log to console
//            logger.info("info: Mytest");
//            logger.debug("debug: Mytest");
//            logger.error("error: Mytest");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.commit();
            sqlSession.close();
        }
    }

    @Test
    public void getPageList(){
        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisUtils.getSqlSession();
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            Map<String,Object> map = new HashMap<>();
            map.put("startIndex",0);
            map.put("pageSize",3);
            List<User> userList = userMapper.getPageList(map);
            for (User user : userList) {
                System.out.println(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }
}
