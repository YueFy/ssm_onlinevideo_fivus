package usts.service;

import org.springframework.stereotype.Service;
import usts.dao.CityMapper;
import usts.pojo.City;
import usts.pojo.CityExample;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CityServiceImpl implements CityService {
    @Resource
    private CityMapper cityMapper;

    @Override
    public List<City> getAllCity() {
        CityExample cityExample=new CityExample();
        List<City> cities=cityMapper.selectByExample(cityExample);
        return cities;
    }
}
