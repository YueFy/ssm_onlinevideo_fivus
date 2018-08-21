package usts.service;

import org.springframework.stereotype.Service;
import usts.dao.VideoTypeMapper;
import usts.pojo.VideoType;
import usts.pojo.VideoTypeExample;
import javax.annotation.Resource;
import java.util.List;

@Service("VideoTypeService")
public class VideoTypeServiceImp implements VideoTypeService {

    @Resource
    VideoTypeMapper videoTypeMapper;

    @Override
    public List<VideoType> findVideoBySomeType(List<Integer> index) {
        VideoTypeExample videoTypeExample = new VideoTypeExample();
        VideoTypeExample.Criteria criteria = videoTypeExample.createCriteria();

        criteria.andVideotypeNdexIn(index);
        List<VideoType> videoTypesListBySomeIndex = videoTypeMapper.selectByExample(videoTypeExample);
        return videoTypesListBySomeIndex;

    }
//根据视频类型查找类型Index
    @Override
    public List<VideoType> findVideoByType(String videoType) {
        VideoTypeExample videoTypeExample = new VideoTypeExample();
        VideoTypeExample.Criteria criteria = videoTypeExample.createCriteria();
        criteria.andTypeEqualTo(videoType);
        List<VideoType> videoTypesListByType = videoTypeMapper.selectByExample(videoTypeExample);
        return videoTypesListByType;
    }
}
