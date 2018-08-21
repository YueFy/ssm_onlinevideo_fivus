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
@RequestMapping("VideoType")
public class VideoTypeController {

    @Resource
    VideoTypeService videoTypeService;
    @Resource
    VideoService videoService;
    @Resource
    VideoLanguageService videoLanguageService;
    @Resource
    ActorService actorService;
    @Resource
    DirectorService directorService;



//按类型查找
    @ResponseBody
    @RequestMapping("findVideoByType")
    public List<Video> videoList(String SelectType){

        int videoTypeIndex = 0;
        List<Video> newVideo = new ArrayList<>();
       // 根据Type查找index
        List<VideoType> VideoNeedType = videoTypeService.findVideoByType("喜剧");
        for(VideoType type :VideoNeedType){
            videoTypeIndex = type.getVideotypeNdex();
        }
        System.out.println(videoTypeIndex);
        //根据Index查找Video
        List<Video> videoList = videoService.findVideoByType(videoTypeIndex);

//   循环替换
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
            List<VideoType> videoTypeList = videoTypeService.findVideoBySomeType(videoTypeIndexList);
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
