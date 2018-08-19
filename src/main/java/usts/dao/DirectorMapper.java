package usts.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import usts.pojo.Director;
import usts.pojo.DirectorExample;

public interface DirectorMapper {
    int countByExample(DirectorExample example);

    int deleteByExample(DirectorExample example);

    int deleteByPrimaryKey(Integer directorIndex);

    int insert(Director record);

    int insertSelective(Director record);

    List<Director> selectByExample(DirectorExample example);

    Director selectByPrimaryKey(Integer directorIndex);

    int updateByExampleSelective(@Param("record") Director record, @Param("example") DirectorExample example);

    int updateByExample(@Param("record") Director record, @Param("example") DirectorExample example);

    int updateByPrimaryKeySelective(Director record);

    int updateByPrimaryKey(Director record);
}