package com.vvblog.service.impl;

import com.vvblog.dao.CommentDao;
import com.vvblog.domain.Comment;
import com.vvblog.service.CommentService;

/**
 * @program: vvblog
 * @description: 实现CommentService接口中的方法
 * @create: 2019-08-09
 */
public class CommentServiceImpl implements CommentService{
	 private CommentDao commentDao;
	@Override
	public Comment selectCommentById(Integer commentId) {
		return commentDao.selectCommentById(commentId);
	}
}
