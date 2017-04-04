package project.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import project.model.Blog;
import project.model.Comment;
import project.model.User;
import project.service.BlogService;
import project.service.FansService;
import project.tools.ComparatorBlog;
import project.tools.FDate;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Miracle on 2017/3/22.
 */

@Controller
@RequestMapping("/blog")
public class BlogController {

    @Autowired
    private BlogService blogservice;

    @Autowired
    private FansService fansservice;

    @Autowired
    private HttpSession httpSession;

    private static Logger logger = Logger.getLogger(BlogController.class);

    //发微博
    @RequestMapping("/add")
    public String addBlog(String blogcontent) {
        Blog blog = new Blog();
        blog.setUsername(((User) httpSession.getAttribute("user")).getUsername());
        blog.setBlogtime(FDate.getNowDate());
        blog.setContent(blogcontent);
        blogservice.addBlog(blog);
        logger.info("发出了微博一条~~");
        return "home_page";
    }

    //查看我的微博
    @RequestMapping("/getmybloglist")
    public String getMyBlog( Model model){
        model.addAttribute("bloglist",blogservice.getUserBlogList(((User) httpSession.getAttribute("user")).getUsername()));
        return "bloglist_page";
    }


    //查看微博详情
    @RequestMapping("/getblogdetail/{blogid}")
    public String getBlogDetail(@PathVariable("blogid") int blogid,Model model){
        model.addAttribute("blog",(Blog)blogservice.getBlog(blogid));
        model.addAttribute("commentlist",blogservice.getCommentList(blogid));
        return "blogdetail_page";
    }

    //微博评论
    @RequestMapping("/addcomment/{blogid}")
    public String addComment(@PathVariable("blogid") int blogid,String commentcontent){
        Comment comment = new Comment();
        comment.setContent(commentcontent);
        comment.setUsername(((User) httpSession.getAttribute("user")).getUsername());
        comment.setBlogid(blogid);
        comment.setCommenttime(FDate.getNowDate());
        blogservice.addComment(comment);
        blogservice.commentNumPlus(blogid);
        return "home_page";
    }

    //刷微博~
    @RequestMapping("/getbloglist")
    public String getBlogList(Model model){
        List<String> userlist = new ArrayList<String>();
        List<Blog> bloglist = new ArrayList<Blog>();
        userlist = fansservice.getFocusList(((User) httpSession.getAttribute("user")).getUsername());
        userlist.add(((User) httpSession.getAttribute("user")).getUsername());
        for(String username:userlist){
            bloglist.addAll(blogservice.getUserBlogList(username));
        }
        Collections.sort(bloglist,new ComparatorBlog());
        model.addAttribute("bloglist",bloglist);
        return "bloglist_page";
    }

}