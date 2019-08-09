package com.vvblog.service.impl;

import com.vvblog.dao.ArticleDao;
import com.vvblog.dao.UserDao;
import com.vvblog.domain.Article;
import com.vvblog.service.ArticleService;

/** 
* @program: vvblog
* @description: 实现ArticleService接口中的方法
* @author 作者: Chen gm 
* @version 创建时间：2019年8月9日 下午4:07:40 
*/
public class ArticleServiceImpl implements ArticleService {
	private ArticleDao articleDao;
	@Override
	public Article selectArticleById(Integer atcId) {
		 return articleDao.selectArticleById(atcId);
	}

}
