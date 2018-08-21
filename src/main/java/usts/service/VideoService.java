package usts.service;

import usts.pojo.Video;

import java.util.List;

public interface VideoService {
    public List<Video> findOtherVideos();
    public List<Video> findVideoByType(int typeIndex);
    public List<Video> findVideoImageByRandom();
    public List<Video> findVideoByReview();
    public List<Video> findAllVideo();

}
