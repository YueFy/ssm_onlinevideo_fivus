package usts.pojo;

import java.io.Serializable;

public class UserInfo implements Serializable {
    private Integer userId;

    private String fuId;

    private Integer status;

    private String registerTime;

    private String registerIp;

    private Integer role;

    private String loginTime;

    private String loginIp;

    private String mobile;

    private String gender;

    private String address;

    private String avatar;


    public UserInfo(Integer userId, String fuId, Integer status, String registerTime, String registerIp, Integer role, String loginTime, String loginIp, String mobile, String gender, String address, String avatar) {
        this.userId = userId;
        this.fuId = fuId;
        this.status = status;
        this.registerTime = registerTime;
        this.registerIp = registerIp;
        this.role = role;
        this.loginTime = loginTime;
        this.loginIp = loginIp;
        this.mobile = mobile;
        this.gender = gender;
        this.address = address;
        this.avatar = avatar;
    }

    public UserInfo() {
        super();
        this.userId = 0;
        this.fuId = null;
        this.status = 0;
        this.registerTime = null;
        this.registerIp = null;
        this.role = null;
        this.loginTime = null;
        this.loginIp = null;
        this.mobile = null;
        this.gender = null;
        this.address = null;
        this.avatar = null;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getFuId() {
        return fuId;
    }

    public void setFuId(String fuId) {
        this.fuId = fuId == null ? null : fuId.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(String registerTime) {
        this.registerTime = registerTime == null ? null : registerTime.trim();
    }

    public String getRegisterIp() {
        return registerIp;
    }

    public void setRegisterIp(String registerIp) {
        this.registerIp = registerIp == null ? null : registerIp.trim();
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public String getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(String loginTime) {
        this.loginTime = loginTime == null ? null : loginTime.trim();
    }

    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp == null ? null : loginIp.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "userId=" + userId +
                ", fuId='" + fuId + '\'' +
                ", status=" + status +
                ", registerTime='" + registerTime + '\'' +
                ", registerIp='" + registerIp + '\'' +
                ", role=" + role +
                ", loginTime='" + loginTime + '\'' +
                ", loginIp='" + loginIp + '\'' +
                ", mobile='" + mobile + '\'' +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", avatar='" + avatar + '\'' +
                '}';
    }
}