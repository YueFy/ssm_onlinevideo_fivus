package usts.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import usts.pojo.Replay;
import usts.service.ReplayService;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("replay")
public class ReplayController {
    @Resource
    ReplayService replayService;

    //查询所有评论
    @ResponseBody
    @RequestMapping("allReplay")
    public List<Replay> replayList() {
        List<Replay> replayList = replayService.findAllReplayByReplayIndex();

        return replayList;
    }
}
