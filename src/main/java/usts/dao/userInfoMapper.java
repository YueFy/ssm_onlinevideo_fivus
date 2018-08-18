package dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pojo.userInfo;
import pojo.userInfoExample;

public interface userInfoMapper {
    int countByExample(userInfoExample example);

    int deleteByExample(userInfoExample example);

    int deleteByPrimaryKey(Integer userId);

    int insert(userInfo record);

    int insertSelective(userInfo record);

    List<userInfo> selectByExample(userInfoExample example);

    userInfo selectByPrimaryKey(Integer userId);

    int updateByExampleSelective(@Param("record") userInfo record, @Param("example") userInfoExample example);

    int updateByExample(@Param("record") userInfo record, @Param("example") userInfoExample example);

    int updateByPrimaryKeySelective(userInfo record);

    int updateByPrimaryKey(userInfo record);
}