package pojo;

public class videoLanguage {
    private Integer videolanguageIndex;

    private String language;

    public videoLanguage(Integer videolanguageIndex, String language) {
        this.videolanguageIndex = videolanguageIndex;
        this.language = language;
    }

    public videoLanguage() {
        super();
    }

    public Integer getVideolanguageIndex() {
        return videolanguageIndex;
    }

    public void setVideolanguageIndex(Integer videolanguageIndex) {
        this.videolanguageIndex = videolanguageIndex;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language == null ? null : language.trim();
    }
}