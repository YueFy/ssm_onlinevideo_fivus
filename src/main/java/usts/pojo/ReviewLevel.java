package usts.pojo;

public class ReviewLevel {
    private Integer reviewlevelIndex;

    private Integer userIndex;

    private Integer videoIndex;

    private Double reviewLevel;

    public ReviewLevel(Integer reviewlevelIndex, Integer userIndex, Integer videoIndex, Double reviewLevel) {
        this.reviewlevelIndex = reviewlevelIndex;
        this.userIndex = userIndex;
        this.videoIndex = videoIndex;
        this.reviewLevel = reviewLevel;
    }

    public ReviewLevel() {
        super();
    }

    public Integer getReviewlevelIndex() {
        return reviewlevelIndex;
    }

    public void setReviewlevelIndex(Integer reviewlevelIndex) {
        this.reviewlevelIndex = reviewlevelIndex;
    }

    public Integer getUserIndex() {
        return userIndex;
    }

    public void setUserIndex(Integer userIndex) {
        this.userIndex = userIndex;
    }

    public Integer getVideoIndex() {
        return videoIndex;
    }

    public void setVideoIndex(Integer videoIndex) {
        this.videoIndex = videoIndex;
    }

    public Double getReviewLevel() {
        return reviewLevel;
    }

    public void setReviewLevel(Double reviewLevel) {
        this.reviewLevel = reviewLevel;
    }
}