package com.vvblog.domain;

/**
 * @program: vvblog
 * @description:
 *
 * 用户信息表实例
 * ID    usrId
 * 昵称  usrNikeName
 * 账号  usrAccount
 * 密码  usrPswd
 * Email  usrEmail
 * tel    usrTel
 * 权限  usrPermissions
 * 状态[0/1 ]usrState
 * 关注数量  usrAttention
 *
 * @author: Li Qixuan
 * @create: 2019-08-09 13:08
 */
public class User {

    private Integer usrId;
    private String usrNikeName;
    private String usrAccount;
    private String UsrPswd;
    private String usrEmail;
    private String usrTel;
    private String usrPermissions;
    private String usrState;
    private String usrAttention;

    public Integer getUsrId() {
        return usrId;
    }

    public void setUsrId(Integer usrId) {
        this.usrId = usrId;
    }

    public String getUsrNikeName() {
        return usrNikeName;
    }

    public void setUsrNikeName(String usrNikeName) {
        this.usrNikeName = usrNikeName;
    }

    public String getUsrAccount() {
        return usrAccount;
    }

    public void setUsrAccount(String usrAccount) {
        this.usrAccount = usrAccount;
    }

    public String getUsrPswd() {
        return UsrPswd;
    }

    public void setUsrPswd(String usrPswd) {
        UsrPswd = usrPswd;
    }

    public String getUsrEmail() {
        return usrEmail;
    }

    public void setUsrEmail(String usrEmail) {
        this.usrEmail = usrEmail;
    }

    public String getUsrTel() {
        return usrTel;
    }

    public void setUsrTel(String usrTel) {
        this.usrTel = usrTel;
    }

    public String getUsrPermissions() {
        return usrPermissions;
    }

    public void setUsrPermissions(String usrPermissions) {
        this.usrPermissions = usrPermissions;
    }

    public String getUsrState() {
        return usrState;
    }

    public void setUsrState(String usrState) {
        this.usrState = usrState;
    }

    public String getUsrAttention() {
        return usrAttention;
    }

    public void setUsrAttention(String usrAttention) {
        this.usrAttention = usrAttention;
    }

    public User() {

    }
}
