package com.vvblog.domain;

/**
 * @program: vvblog
 * @description:
 * pvt_private_message表对应
 * @author: Li Qixuan
 *
 * Id（主键）    pvtUsrId;
 * 接受方id     pvtRcvId;
 * 发送用户id   pvtSendId;
 * 发送时间     pvtSendTime;
 * 已读状态     private Integer pvtReadState;
 *
 *
 * @create: 2019-08-09 15:31
 */
public class PrivateMessage {
    private Integer pvtUsrId;
    private String pvtRcvId;
    private String pvtSendId;
    private String pvtSendTime;
    private String pvtReadState;



    public PrivateMessage() {

    }

    public Integer getPvtUsrId() {
        return pvtUsrId;
    }

    public void setPvtUsrId(Integer pvtUsrId) {
        this.pvtUsrId = pvtUsrId;
    }

    public String getPvtRcvId() {
        return pvtRcvId;
    }

    public void setPvtRcvId(String pvtRcvId) {
        this.pvtRcvId = pvtRcvId;
    }

    public String getPvtSendId() {
        return pvtSendId;
    }

    public void setPvtSendId(String pvtSendId) {
        this.pvtSendId = pvtSendId;
    }

    public String getPvtSendTime() {
        return pvtSendTime;
    }

    public void setPvtSendTime(String pvtSendTime) {
        this.pvtSendTime = pvtSendTime;
    }

    public String getPvtReadState() {
        return pvtReadState;
    }

    public void setPvtReadState(String pvtReadState) {
        this.pvtReadState = pvtReadState;
    }
}
