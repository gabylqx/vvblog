package com.vvblog.service;

import com.vvblog.domain.Attention;


/** 
* @program: vvblog
* @description: 关注表Service接口
* @author 作者: Chen gm 
* @version 创建时间：2019年8月9日 下午4:13:23 
*/
public interface AttentionService {

	 /*通过用户id获取Attention对象
    参数：Integer 返回值：Attention*/
    public abstract  Attention selectAttentionById(Integer attId);
}
