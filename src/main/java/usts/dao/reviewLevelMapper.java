package dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pojo.reviewLevel;
import pojo.reviewLevelExample;

public interface reviewLevelMapper {
    int countByExample(reviewLevelExample example);

    int deleteByExample(reviewLevelExample example);

    int deleteByPrimaryKey(Integer reviewlevelIndex);

    int insert(reviewLevel record);

    int insertSelective(reviewLevel record);

    List<reviewLevel> selectByExample(reviewLevelExample example);

    reviewLevel selectByPrimaryKey(Integer reviewlevelIndex);

    int updateByExampleSelective(@Param("record") reviewLevel record, @Param("example") reviewLevelExample example);

    int updateByExample(@Param("record") reviewLevel record, @Param("example") reviewLevelExample example);

    int updateByPrimaryKeySelective(reviewLevel record);

    int updateByPrimaryKey(reviewLevel record);
}