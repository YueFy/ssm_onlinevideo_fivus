package usts.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import usts.pojo.Video;
import usts.pojo.VideoLanguage;
import usts.service.VideoLanguageService;
import usts.service.VideoService;
import usts.utils.Split;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Controller
@RequestMapping("videoController")
public class VideoController {

    @Resource
    VideoService videoService;
    @Resource
    VideoLanguageService videoLanguageService;

    @ResponseBody
    @RequestMapping("initHome")
    public HashMap iniHome(){
        HashMap homeMap = new  HashMap();
        //首页图片初始化
        List<Video> findImageByRandom = videoService.findVideoImageByRandom();

        for(int i = 0;i < findImageByRandom.size(); i++) {
            homeMap.put("videoImageUrl"+(i+1),findImageByRandom.get(i).getImagUrl());
        }
        // 首页口碑榜初始化
        List<Video> findVideoByReview = videoService.findVideoByReview();
        for(int i = 0;i < findVideoByReview.size(); i++) {
            homeMap.put("videoReview"+(i+1),findVideoByReview.get(i).getVideoName());
        }
        return homeMap;
    }

    //首页移动视频初始化
    @ResponseBody
    @RequestMapping("initMobileVideo")
    public HashMap initMobileVideo(){


        HashMap mobileVideoMap = new  HashMap();
        //查找所有的视频
        List<Video> findAllVideo = videoService.findAllVideo();
        List<Video> thisAllVideo = new ArrayList<>();
        //替换languageIndex为languageType
        for(Video video : findAllVideo){
            String videoLanguage = " ";
            List<Integer> languageIndexs = Split.split(video.getVideoLanguage());
            //根据Indexs查找language
            List<VideoLanguage> languages = videoLanguageService.findVideoLanguageBySomeIndex(languageIndexs);
            for (VideoLanguage language :languages){
                videoLanguage += language.getLanguage()+"  ";
            }
            video.setVideoLanguage(videoLanguage);
            thisAllVideo.add(video);
        }
        for(int i = 0;i < thisAllVideo.size(); i++) {

            mobileVideoMap.put("mobileVideo"+(i+1),thisAllVideo.get(i));
        }
        return mobileVideoMap;
    }

}
