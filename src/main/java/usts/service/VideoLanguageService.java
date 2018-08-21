package usts.service;

import usts.pojo.Actor;
import usts.pojo.Video;
import usts.pojo.VideoLanguage;

import java.util.List;

public interface VideoLanguageService {
    public int findLanguageIndex(String language);
    public List<Video> findVideoByLanguageIndex(int videoLanguageIndex);
    public List<VideoLanguage> findVideoLanguageBySomeIndex(List<Integer> index);


}
