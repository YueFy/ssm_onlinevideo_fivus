package usts.service;

import org.springframework.stereotype.Service;
import usts.pojo.City;

import java.util.List;

@Service
public interface CityService {
 public List<City> getAllCity();
}