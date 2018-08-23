package usts.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import usts.pojo.Review;
import usts.pojo.ReviewExample;
import usts.service.ReviewService;
import usts.utils.Split;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Controller
@RequestMapping("reviewController")
public class ReviewController {
    @Resource
    ReviewService reviewService;


    //查询所有评论
       @ResponseBody
    @RequestMapping("initReview")
    public HashMap initReview(){

        HashMap reviewMap = new  HashMap();
        //查找所有评论
        List<Review> findAllReviewByReviewIndex = reviewService.findAllReviewByReviewIndex();


        for(int i = 0;i < findAllReviewByReviewIndex.size(); i++) {

            reviewMap.put("review"+(i+1),findAllReviewByReviewIndex.get(i));
        }
        return reviewMap;
    }



}
