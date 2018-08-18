package dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pojo.Actor;
import pojo.ActorExample;

public interface ActorMapper {
    int countByExample(ActorExample example);

    int deleteByExample(ActorExample example);

    int deleteByPrimaryKey(Integer actorIndex);

    int insert(Actor record);

    int insertSelective(Actor record);

    List<Actor> selectByExample(ActorExample example);

    Actor selectByPrimaryKey(Integer actorIndex);

    int updateByExampleSelective(@Param("record") Actor record, @Param("example") ActorExample example);

    int updateByExample(@Param("record") Actor record, @Param("example") ActorExample example);

    int updateByPrimaryKeySelective(Actor record);

    int updateByPrimaryKey(Actor record);
}