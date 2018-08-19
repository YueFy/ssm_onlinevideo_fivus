package usts.service;

import org.springframework.stereotype.Service;
import usts.dao.VideoLanguageMapper;
import usts.dao.VideoMapper;
import usts.pojo.*;

import javax.annotation.Resource;
import java.util.List;


@Service("videoLanguageService")
public class VideoLanguageServiceImp implements VideoLanguageService{

    @Resource
    VideoLanguageMapper videoLanguageMapper;
    @Resource
    VideoMapper videoMapper;

    //根据Stringz字符查找对应的languageIndex
    @Override
    public int findLanguageIndex(String language) {

        int videolanguageIndex = 0;

        VideoLanguageExample videoLanguageExample = new VideoLanguageExample();

        VideoLanguageExample.Criteria criteria = videoLanguageExample.createCriteria();

        criteria.andLanguageEqualTo(language);
        List<VideoLanguage> languageIndex = videoLanguageMapper.selectByExample(videoLanguageExample);

        for (VideoLanguage videoLanguage : languageIndex){
            videolanguageIndex =videoLanguage.getVideolanguageIndex();
        }

        return videolanguageIndex;
    }


//    根据languageIndex查找电影使用“like”模糊查询
    @Override
    public List<Video> findVideoByLanguageIndex(int videoLanguageIndex) {

        VideoExample videoExample = new VideoExample();

        VideoExample.Criteria criteria = videoExample.createCriteria();

        criteria.andVideoLanguageLike(videoLanguageIndex+"");
        List<Video> videoList = videoMapper.selectByExample(videoExample);

        return videoList;
    }

    @Override
    public List<VideoLanguage> findVideoLanguageBySomeIndex(List<Integer> index) {
        VideoLanguageExample videoLanguageExample = new  VideoLanguageExample ();
        VideoLanguageExample .Criteria criteria = videoLanguageExample.createCriteria();
        System.out.println(index);
        criteria.andVideolanguageIndexIn(index);
        List<VideoLanguage> videoLanguageListBySomeIndex = videoLanguageMapper.selectByExample(videoLanguageExample);

        return videoLanguageListBySomeIndex;
    }
}
