package usts.service;

import org.springframework.stereotype.Service;
import usts.dao.DirectorMapper;
import usts.pojo.Director;
import usts.pojo.DirectorExample;

import javax.annotation.Resource;
import java.util.List;

@Service("DirectorService")
public class DirectorServiceImp implements  DirectorService {

    @Resource
    DirectorMapper directorMapper;

    @Override
    public List<Director> findAllDirector() {
        DirectorExample directorExample = new DirectorExample();
        List<Director> directorList = directorMapper.selectByExample(directorExample);

        return directorList;
    }


    // 根据多个Index查询actor
    @Override
    public List<Director> findDirectorBySomeIndex(List<Integer> index) {
        DirectorExample directorExample = new DirectorExample();
        DirectorExample.Criteria criteria = directorExample.createCriteria();

        criteria.andDirectorIndexIn(index);
        List<Director> directorListBySomeIndex = directorMapper.selectByExample(directorExample);
        return directorListBySomeIndex;
    }
}
