package dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pojo.Replay;
import pojo.ReplayExample;

public interface ReplayMapper {
    int countByExample(ReplayExample example);

    int deleteByExample(ReplayExample example);

    int deleteByPrimaryKey(Integer replayIndex);

    int insert(Replay record);

    int insertSelective(Replay record);

    List<Replay> selectByExample(ReplayExample example);

    Replay selectByPrimaryKey(Integer replayIndex);

    int updateByExampleSelective(@Param("record") Replay record, @Param("example") ReplayExample example);

    int updateByExample(@Param("record") Replay record, @Param("example") ReplayExample example);

    int updateByPrimaryKeySelective(Replay record);

    int updateByPrimaryKey(Replay record);
}