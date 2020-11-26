package allen.dao;

import allen.pojo.Student;

import java.util.List;

/**
 * @author Allen
 * @date 2020/11/22 15:13
 */
public interface StudentMapper {
    //根据查询嵌套处理
    List<Student> getStudents();

    //根据结果嵌套处理
    List<Student> getStudents2();
}
