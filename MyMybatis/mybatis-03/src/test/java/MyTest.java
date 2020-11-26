import allen.dao.StudentMapper;
import allen.dao.TeacherMapper;
import allen.pojo.Student;
import allen.pojo.Teacher;
import allen.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author Allen
 * @date 2020/11/22 15:22
 */
public class MyTest {
    public static void main(String[] args) {
//        SqlSession sqlSession = MybatisUtils.getSqlSession();
//        TeacherMapper teacherMapper = sqlSession.getMapper(TeacherMapper.class);
//        Teacher teacher = teacherMapper.getTeacher(1);
//        System.out.println(teacher);
//        sqlSession.close();

        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> students = studentMapper.getStudents2();
        for (Student student : students) {
            System.out.println(student);
        }
        sqlSession.close();
    }
}
