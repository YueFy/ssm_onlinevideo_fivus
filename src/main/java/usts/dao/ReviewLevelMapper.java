package usts.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import usts.pojo.ReviewLevel;
import usts.pojo.ReviewLevelExample;

public interface ReviewLevelMapper {
    int countByExample(ReviewLevelExample example);

    int deleteByExample(ReviewLevelExample example);

    int deleteByPrimaryKey(Integer reviewlevelIndex);

    int insert(ReviewLevel record);

    int insertSelective(ReviewLevel record);

    List<ReviewLevel> selectByExample(ReviewLevelExample example);

    ReviewLevel selectByPrimaryKey(Integer reviewlevelIndex);

    int updateByExampleSelective(@Param("record") ReviewLevel record, @Param("example") ReviewLevelExample example);

    int updateByExample(@Param("record") ReviewLevel record, @Param("example") ReviewLevelExample example);

    int updateByPrimaryKeySelective(ReviewLevel record);

    int updateByPrimaryKey(ReviewLevel record);
}