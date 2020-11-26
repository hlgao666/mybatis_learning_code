import allen.dao.BlogMapper;
import allen.pojo.Blog;
import allen.utils.IDutils;
import allen.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.*;

/**
 * @author Allen
 * @date 2020/11/22 22:39
 */
public class MyTest {

    @Test
    public void insertBlog(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Blog blog = new Blog();
        blog.setId(IDutils.getID());
        blog.setTitle("py so easy");
        blog.setAuthor("保尔");
        blog.setCreateTime(new Date());
        blog.setViews(20);

        mapper.addBlog(blog);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void queryBlog(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Map<String,String> map = new HashMap<>();
//        map.put("title","java so easy");
        map.put("author","保尔");
        List<Blog> blogs = mapper.queryBlogIF(map);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }

        sqlSession.close();
    }

    @Test
    public void queryBlogChoose(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Map<String,String> map = new HashMap<>();
        map.put("title","java");
        map.put("views","510");

        List<Blog> blogs = mapper.queryBlogChoose(map);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }

        sqlSession.close();
    }

    @Test
    public void queryBlogForeach(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        HashMap map = new HashMap();
        ArrayList<Integer> ids = new ArrayList<>();
        ids.add(1);
        map.put("ids",ids);

        List<Blog> blogs = mapper.queryBlogForeach(map);
        for (Blog blog : blogs) {
            System.out.println("sqlSession"+blog);
        }
        sqlSession.close();


        //sqlSession2
        SqlSession sqlSession2 = MybatisUtils.getSqlSession();
        BlogMapper mapper2 = sqlSession2.getMapper(BlogMapper.class);

        HashMap map2 = new HashMap();
        ArrayList<Integer> ids2 = new ArrayList<>();
        ids2.add(1);
        map2.put("ids",ids2);

        List<Blog> blogs2 = mapper2.queryBlogForeach(map2);
        for (Blog blog : blogs2) {
            System.out.println("sqlSession2"+blog);
        }
        sqlSession2.close();
    }
}
