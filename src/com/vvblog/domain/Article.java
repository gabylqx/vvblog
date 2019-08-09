package com.vvblog.domain;

/**
 * @program: vvblog
 * @description:
 * 
 * 文章信息表实例
 * 文章ID			atcId  	      
 * 关联user表id  	atcUsrId 	
 * 标题              		atcTitle     
 * 内容 				atcCont
 * 图片地址			atcImgPath
 * 点赞   			atcLike 
 * 访问				atcAcc
 * 时间戳			atcTime
 *
 * @author: cgm
 * @create: 2019-08-09 13:08
 */
public class Article {
	
	private Integer atcId;
	private Integer  actUserId;
	private String  atcTitle;
	private String  atcCont;
	private String  atcImgPath;
	private String  atcLike;
	private String  atcAcc;
	private String  atcTime;
	
	public Article() {
		
	}

	public Article(Integer atcId, Integer actUserId, String atcTitle, String atcCont, String atcImgPath, String atcLike,
			String atcAcc, String atcTime) {
		
		this.atcId = atcId;
		this.actUserId = actUserId;
		this.atcTitle = atcTitle;
		this.atcCont = atcCont;
		this.atcImgPath = atcImgPath;
		this.atcLike = atcLike;
		this.atcAcc = atcAcc;
		this.atcTime = atcTime;
	}

	public Integer getAtcId() {
		return atcId;
	}

	public void setAtcId(Integer atcId) {
		this.atcId = atcId;
	}

	public Integer getActUserId() {
		return actUserId;
	}

	public void setActUserId(Integer actUserId) {
		this.actUserId = actUserId;
	}

	public String getAtcTitle() {
		return atcTitle;
	}

	public void setAtcTitle(String atcTitle) {
		this.atcTitle = atcTitle;
	}

	public String getAtcCont() {
		return atcCont;
	}

	public void setAtcCont(String atcCont) {
		this.atcCont = atcCont;
	}

	public String getAtcImgPath() {
		return atcImgPath;
	}

	public void setAtcImgPath(String atcImgPath) {
		this.atcImgPath = atcImgPath;
	}

	public String getAtcLike() {
		return atcLike;
	}

	public void setAtcLike(String atcLike) {
		this.atcLike = atcLike;
	}

	public String getAtcAcc() {
		return atcAcc;
	}

	public void setAtcAcc(String atcAcc) {
		this.atcAcc = atcAcc;
	}

	public String getAtcTime() {
		return atcTime;
	}

	public void setAtcTime(String atcTime) {
		this.atcTime = atcTime;
	}

	@Override
	public String toString() {
		return "Article [atcId=" + atcId + ", actUserId=" + actUserId + ", atcTitle=" + atcTitle + ", atcCont="
				+ atcCont + ", atcImgPath=" + atcImgPath + ", atcLike=" + atcLike + ", atcAcc=" + atcAcc + ", atcTime="
				+ atcTime + "]";
	}
	
    
}



