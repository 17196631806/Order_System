package cn.itcast.dao;

import cn.itcast.model.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao {
    /**
     * 登录接口设计
     * @param user
     * @return
     */
    public User login(User user);

    /**
     * 退出接口设计
     */
    public void exit();
}
