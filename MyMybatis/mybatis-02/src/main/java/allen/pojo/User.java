package allen.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Allen
 * @date 2020/11/12 16:52
 */

//  使用lombok
@NoArgsConstructor  //无参构造器
@AllArgsConstructor //所有构造器（get;set;有参构造器;toString;）
public class User {

    private int id;
    private String username;
    private String password;
}
