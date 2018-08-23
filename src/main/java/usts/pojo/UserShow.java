package usts.pojo;

import java.io.Serializable;

public class UserShow implements Serializable {
    private String userid;
    private int userId;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public UserShow(String userid, int userId) {
        this.userid = userid;
        this.userId = userId;
    }

    public UserShow() {
    }

}
