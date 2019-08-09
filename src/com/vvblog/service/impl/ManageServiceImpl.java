package com.vvblog.service.impl;

import com.vvblog.dao.ManageDao;
import com.vvblog.domain.Manage;

import com.vvblog.service.ManageService;

/**
 * @program: vvblog
 * @description:
 * 实现ManageService接口中的方法
 * @create: 2019-08-09
 */
public class ManageServiceImpl implements ManageService{
	private ManageDao manageDao;

    @Override
    public Manage selectManageById(Integer manageId){
        return manageDao.selectManageById(manageId);
    }

}
