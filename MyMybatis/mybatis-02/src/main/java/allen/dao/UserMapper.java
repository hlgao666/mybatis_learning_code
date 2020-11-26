package allen.dao;

import allen.pojo.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * @author Allen
 * @date 2020/11/12 16:55
 */
public interface UserMapper {

    //  使用注解增删改查

    @Select("select * from user")
    List<User> getUserList();

    @Delete("delete from user where id =#{id}")
    void deleteById(int id);
}
