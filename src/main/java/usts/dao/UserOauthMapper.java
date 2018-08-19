package usts.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import usts.pojo.UserOauth;
import usts.pojo.UserOauthExample;

public interface UserOauthMapper {
    int countByExample(UserOauthExample example);

    int deleteByExample(UserOauthExample example);

    int deleteByPrimaryKey(Integer oaId);

    int insert(UserOauth record);

    int insertSelective(UserOauth record);

    List<UserOauth> selectByExample(UserOauthExample example);

    UserOauth selectByPrimaryKey(Integer oaId);

    int updateByExampleSelective(@Param("record") UserOauth record, @Param("example") UserOauthExample example);

    int updateByExample(@Param("record") UserOauth record, @Param("example") UserOauthExample example);

    int updateByPrimaryKeySelective(UserOauth record);

    int updateByPrimaryKey(UserOauth record);
}