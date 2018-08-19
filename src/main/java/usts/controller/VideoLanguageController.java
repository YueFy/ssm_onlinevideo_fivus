package usts.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import usts.pojo.*;
import usts.service.*;
import usts.utils.Split;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("videoLanguage")
public class VideoLanguageController {

    @Resource
    VideoLanguageService videoLanguageService;
    @Resource
    VideoService videoService;
    @Resource
    ActorService actorService;
    @Resource
    VideoTypeService videoTypeService;
    @Resource
    DirectorService directorService;



//    根据语言类型查找Video
//    videoType":"1|2|3|4","videoLanguage":"1""actor":"1|2|3|4","director":"1"
//    参数：语言类型
    @ResponseBody
    @RequestMapping("findVideoByLanguage")
    public List<Video> findVideoByLanguage(String language) {
        int languageIndex = videoLanguageService.findLanguageIndex("北印度语");
        List<Video> videoList = videoLanguageService.findVideoByLanguageIndex(languageIndex);
        List<Video> newVideo = new ArrayList<>();

//循环替换indexString为nameString
// videoType":"1|2|3|4","videoLanguage":"1""actor":"1|2|3|4","director":"1"
// 第一次查询数据库得到的List<video>
//  得到完整的List<video>
        for(Video video : videoList){
            String directorString = "";
            String actorString = "";
            String videoTypeString = "";
            String videoLanguageString = "";

            String directorIndexs = video.getDirector();
            String videoTypeIndexs = video.getVideoType();
            String actorIndexs = video.getActor();
            String videoLanguageIndexs = video.getVideoLanguage();
            //得到List<index>
            List<Integer> actorIndexList = Split.split(actorIndexs);
            System.out.println(actorIndexList);
            List<Integer> videoTypeIndexList = Split.split(videoTypeIndexs);
            System.out.println(videoTypeIndexList);
            List<Integer> directorIndexList = Split.split(directorIndexs);
            List<Integer> videoLanguageIndexList = Split.split((videoLanguageIndexs));
            //得到List<actor>

            List<Actor> actorList = actorService.findActorBySomeIndex(actorIndexList);
            //得到List<Videotype>
            List<VideoType> videoTypeList = videoTypeService.findVideoTypeBySomeType(videoTypeIndexList);
            //得到List<director>
            List<Director> directorList = directorService.findDirectorBySomeIndex(directorIndexList);
            //得到List<VideoLanguage>
            List<VideoLanguage> videoLanguageList = videoLanguageService.findVideoLanguageBySomeIndex(videoLanguageIndexList);

            //得到actorString
            for(Actor actor: actorList){
                actorString += actor.getName()+"  ";
            }
            //得到typeString
            for(VideoType videoType:videoTypeList){
                videoTypeString += videoType.getType()+"  ";
            }
            //得到derictorString
            for(Director director:directorList){
                directorString += director.getName()+"  ";
            }
            //得到videoLanguageString
            for(VideoLanguage videoLanguage:videoLanguageList){
                videoLanguageString += videoLanguage.getLanguage()+"  ";
            }
            //放入video
            video.setActor(actorString);
            video.setVideoType(videoTypeString);
            video.setDirector(directorString);
            video.setVideoLanguage(videoLanguageString);
            // 放入newList
            newVideo.add(video);
        }

        return newVideo;
    }
}
