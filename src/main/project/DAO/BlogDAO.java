package project.DAO;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import project.model.Blog;
import project.model.Comment;

import java.util.List;

/**
 * Created by Miracle on 2017/3/22.
 */
@Repository("blogdao")
public interface BlogDAO {

    public void addBlog(@Param("blog") Blog blog);

    public void deleteBlog(int blogid);

    public Blog getBlog(int blogid);

    public List<Blog> getMyBlogList(String username);

    public void addComment(@Param("comment") Comment comment);

    public List<Comment> getCommentList(int blogid);

    public void commentNumPlus(int blogid);
}
