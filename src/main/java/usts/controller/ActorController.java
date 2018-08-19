package usts.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import usts.pojo.Actor;
import usts.service.ActorService;
import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/actor")
public class ActorController {
    @Resource
    private ActorService actorservice ;
    //  查询全部演员
    @ResponseBody
    @RequestMapping("/showActor")
    public List<Actor> showActorOnThePage(){

        List<Actor> actorList = actorservice.actorList();

        return actorList ;
    }
//查找女演员
    @ResponseBody
    @RequestMapping("showGirlActor")
    public List<Actor> showGirlActor(){

        List<Actor> actorGirlList = actorservice.getActorListBySex("女");

        return actorGirlList;
    }
//查找男性演员
    @ResponseBody
    @RequestMapping("showBoyActor")
    public List<Actor> showBoyActor(){

        List<Actor> actorGirlList = actorservice.getActorListBySex("男");

        return actorGirlList;
    }

}
