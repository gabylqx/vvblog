package com.vvblog.service.impl;

import com.vvblog.dao.AttentionDao;
import com.vvblog.domain.Attention;
import com.vvblog.service.AttentionService;

/** 
* @program: vvblog
* @description: 
* @author 作者: Chen gm 
* @version 创建时间：2019年8月9日 下午4:16:29 
*/
public class AttentionServiceImpl implements AttentionService {
	private AttentionDao  attentionDao;
	@Override
	public  Attention selectAttentionById(Integer attId) {
		return attentionDao.selectAttentionById(attId);
	}

}
