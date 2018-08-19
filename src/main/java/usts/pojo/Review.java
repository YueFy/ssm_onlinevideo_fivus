package usts.pojo;

public class Review {
    private Integer reviewIndex;

    private String content;

    private Integer videoIndex;

    private String replay;

    public Review(Integer reviewIndex, String content, Integer videoIndex, String replay) {
        this.reviewIndex = reviewIndex;
        this.content = content;
        this.videoIndex = videoIndex;
        this.replay = replay;
    }

    public Review() {
        super();
    }

    public Integer getReviewIndex() {
        return reviewIndex;
    }

    public void setReviewIndex(Integer reviewIndex) {
        this.reviewIndex = reviewIndex;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getVideoIndex() {
        return videoIndex;
    }

    public void setVideoIndex(Integer videoIndex) {
        this.videoIndex = videoIndex;
    }

    public String getReplay() {
        return replay;
    }

    public void setReplay(String replay) {
        this.replay = replay == null ? null : replay.trim();
    }
}