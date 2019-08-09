package com.vvblog.service;

import com.vvblog.domain.User;

/**
 * @program: vvblog
 * @description: 用户信息表service
 * @author: Li Qixuan
 * @create: 2019-08-09 13:24
 */
public interface UserService {


    /*通过用户id获取user对象
    参数：Integer 返回值：User*/
    public abstract User selectUserById(Integer usrId);

}
