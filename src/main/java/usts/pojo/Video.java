package usts.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Video {
    private Integer videoIndex;

    private String videoName;

    private String videoType;

    private String videoLanguage;

    private Double criticReview;

    private Double audienceReview;

    private String introduction;

    private Integer lastingTime;
    @JsonFormat(pattern ="yyyy-MM-dd",timezone="GMT+8")
    private Date showTime;

    private String actor;

    private String director;

    private String showtableIndex;

    private String reviewtableIndex;

    private String videoUrl;

    private String imagUrl;

    public Video(Integer videoIndex, String videoName, String videoType, String videoLanguage, Double criticReview, Double audienceReview, String introduction, Integer lastingTime, Date showTime, String actor, String director, String showtableIndex, String reviewtableIndex, String videoUrl, String imagUrl) {
        this.videoIndex = videoIndex;
        this.videoName = videoName;
        this.videoType = videoType;
        this.videoLanguage = videoLanguage;
        this.criticReview = criticReview;
        this.audienceReview = audienceReview;
        this.introduction = introduction;
        this.lastingTime = lastingTime;
        this.showTime = showTime;
        this.actor = actor;
        this.director = director;
        this.showtableIndex = showtableIndex;
        this.reviewtableIndex = reviewtableIndex;
        this.videoUrl = videoUrl;
        this.imagUrl = imagUrl;
    }

    public Video() {
        super();
    }

    public Integer getVideoIndex() {
        return videoIndex;
    }

    public void setVideoIndex(Integer videoIndex) {
        this.videoIndex = videoIndex;
    }

    public String getVideoName() {
        return videoName;
    }

    public void setVideoName(String videoName) {
        this.videoName = videoName == null ? null : videoName.trim();
    }

    public String getVideoType() {
        return videoType;
    }

    public void setVideoType(String videoType) {
        this.videoType = videoType == null ? null : videoType.trim();
    }

    public String getVideoLanguage() {
        return videoLanguage;
    }

    public void setVideoLanguage(String videoLanguage) {
        this.videoLanguage = videoLanguage == null ? null : videoLanguage.trim();
    }

    public Double getCriticReview() {
        return criticReview;
    }

    public void setCriticReview(Double criticReview) {
        this.criticReview = criticReview;
    }

    public Double getAudienceReview() {
        return audienceReview;
    }

    public void setAudienceReview(Double audienceReview) {
        this.audienceReview = audienceReview;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }

    public Integer getLastingTime() {
        return lastingTime;
    }

    public void setLastingTime(Integer lastingTime) {
        this.lastingTime = lastingTime;
    }

    public Date getShowTime() {
        return showTime;
    }

    public void setShowTime(Date showTime) {
        this.showTime = showTime;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor == null ? null : actor.trim();
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director == null ? null : director.trim();
    }

    public String getShowtableIndex() {
        return showtableIndex;
    }

    public void setShowtableIndex(String showtableIndex) {
        this.showtableIndex = showtableIndex == null ? null : showtableIndex.trim();
    }

    public String getReviewtableIndex() {
        return reviewtableIndex;
    }

    public void setReviewtableIndex(String reviewtableIndex) {
        this.reviewtableIndex = reviewtableIndex == null ? null : reviewtableIndex.trim();
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl == null ? null : videoUrl.trim();
    }

    public String getImagUrl() {
        return imagUrl;
    }

    public void setImagUrl(String imagUrl) {
        this.imagUrl = imagUrl == null ? null : imagUrl.trim();
    }
}