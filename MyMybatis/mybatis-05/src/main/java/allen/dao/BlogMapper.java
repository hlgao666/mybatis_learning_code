package allen.dao;

import allen.pojo.Blog;

import java.util.List;
import java.util.Map;

/**
 * @author Allen
 * @date 2020/11/22 22:21
 */
public interface BlogMapper {
    int addBlog(Blog blog);

    List<Blog> queryBlogIF(Map map);

    List<Blog> queryBlogChoose(Map map);

    List<Blog> queryBlogForeach(Map map);
}
