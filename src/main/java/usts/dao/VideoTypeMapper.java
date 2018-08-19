package usts.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import usts.pojo.VideoType;
import usts.pojo.VideoTypeExample;

public interface VideoTypeMapper {
    int countByExample(VideoTypeExample example);

    int deleteByExample(VideoTypeExample example);

    int deleteByPrimaryKey(Integer videotypeNdex);

    int insert(VideoType record);

    int insertSelective(VideoType record);

    List<VideoType> selectByExample(VideoTypeExample example);

    VideoType selectByPrimaryKey(Integer videotypeNdex);

    int updateByExampleSelective(@Param("record") VideoType record, @Param("example") VideoTypeExample example);

    int updateByExample(@Param("record") VideoType record, @Param("example") VideoTypeExample example);

    int updateByPrimaryKeySelective(VideoType record);

    int updateByPrimaryKey(VideoType record);
}