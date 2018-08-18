package dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pojo.videoType;
import pojo.videoTypeExample;

public interface videoTypeMapper {
    int countByExample(videoTypeExample example);

    int deleteByExample(videoTypeExample example);

    int deleteByPrimaryKey(Integer videotypeNdex);

    int insert(videoType record);

    int insertSelective(videoType record);

    List<videoType> selectByExample(videoTypeExample example);

    videoType selectByPrimaryKey(Integer videotypeNdex);

    int updateByExampleSelective(@Param("record") videoType record, @Param("example") videoTypeExample example);

    int updateByExample(@Param("record") videoType record, @Param("example") videoTypeExample example);

    int updateByPrimaryKeySelective(videoType record);

    int updateByPrimaryKey(videoType record);
}