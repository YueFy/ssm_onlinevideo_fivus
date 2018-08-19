package usts.pojo;

public class VideoType {
    private Integer videotypeNdex;

    private String type;

    public VideoType(Integer videotypeNdex, String type) {
        this.videotypeNdex = videotypeNdex;
        this.type = type;
    }

    public VideoType() {
        super();
    }

    public Integer getVideotypeNdex() {
        return videotypeNdex;
    }

    public void setVideotypeNdex(Integer videotypeNdex) {
        this.videotypeNdex = videotypeNdex;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }
}