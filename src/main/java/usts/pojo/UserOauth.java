package usts.pojo;

public class UserOauth {
    private Integer oaId;

    private Integer userId;

    private String identityType;

    private String identifier;

    private String credential;

    private String cerfiled;

    private String avatar;

    public UserOauth(Integer oaId, Integer userId, String identityType, String identifier, String credential, String cerfiled, String avatar) {
        this.oaId = oaId;
        this.userId = userId;
        this.identityType = identityType;
        this.identifier = identifier;
        this.credential = credential;
        this.cerfiled = cerfiled;
        this.avatar = avatar;
    }

    public UserOauth() {
        super();
    }

    public Integer getOaId() {
        return oaId;
    }

    public void setOaId(Integer oaId) {
        this.oaId = oaId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getIdentityType() {
        return identityType;
    }

    public void setIdentityType(String identityType) {
        this.identityType = identityType == null ? null : identityType.trim();
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier == null ? null : identifier.trim();
    }

    public String getCredential() {
        return credential;
    }

    public void setCredential(String credential) {
        this.credential = credential == null ? null : credential.trim();
    }

    public String getCerfiled() {
        return cerfiled;
    }

    public void setCerfiled(String cerfiled) {
        this.cerfiled = cerfiled == null ? null : cerfiled.trim();
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }
}