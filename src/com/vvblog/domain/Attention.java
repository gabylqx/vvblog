package com.vvblog.domain;

/**
 * @program: vvblog
 * @description:
 * 
 * 关注表信息实例
 * ID      		attId
 * 关联usr表 	attUsrId
 * 好友Id  		AttFrdId
 * 
 * @author: Chen gm
 * @create:
*/
public class Attention {
	
	private Integer attId;
	private Integer attUsrId;
	private Integer AttFrdId;
	
	public  Attention() {
		
	}

	public Attention(Integer attId, Integer attUsrId, Integer attFrdId) {
		
		this.attId = attId;
		this.attUsrId = attUsrId;
		AttFrdId = attFrdId;
	}

	public Integer getAttId() {
		return attId;
	}

	public void setAttId(Integer attId) {
		this.attId = attId;
	}

	public Integer getAttUsrId() {
		return attUsrId;
	}

	public void setAttUsrId(Integer attUsrId) {
		this.attUsrId = attUsrId;
	}

	public Integer getAttFrdId() {
		return AttFrdId;
	}

	public void setAttFrdId(Integer attFrdId) {
		AttFrdId = attFrdId;
	}

	@Override
	public String toString() {
		return "Attention [attId=" + attId + ", attUsrId=" + attUsrId + ", AttFrdId=" + AttFrdId + "]";
	}
	
	

}
