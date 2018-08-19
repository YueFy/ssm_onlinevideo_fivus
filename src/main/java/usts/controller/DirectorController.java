package usts.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import usts.pojo.Director;
import usts.pojo.DirectorExample;
import usts.service.DirectorService;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("director")
public class DirectorController {

    @Resource
    DirectorService directorService;

//    查询所有导演
    @ResponseBody
    @RequestMapping("allDirector")
    public List<Director> directorList(){

        List<Director> directorList = directorService.findAllDirector();

        return directorList;
    }
}
