package com.vvblog.service.impl;

import com.vvblog.dao.UserDao;
import com.vvblog.domain.User;
import com.vvblog.service.UserService;

/**
 * @program: vvblog
 * @description:
 * 实现UserService接口中的方法
 * @author: Li Qixuan
 * @create: 2019-08-09 13:26
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    @Override
    public User selectUserById(Integer usrId){
        return userDao.selectUserById(usrId);
    }

}
