package usts.service;
import org.springframework.stereotype.Service;
import usts.pojo.Actor;
import usts.dao.ActorMapper;
import usts.pojo.ActorExample;
import usts.pojo.Video;
import usts.utils.Split;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Resource;

@Service("actorService")
public class ActorServiceImp implements ActorService {

    @Resource
    private ActorMapper actorMapper;

    @Override
    public List<Actor> actorList() {
        List<Actor> actorList = new ArrayList<>();

        ActorExample actorExample = new ActorExample();

        actorList = actorMapper.selectByExample(actorExample);
        return actorList;
    }

    @Override
//    按性别查询演员
    public List<Actor> getActorListBySex(String sex) {
        ActorExample actorExample = new ActorExample();
        ActorExample.Criteria criteria = actorExample.createCriteria();

        criteria.andSexEqualTo(sex);
        List<Actor> actorListBySex = actorMapper.selectByExample(actorExample);
        return actorListBySex;
    }


    // 根据多个Index查询actor
    public List<Actor> findActorBySomeIndex(List<Integer> index){

        ActorExample actorExample = new ActorExample();
        ActorExample.Criteria criteria = actorExample.createCriteria();
        System.out.println(index);
        criteria.andActorIndexIn(index);
        List<Actor> actorListBySomeIndex = actorMapper.selectByExample(actorExample);
        System.out.println(actorListBySomeIndex);
        return actorListBySomeIndex;
    }
}
