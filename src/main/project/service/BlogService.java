package project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.DAO.BlogDAO;
import project.model.Blog;
import project.model.Comment;

import java.util.List;

/**
 * Created by Miracle on 2017/3/22.
 */
@Service
public class BlogService {

    //自动注入blogDAO实例
    @Autowired
    private BlogDAO blogdao;

    //发一条新的微博
    public void addBlog(Blog blog){
        blogdao.addBlog(blog);
    }

    //获取个人的微博列表
    public List<Blog> getUserBlogList(String username){
        return blogdao.getMyBlogList(username);
    }

    //获取某条微博内容
    public Blog getBlog(int blogid){
        return blogdao.getBlog(blogid);
    }

    //添加评论
    public void addComment(Comment comment){
        blogdao.addComment(comment);
    }

    //获取评论列表
    public List<Comment> getCommentList(int blogid){
        return blogdao.getCommentList(blogid);
    }

    //增加评论数
    public void commentNumPlus(int blogid){ blogdao.commentNumPlus(blogid);}
}
