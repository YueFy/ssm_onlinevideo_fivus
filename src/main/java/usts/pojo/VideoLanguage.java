package usts.pojo;

public class VideoLanguage {
    private Integer videolanguageIndex;

    private String language;

    public VideoLanguage(Integer videolanguageIndex, String language) {
        this.videolanguageIndex = videolanguageIndex;
        this.language = language;
    }

    public VideoLanguage() {
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