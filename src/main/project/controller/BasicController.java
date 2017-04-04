package project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Miracle on 2017/3/11.
 */
@Controller
public class BasicController {

    //跳转至主页
    @RequestMapping("/home_page")
    public String homePage(){
        return "home_page";
    }

    //跳转至注册页
    @RequestMapping("/register_page")
    public String registerPage(){
        return "register_page";
    }

    //跳转至登录页
    @RequestMapping("/login_page")
    public String loginPage(){
        return "login_page";
    }

    //跳转至修改资料页
    @RequestMapping("/updateuser_page")
    public String updateUserPage(){ return "settings_page"; }
}
