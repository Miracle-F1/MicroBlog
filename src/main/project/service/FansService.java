package project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.DAO.FansDAO;
import project.model.Follow;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Miracle on 2017/4/3.
 */
@Service
public class FansService {

    @Autowired
    private FansDAO fansdao;

    //新增一条关注记录
    public void follow(String focus,String fans){
        fansdao.save(focus,fans);
    }

    //删除一条关注记录
    public void unfollow(String focus,String fans){
        fansdao.delete(focus,fans);
    }

    //获取一个人的关注列表
    public List<String> getFocusList(String username){
        List<String> focuslist = new ArrayList<String>();
        for (Follow follow:fansdao.getFollowList(username)) {
            focuslist.add(follow.getFocus());
        }
        return focuslist;
    }

    //获取一个人的粉丝列表
    public List<String> getFansList(String username){
        List<String> fanslist = new ArrayList<String>();
        for (Follow follow:fansdao.getFollowList(username)) {
            fanslist.add(follow.getFans());
        }
        return fanslist;
    }

}
