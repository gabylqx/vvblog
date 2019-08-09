package com.vvblog.service;


import com.vvblog.domain.Manage;

/**
 * @program: vvblog
 * @description: 管理表service
 * @create: 2019-08-09
 */
public interface ManageService {
	/*
	 * 通过用户id获取Manage对象 参数：Integer 返回值：Manage
	 */
	public abstract Manage selectManageById(Integer manageId);
}
