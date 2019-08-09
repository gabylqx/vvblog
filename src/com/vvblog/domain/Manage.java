package com.vvblog.domain;
/**
 * @program: vvblog
 * @description:
 *
 * 管理表实例
 * ID    ManageId
 * 置顶文章 Mng_top
 * 优先级 Mng_pri    
 * 过期时间 Mng_overduetime  
 * 状态 Mng_state
 * @create: 2019-08-09
 */
public class Manage {
	private Integer mngId;
	private String mngTop;
	private String mngPri;
	private String mngOdtime;
	private String mngState;
	public Integer getMngId() {
		return mngId;
	}
	public void setMngId(Integer mngId) {
		this.mngId = mngId;
	}
	public String getMngTop() {
		return mngTop;
	}
	public void setMngTop(String mngTop) {
		this.mngTop = mngTop;
	}
	public String getMngPri() {
		return mngPri;
	}
	public void setMngPri(String mngPri) {
		this.mngPri = mngPri;
	}
	public String getMngOdtime() {
		return mngOdtime;
	}
	public void setMngOdtime(String mngOdtime) {
		this.mngOdtime = mngOdtime;
	}
	public String getMngState() {
		return mngState;
	}
	public void setMngState(String mngState) {
		this.mngState = mngState;
	}
	Manage(){
		
	}
}
