import allen.dao.TeacherMapper;
import allen.pojo.Teacher;
import allen.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author Allen
 * @date 2020/11/22 21:06
 */
public class MyTest {

    @Test
    public void getTeacher(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper teacherMapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher1 = teacherMapper.getTeacher(1);

        System.out.println(teacher1);

        sqlSession.close();
    }

    @Test
    public void getTeacher2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper teacherMapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher1 = teacherMapper.getTeacher2(1);

        System.out.println(teacher1);

        sqlSession.close();
    }
}
