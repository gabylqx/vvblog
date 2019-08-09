package com.vvblog.service;

import com.vvblog.domain.Comment;


/**
 * @program: vvblog
 * @description: 评论表service
 * @create: 2019-08-09 
 */
public interface CommentService {
	 /*通过用户id获取user对象
    参数：Integer 返回值：User*/
    public abstract Comment selectCommentById(Integer commentId);
}
