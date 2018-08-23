package usts.pojo;

import java.io.Serializable;

public class BdUserInfo implements Serializable {
    private String constellation;
    private String trade;
    private String blood;
    private String figure;
    private String job;
    private String sex;
    private String userid;
    private String education;
    private String username;//昵称
    private String marriage;
    private String portrait;//密码
    private String birthday;
    private String is_bind_mobile;//是否绑定手机
    private String is_realname;//是否实名

    public String getConstellation() {
        return constellation;
    }

    public void setConstellation(String constellation) {
        this.constellation = constellation;
    }

    public String getTrade() {
        return trade;
    }

    public void setTrade(String trade) {
        this.trade = trade;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    public String getFigure() {
        return figure;
    }

    public void setFigure(String figure) {
        this.figure = figure;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMarriage() {
        return marriage;
    }

    public void setMarriage(String marriage) {
        this.marriage = marriage;
    }

    public String getPortrait() {
        return portrait;
    }

    public void setPortrait(String portrait) {
        this.portrait = portrait;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getIs_bind_mobile() {
        return is_bind_mobile;
    }

    public void setIs_bind_mobile(String is_bind_mobile) {
        this.is_bind_mobile = is_bind_mobile;
    }

    public String getIs_realname() {
        return is_realname;
    }

    public void setIs_realname(String is_realname) {
        this.is_realname = is_realname;
    }

    @Override
    public String toString() {
        return "BdUserInfo{" +
                "constellation='" + constellation + '\'' +
                ", trade='" + trade + '\'' +
                ", blood='" + blood + '\'' +
                ", figure='" + figure + '\'' +
                ", job='" + job + '\'' +
                ", sex='" + sex + '\'' +
                ", userid='" + userid + '\'' +
                ", education='" + education + '\'' +
                ", username='" + username + '\'' +
                ", marriage='" + marriage + '\'' +
                ", portrait='" + portrait + '\'' +
                ", birthday='" + birthday + '\'' +
                ", is_bind_mobile='" + is_bind_mobile + '\'' +
                ", is_realname='" + is_realname + '\'' +
                '}';
    }
}
