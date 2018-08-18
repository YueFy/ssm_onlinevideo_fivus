package dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pojo.userOauth;
import pojo.userOauthExample;

public interface userOauthMapper {
    int countByExample(userOauthExample example);

    int deleteByExample(userOauthExample example);

    int deleteByPrimaryKey(Integer oaId);

    int insert(userOauth record);

    int insertSelective(userOauth record);

    List<userOauth> selectByExample(userOauthExample example);

    userOauth selectByPrimaryKey(Integer oaId);

    int updateByExampleSelective(@Param("record") userOauth record, @Param("example") userOauthExample example);

    int updateByExample(@Param("record") userOauth record, @Param("example") userOauthExample example);

    int updateByPrimaryKeySelective(userOauth record);

    int updateByPrimaryKey(userOauth record);
}