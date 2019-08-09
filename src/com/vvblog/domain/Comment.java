package com.vvblog.domain;

/**
 * @program: vvblog
 * @description:
 *
 * 评论表实例
 * ID    commentId
 * 评论内容 Cmt_cont  
 * 文章id   Cmt_art_id  
 * 时间     Cmt_time   
 * 点赞     Cmt_like
 * @create: 2019-08-09
 */
public class Comment {
	private Integer cmtUsrId;
	private String cmtCont;
	private String cmtArtId;
	private String cmtTime;
	private String cmtLike;
	public Integer getCmtUsrId() {
		return cmtUsrId;
	}
	public void setCmtUsrId(Integer cmtUsrId) {
		this.cmtUsrId = cmtUsrId;
	}
	public String getCmtCont() {
		return cmtCont;
	}
	public void setCmtCont(String cmtCont) {
		this.cmtCont = cmtCont;
	}
	public String getCmtArtId() {
		return cmtArtId;
	}
	public void setCmtArtId(String cmtArtId) {
		this.cmtArtId = cmtArtId;
	}
	public String getCmtTime() {
		return cmtTime;
	}
	public void setCmtTime(String cmtTime) {
		this.cmtTime = cmtTime;
	}
	public String getCmtLike() {
		return cmtLike;
	}
	public void setCmtLike(String cmtLike) {
		this.cmtLike = cmtLike;
	}
	@Override
	public String toString() {
		return "Comment [cmtUsrId=" + cmtUsrId + ", cmtCont=" + cmtCont
				+ ", cmtArtId=" + cmtArtId + ", cmtTime=" + cmtTime
				+ ", cmtLike=" + cmtLike + "]";
	}
	Comment(){
		
	}
}
