package usts.dao;

import org.apache.ibatis.annotations.Param;
import usts.pojo.City;
import usts.pojo.CityExample;

import java.util.List;

public interface CityMapper {
    int countByExample(CityExample example);

    int deleteByExample(CityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(City record);

    int insertSelective(City record);

    List<City> selectByExample(CityExample example);

    City selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") City record, @Param("example") CityExample example);

    int updateByExample(@Param("record") City record, @Param("example") CityExample example);

    int updateByPrimaryKeySelective(City record);

    int updateByPrimaryKey(City record);
}