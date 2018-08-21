package usts.service;


import usts.pojo.VideoType;
import java.util.List;

public interface VideoTypeService {
    public List<VideoType> findVideoBySomeType(List<Integer> index);
    public List<VideoType> findVideoByType(String videoType);

}
