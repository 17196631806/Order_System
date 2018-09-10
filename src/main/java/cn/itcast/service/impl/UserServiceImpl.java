package cn.itcast.service.impl;

import cn.itcast.dao.UserDao;
import cn.itcast.model.User;
import cn.itcast.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: order
 * @description:
 * @author: liu yan
 * @create: 2018-09-06 14:29
 */
@Service()
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User login(User user){
       return userDao.login(user);
    }

    @Override
    public void exit(){
        userDao.exit();
    }
}
