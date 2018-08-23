package usts.service;

import usts.pojo.Review;

import java.util.List;

public interface ReviewService {
    public List<Review> findAllReviewByReviewIndex();
}
