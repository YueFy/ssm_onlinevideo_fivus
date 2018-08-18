package pojo;

public class userInfo {
    private Integer userId;

    private Integer status;

    private String registerTime;

    private String registerIp;

    private Integer role;

    private String loginTime;

    private String loginIp;

    private String mobile;

    private String gender;

    private String address;

    public userInfo(Integer userId, Integer status, String registerTime, String registerIp, Integer role, String loginTime, String loginIp, String mobile, String gender, String address) {
        this.userId = userId;
        this.status = status;
        this.registerTime = registerTime;
        this.registerIp = registerIp;
        this.role = role;
        this.loginTime = loginTime;
        this.loginIp = loginIp;
        this.mobile = mobile;
        this.gender = gender;
        this.address = address;
    }

    public userInfo() {
        super();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
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
}