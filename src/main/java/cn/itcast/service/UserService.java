package cn.itcast.service;

import cn.itcast.model.User;

public interface UserService {

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
