package usts.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import usts.pojo.VideoLanguage;
import usts.pojo.VideoLanguageExample;

public interface VideoLanguageMapper {
    int countByExample(VideoLanguageExample example);

    int deleteByExample(VideoLanguageExample example);

    int deleteByPrimaryKey(Integer videolanguageIndex);

    int insert(VideoLanguage record);

    int insertSelective(VideoLanguage record);

    List<VideoLanguage> selectByExample(VideoLanguageExample example);

    VideoLanguage selectByPrimaryKey(Integer videolanguageIndex);

    int updateByExampleSelective(@Param("record") VideoLanguage record, @Param("example") VideoLanguageExample example);

    int updateByExample(@Param("record") VideoLanguage record, @Param("example") VideoLanguageExample example);

    int updateByPrimaryKeySelective(VideoLanguage record);

    int updateByPrimaryKey(VideoLanguage record);
}