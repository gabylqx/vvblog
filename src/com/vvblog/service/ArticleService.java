package com.vvblog.service;

import com.vvblog.domain.Article;

/** 
* @program: vvblog
* @description:文章信息表service
* @author 作者: Chen gm 
* @version 创建时间：2019年8月9日 下午4:01:57 
* 
*/
public interface ArticleService {

	  /*通过用户id获取atcId对象
    参数：Integer 返回值：Article*/
    public abstract Article selectArticleById(Integer atcId);
}
