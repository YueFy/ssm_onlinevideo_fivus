package usts.service;


import org.springframework.stereotype.Service;
import usts.dao.ReplayMapper;
import usts.pojo.Replay;
import usts.pojo.ReplayExample;


import javax.annotation.Resource;
import java.util.List;

@Service("ReplayService")
public class ReplayServiceImp implements ReplayService {
    @Resource
    ReplayMapper replayMapper;


    @Override

    public List<Replay> findAllReplayByReplayIndex() {
        ReplayExample replayExample = new ReplayExample();
        List<Replay> replayList = replayMapper.selectByExample(replayExample);
        return replayList;
    }






}
