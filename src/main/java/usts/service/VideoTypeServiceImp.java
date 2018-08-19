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
    public List<VideoType> findVideoTypeBySomeType(List<Integer> index) {
        VideoTypeExample videoTypeExample = new VideoTypeExample();
        VideoTypeExample.Criteria criteria = videoTypeExample.createCriteria();

        criteria.andVideotypeNdexIn(index);
        List<VideoType> videoTypesListBySomeIndex = videoTypeMapper.selectByExample(videoTypeExample);
        return videoTypesListBySomeIndex;

    }
}
