package allen.pojo;


import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Allen
 * @date 2020/11/22 22:15
 */
@Data
public class Blog implements Serializable {
    private String id;
    private String title;
    private String author;
    private Date createTime;
    private int views;
}
