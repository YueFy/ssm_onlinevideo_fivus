package pojo;

public class Director {
    private Integer directorIndex;

    private String name;

    private String introduction;

    public Director(Integer directorIndex, String name, String introduction) {
        this.directorIndex = directorIndex;
        this.name = name;
        this.introduction = introduction;
    }

    public Director() {
        super();
    }

    public Integer getDirectorIndex() {
        return directorIndex;
    }

    public void setDirectorIndex(Integer directorIndex) {
        this.directorIndex = directorIndex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }
}