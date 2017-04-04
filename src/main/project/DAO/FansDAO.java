package project.DAO;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import project.model.Follow;

import java.util.List;

/**
 * Created by Miracle on 2017/3/29.
 */
@Repository("FansDAO")
public interface FansDAO {

    //关注
    public void save(@Param("focus") String focus, @Param("fans") String fans);

    //取关
    public void delete(@Param("focus") String focus, @Param("fans") String fans);

    //获取关注列表
    public List<Follow> getFollowList(@Param("fans") String fans);

    //获取粉丝列表
    public List<Follow> getFansList(@Param("focus") String focus);

}
