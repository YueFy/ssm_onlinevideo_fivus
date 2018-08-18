package dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pojo.videoLanguage;
import pojo.videoLanguageExample;

public interface videoLanguageMapper {
    int countByExample(videoLanguageExample example);

    int deleteByExample(videoLanguageExample example);

    int deleteByPrimaryKey(Integer videolanguageIndex);

    int insert(videoLanguage record);

    int insertSelective(videoLanguage record);

    List<videoLanguage> selectByExample(videoLanguageExample example);

    videoLanguage selectByPrimaryKey(Integer videolanguageIndex);

    int updateByExampleSelective(@Param("record") videoLanguage record, @Param("example") videoLanguageExample example);

    int updateByExample(@Param("record") videoLanguage record, @Param("example") videoLanguageExample example);

    int updateByPrimaryKeySelective(videoLanguage record);

    int updateByPrimaryKey(videoLanguage record);
}