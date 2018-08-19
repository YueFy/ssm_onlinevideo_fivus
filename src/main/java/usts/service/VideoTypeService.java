package usts.service;


import usts.pojo.VideoType;
import java.util.List;

public interface VideoTypeService {
    public List<VideoType> findVideoTypeBySomeType(List<Integer> index);
}
