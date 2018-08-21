package usts.service;

import org.springframework.stereotype.Service;
import usts.dao.VideoMapper;
import usts.pojo.*;
import usts.utils.Split;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service("VideoService")
public class VideoServiceImp implements VideoService {

    @Resource
    VideoMapper videoMapper;

    public List<Video> findOtherVideos(){
        List<Video> otherVideoList = new ArrayList<>();
        VideoExample videoExample = new VideoExample();
        VideoExample.Criteria criteria =  videoExample.createCriteria();
        List<String> language = new ArrayList<>();
        language.add("2");
        language.add("3");
        language.add("5");
        language.add("6");
        criteria.andVideoTypeNotIn(language);
        List<Video> videoList = videoMapper.selectByExample(videoExample);
        return videoList;
    }
//根据TypeIndex查找Video
    public List<Video> findVideoByType(int typeIndex){

        VideoExample videoExample = new VideoExample();
        VideoExample.Criteria criteria =  videoExample.createCriteria();
        criteria.andVideoTypeLike("%"+typeIndex+"%");
        List<Video> videoList = videoMapper.selectByExample(videoExample);

        return videoList;
    }
//随机查找5个视频
    @Override
    public List<Video> findVideoImageByRandom() {
        List<Video> findImageByRandom = videoMapper.findImageByRandom();
        System.out.println("list:"+findImageByRandom);
        return findImageByRandom;
    }
//查找评分4.0以上的视频
    @Override
    public List<Video> findVideoByReview() {
        VideoExample videoExample = new VideoExample();
        VideoExample.Criteria criteria =  videoExample.createCriteria();
        criteria.andCriticReviewGreaterThan(4.0);
        List<Video> videoList = videoMapper.selectByExample(videoExample);

        return videoList;
    }
//查找所有电影
    @Override
    public List<Video> findAllVideo() {

        VideoExample videoExample = new VideoExample();
        List<Video> videoList = videoMapper.selectByExample(videoExample);
        return videoList;
    }

}
