package project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import project.model.User;
import project.service.FansService;

import javax.servlet.http.HttpSession;

/**
 * Created by Miracle on 2017/4/3.
 */

@Controller
@RequestMapping("/fans")
public class FansController {

    @Autowired
    private FansService fansservice;

    @Autowired
    private HttpSession httpSession;

    //关注
    @RequestMapping("/follow/{focus}")
    public String follow(@PathVariable String focus, Model model){
        fansservice.follow(focus,((User)httpSession.getAttribute("user")).getUsername());
        model.addAttribute("msg","您已成功关注"+focus);
        return "msg_page";
    }

    //取关
    @RequestMapping("/unfollow/{focus}")
    public String unfollow(@PathVariable String focus,Model model){
        fansservice.unfollow(focus,((User)httpSession.getAttribute("user")).getUsername());
        model.addAttribute("msg","您已取消对"+focus+"的关注");
        return "msg_page";
    }
}
