package usts.service;

import org.springframework.stereotype.Service;
import usts.dao.ReviewMapper;
import usts.pojo.Review;
import usts.pojo.ReviewExample;


import javax.annotation.Resource;
import java.util.List;

@Service("ReviewService")
public class ReviewServiceImp implements ReviewService {
    @Resource
    ReviewMapper reviewMapper;


    @Override

    public List<Review> findAllReviewByReviewIndex(){
        ReviewExample reviewExample = new ReviewExample();
        List<Review> reviewList = reviewMapper.selectByExample(reviewExample);
        return reviewList;
    }



}


