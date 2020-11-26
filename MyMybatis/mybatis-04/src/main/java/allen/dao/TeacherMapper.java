package allen.dao;

import allen.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author Allen
 * @date 2020/11/22 15:13
 */
public interface TeacherMapper {

    //获取指定id的老师及其下所有学生信息
    Teacher getTeacher(@Param("tid") int id);

    //获取指定id的老师及其下所有学生信息
    Teacher getTeacher2(@Param("tid") int id);
}
