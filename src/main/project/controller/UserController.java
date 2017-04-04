package project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import project.model.User;
import project.service.UserService;

import javax.servlet.http.HttpSession;

/**
 * Created by Miracle on 2017/3/11.
 */

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    //用户注册
    @RequestMapping("/register")
    public String register(User user,Model model){
        if(userService.findUser(user.getUsername())!= null){
            model.addAttribute("msg","该用户名已被注册~");
            return "msg_page";
        }
        userService.addUser(user);
        model.addAttribute("msg","您已成功注册~");
        return "msg_page";
    }

    //用户登录
    @RequestMapping("/login")
    public String login(String username, String password, HttpSession httpSession, Model model){

        if(userService.matchUser(username,password) !=null){

            httpSession.setAttribute("user",userService.findUser(username));
            userService.updateLoginTime(username);
            return "home_page";

        }else{
            model.addAttribute("msg","用户名密码错误！请重新登录！");
            return "msg_page";

        }
    }

    //退出登录
    @RequestMapping("/user/logout")
    public String logout(HttpSession httpSession,Model model){
        httpSession.removeAttribute("user");
        model.addAttribute("msg","您已退出登录");
        return "msg_page";
    }

    //查看用户资料
    @RequestMapping("/user/showuser/{username}")
    public String showUser(@PathVariable String username,Model model){
        model.addAttribute("userinfo",userService.findUser(username));
        return "user_page";
    }

    //更新资料
    @RequestMapping("/user/updateuser")
    public String updateUser(User user, String oldpassword, HttpSession httpSession, Model model){

        if(userService.matchUser(((User)httpSession.getAttribute("user")).getUsername(),oldpassword)!=null){
            userService.updateUser(user,((User)httpSession.getAttribute("user")).getUserid());
            model.addAttribute("msg","修改资料成功！");
        }
        else{
            model.addAttribute("msg","输入密码错误！");
        }
        return "msg_page";
    }

    @RequestMapping("/user/searchuser")
    public String searchUser(String username,Model model){
        if(userService.findUser(username)==null){
            model.addAttribute("msg","没有找到该用户!");
            return "msg_page";
        }
        model.addAttribute("userinfo",userService.findUser(username));
        return "";

    }

}


