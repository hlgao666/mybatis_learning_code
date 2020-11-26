package allen.pojo;

import lombok.Data;

import java.util.List;

/**
 * @author Allen
 * @date 2020/11/22 15:10
 */
@Data
public class Teacher {
    private int id;
    private String name;

    //一个老师拥有多个学生
    private List<Student> students;
}
