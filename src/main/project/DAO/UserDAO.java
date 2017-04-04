package project.DAO;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import project.model.User;

import java.util.List;

/**
 * Created by Miracle on 2017/3/10.
 */

@Repository("userdao")
public interface UserDAO {

    //添加用户
    public void addUser(User user);

    //删除用户
    public boolean deleteUser(int id);

    //更新用户资料
    public boolean updateUser(@Param("user") User user, @Param("userid_1") int userid_1);

    //检查用户名与密码是否匹配
    public User matchUser(@Param("username") String username, @Param("password") String password);

    //根据用户名查找用户
    public User findUser(String usernmae);

    //返回用户列表
    public List<User> allUser();

    //更新用户最后登录时间
    public void updateLoginTime(@Param("username") String username,@Param("logintime") String logintime);

}
