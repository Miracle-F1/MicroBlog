package project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.DAO.UserDAO;
import project.model.User;
import project.tools.FDate;

/**
 * Created by Miracle on 2017/3/11.
 */
@Service("userService")
public class UserService {

    @Autowired
    private UserDAO userdao;

    //插入一条数据
    public void addUser(User user) {

        userdao.addUser(user);

    }

    //根据username、password查询是否存在数据
    public User matchUser(String username, String password) {

        return userdao.matchUser(username, password);

    }

    //更新用户资料
    public void updateUser(User user, int userid_1){
        userdao.updateUser(user,userid_1);
    }

    //根据username返回USER对象
    public User findUser(String username) {

        return userdao.findUser(username);
    }

    //登录后更新最后登录时间
    public void updateLoginTime(String username){

        userdao.updateLoginTime(username, FDate.getNowDate());

    }

}
