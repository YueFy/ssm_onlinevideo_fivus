package pojo;

public class Actor {
    private Integer actorIndex;

    private String name;

    private String sex;

    private String introduction;

    public Actor(Integer actorIndex, String name, String sex, String introduction) {
        this.actorIndex = actorIndex;
        this.name = name;
        this.sex = sex;
        this.introduction = introduction;
    }

    public Actor() {
        super();
    }

    public Integer getActorIndex() {
        return actorIndex;
    }

    public void setActorIndex(Integer actorIndex) {
        this.actorIndex = actorIndex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }
}