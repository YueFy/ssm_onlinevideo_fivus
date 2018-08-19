package usts.pojo;

public class User {
    private Integer userId;

    private String fuId;

    private String fuEmail;

    public User(Integer userId, String fuId, String fuEmail) {
        this.userId = userId;
        this.fuId = fuId;
        this.fuEmail = fuEmail;
    }

    public User() {
        super();
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

    public String getFuEmail() {
        return fuEmail;
    }

    public void setFuEmail(String fuEmail) {
        this.fuEmail = fuEmail == null ? null : fuEmail.trim();
    }
}