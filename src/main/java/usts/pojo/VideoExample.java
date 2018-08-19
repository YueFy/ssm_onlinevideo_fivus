package usts.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VideoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VideoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andVideoIndexIsNull() {
            addCriterion("video_index is null");
            return (Criteria) this;
        }

        public Criteria andVideoIndexIsNotNull() {
            addCriterion("video_index is not null");
            return (Criteria) this;
        }

        public Criteria andVideoIndexEqualTo(Integer value) {
            addCriterion("video_index =", value, "videoIndex");
            return (Criteria) this;
        }

        public Criteria andVideoIndexNotEqualTo(Integer value) {
            addCriterion("video_index <>", value, "videoIndex");
            return (Criteria) this;
        }

        public Criteria andVideoIndexGreaterThan(Integer value) {
            addCriterion("video_index >", value, "videoIndex");
            return (Criteria) this;
        }

        public Criteria andVideoIndexGreaterThanOrEqualTo(Integer value) {
            addCriterion("video_index >=", value, "videoIndex");
            return (Criteria) this;
        }

        public Criteria andVideoIndexLessThan(Integer value) {
            addCriterion("video_index <", value, "videoIndex");
            return (Criteria) this;
        }

        public Criteria andVideoIndexLessThanOrEqualTo(Integer value) {
            addCriterion("video_index <=", value, "videoIndex");
            return (Criteria) this;
        }

        public Criteria andVideoIndexIn(List<Integer> values) {
            addCriterion("video_index in", values, "videoIndex");
            return (Criteria) this;
        }

        public Criteria andVideoIndexNotIn(List<Integer> values) {
            addCriterion("video_index not in", values, "videoIndex");
            return (Criteria) this;
        }

        public Criteria andVideoIndexBetween(Integer value1, Integer value2) {
            addCriterion("video_index between", value1, value2, "videoIndex");
            return (Criteria) this;
        }

        public Criteria andVideoIndexNotBetween(Integer value1, Integer value2) {
            addCriterion("video_index not between", value1, value2, "videoIndex");
            return (Criteria) this;
        }

        public Criteria andVideoNameIsNull() {
            addCriterion("video_name is null");
            return (Criteria) this;
        }

        public Criteria andVideoNameIsNotNull() {
            addCriterion("video_name is not null");
            return (Criteria) this;
        }

        public Criteria andVideoNameEqualTo(String value) {
            addCriterion("video_name =", value, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameNotEqualTo(String value) {
            addCriterion("video_name <>", value, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameGreaterThan(String value) {
            addCriterion("video_name >", value, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameGreaterThanOrEqualTo(String value) {
            addCriterion("video_name >=", value, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameLessThan(String value) {
            addCriterion("video_name <", value, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameLessThanOrEqualTo(String value) {
            addCriterion("video_name <=", value, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameLike(String value) {
            addCriterion("video_name like", value, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameNotLike(String value) {
            addCriterion("video_name not like", value, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameIn(List<String> values) {
            addCriterion("video_name in", values, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameNotIn(List<String> values) {
            addCriterion("video_name not in", values, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameBetween(String value1, String value2) {
            addCriterion("video_name between", value1, value2, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameNotBetween(String value1, String value2) {
            addCriterion("video_name not between", value1, value2, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoTypeIsNull() {
            addCriterion("video_type is null");
            return (Criteria) this;
        }

        public Criteria andVideoTypeIsNotNull() {
            addCriterion("video_type is not null");
            return (Criteria) this;
        }

        public Criteria andVideoTypeEqualTo(String value) {
            addCriterion("video_type =", value, "videoType");
            return (Criteria) this;
        }

        public Criteria andVideoTypeNotEqualTo(String value) {
            addCriterion("video_type <>", value, "videoType");
            return (Criteria) this;
        }

        public Criteria andVideoTypeGreaterThan(String value) {
            addCriterion("video_type >", value, "videoType");
            return (Criteria) this;
        }

        public Criteria andVideoTypeGreaterThanOrEqualTo(String value) {
            addCriterion("video_type >=", value, "videoType");
            return (Criteria) this;
        }

        public Criteria andVideoTypeLessThan(String value) {
            addCriterion("video_type <", value, "videoType");
            return (Criteria) this;
        }

        public Criteria andVideoTypeLessThanOrEqualTo(String value) {
            addCriterion("video_type <=", value, "videoType");
            return (Criteria) this;
        }

        public Criteria andVideoTypeLike(String value) {
            addCriterion("video_type like", value, "videoType");
            return (Criteria) this;
        }

        public Criteria andVideoTypeNotLike(String value) {
            addCriterion("video_type not like", value, "videoType");
            return (Criteria) this;
        }

        public Criteria andVideoTypeIn(List<String> values) {
            addCriterion("video_type in", values, "videoType");
            return (Criteria) this;
        }

        public Criteria andVideoTypeNotIn(List<String> values) {
            addCriterion("video_type not in", values, "videoType");
            return (Criteria) this;
        }

        public Criteria andVideoTypeBetween(String value1, String value2) {
            addCriterion("video_type between", value1, value2, "videoType");
            return (Criteria) this;
        }

        public Criteria andVideoTypeNotBetween(String value1, String value2) {
            addCriterion("video_type not between", value1, value2, "videoType");
            return (Criteria) this;
        }

        public Criteria andVideoLanguageIsNull() {
            addCriterion("video_language is null");
            return (Criteria) this;
        }

        public Criteria andVideoLanguageIsNotNull() {
            addCriterion("video_language is not null");
            return (Criteria) this;
        }

        public Criteria andVideoLanguageEqualTo(String value) {
            addCriterion("video_language =", value, "videoLanguage");
            return (Criteria) this;
        }

        public Criteria andVideoLanguageNotEqualTo(String value) {
            addCriterion("video_language <>", value, "videoLanguage");
            return (Criteria) this;
        }

        public Criteria andVideoLanguageGreaterThan(String value) {
            addCriterion("video_language >", value, "videoLanguage");
            return (Criteria) this;
        }

        public Criteria andVideoLanguageGreaterThanOrEqualTo(String value) {
            addCriterion("video_language >=", value, "videoLanguage");
            return (Criteria) this;
        }

        public Criteria andVideoLanguageLessThan(String value) {
            addCriterion("video_language <", value, "videoLanguage");
            return (Criteria) this;
        }

        public Criteria andVideoLanguageLessThanOrEqualTo(String value) {
            addCriterion("video_language <=", value, "videoLanguage");
            return (Criteria) this;
        }

        public Criteria andVideoLanguageLike(String value) {
            addCriterion("video_language like", value, "videoLanguage");
            return (Criteria) this;
        }

        public Criteria andVideoLanguageNotLike(String value) {
            addCriterion("video_language not like", value, "videoLanguage");
            return (Criteria) this;
        }

        public Criteria andVideoLanguageIn(List<String> values) {
            addCriterion("video_language in", values, "videoLanguage");
            return (Criteria) this;
        }

        public Criteria andVideoLanguageNotIn(List<String> values) {
            addCriterion("video_language not in", values, "videoLanguage");
            return (Criteria) this;
        }

        public Criteria andVideoLanguageBetween(String value1, String value2) {
            addCriterion("video_language between", value1, value2, "videoLanguage");
            return (Criteria) this;
        }

        public Criteria andVideoLanguageNotBetween(String value1, String value2) {
            addCriterion("video_language not between", value1, value2, "videoLanguage");
            return (Criteria) this;
        }

        public Criteria andCriticReviewIsNull() {
            addCriterion("critic_review is null");
            return (Criteria) this;
        }

        public Criteria andCriticReviewIsNotNull() {
            addCriterion("critic_review is not null");
            return (Criteria) this;
        }

        public Criteria andCriticReviewEqualTo(Double value) {
            addCriterion("critic_review =", value, "criticReview");
            return (Criteria) this;
        }

        public Criteria andCriticReviewNotEqualTo(Double value) {
            addCriterion("critic_review <>", value, "criticReview");
            return (Criteria) this;
        }

        public Criteria andCriticReviewGreaterThan(Double value) {
            addCriterion("critic_review >", value, "criticReview");
            return (Criteria) this;
        }

        public Criteria andCriticReviewGreaterThanOrEqualTo(Double value) {
            addCriterion("critic_review >=", value, "criticReview");
            return (Criteria) this;
        }

        public Criteria andCriticReviewLessThan(Double value) {
            addCriterion("critic_review <", value, "criticReview");
            return (Criteria) this;
        }

        public Criteria andCriticReviewLessThanOrEqualTo(Double value) {
            addCriterion("critic_review <=", value, "criticReview");
            return (Criteria) this;
        }

        public Criteria andCriticReviewIn(List<Double> values) {
            addCriterion("critic_review in", values, "criticReview");
            return (Criteria) this;
        }

        public Criteria andCriticReviewNotIn(List<Double> values) {
            addCriterion("critic_review not in", values, "criticReview");
            return (Criteria) this;
        }

        public Criteria andCriticReviewBetween(Double value1, Double value2) {
            addCriterion("critic_review between", value1, value2, "criticReview");
            return (Criteria) this;
        }

        public Criteria andCriticReviewNotBetween(Double value1, Double value2) {
            addCriterion("critic_review not between", value1, value2, "criticReview");
            return (Criteria) this;
        }

        public Criteria andAudienceReviewIsNull() {
            addCriterion("audience_review is null");
            return (Criteria) this;
        }

        public Criteria andAudienceReviewIsNotNull() {
            addCriterion("audience_review is not null");
            return (Criteria) this;
        }

        public Criteria andAudienceReviewEqualTo(Double value) {
            addCriterion("audience_review =", value, "audienceReview");
            return (Criteria) this;
        }

        public Criteria andAudienceReviewNotEqualTo(Double value) {
            addCriterion("audience_review <>", value, "audienceReview");
            return (Criteria) this;
        }

        public Criteria andAudienceReviewGreaterThan(Double value) {
            addCriterion("audience_review >", value, "audienceReview");
            return (Criteria) this;
        }

        public Criteria andAudienceReviewGreaterThanOrEqualTo(Double value) {
            addCriterion("audience_review >=", value, "audienceReview");
            return (Criteria) this;
        }

        public Criteria andAudienceReviewLessThan(Double value) {
            addCriterion("audience_review <", value, "audienceReview");
            return (Criteria) this;
        }

        public Criteria andAudienceReviewLessThanOrEqualTo(Double value) {
            addCriterion("audience_review <=", value, "audienceReview");
            return (Criteria) this;
        }

        public Criteria andAudienceReviewIn(List<Double> values) {
            addCriterion("audience_review in", values, "audienceReview");
            return (Criteria) this;
        }

        public Criteria andAudienceReviewNotIn(List<Double> values) {
            addCriterion("audience_review not in", values, "audienceReview");
            return (Criteria) this;
        }

        public Criteria andAudienceReviewBetween(Double value1, Double value2) {
            addCriterion("audience_review between", value1, value2, "audienceReview");
            return (Criteria) this;
        }

        public Criteria andAudienceReviewNotBetween(Double value1, Double value2) {
            addCriterion("audience_review not between", value1, value2, "audienceReview");
            return (Criteria) this;
        }

        public Criteria andIntroductionIsNull() {
            addCriterion("introduction is null");
            return (Criteria) this;
        }

        public Criteria andIntroductionIsNotNull() {
            addCriterion("introduction is not null");
            return (Criteria) this;
        }

        public Criteria andIntroductionEqualTo(String value) {
            addCriterion("introduction =", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotEqualTo(String value) {
            addCriterion("introduction <>", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionGreaterThan(String value) {
            addCriterion("introduction >", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionGreaterThanOrEqualTo(String value) {
            addCriterion("introduction >=", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLessThan(String value) {
            addCriterion("introduction <", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLessThanOrEqualTo(String value) {
            addCriterion("introduction <=", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLike(String value) {
            addCriterion("introduction like", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotLike(String value) {
            addCriterion("introduction not like", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionIn(List<String> values) {
            addCriterion("introduction in", values, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotIn(List<String> values) {
            addCriterion("introduction not in", values, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionBetween(String value1, String value2) {
            addCriterion("introduction between", value1, value2, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotBetween(String value1, String value2) {
            addCriterion("introduction not between", value1, value2, "introduction");
            return (Criteria) this;
        }

        public Criteria andLastingTimeIsNull() {
            addCriterion("lasting_time is null");
            return (Criteria) this;
        }

        public Criteria andLastingTimeIsNotNull() {
            addCriterion("lasting_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastingTimeEqualTo(Integer value) {
            addCriterion("lasting_time =", value, "lastingTime");
            return (Criteria) this;
        }

        public Criteria andLastingTimeNotEqualTo(Integer value) {
            addCriterion("lasting_time <>", value, "lastingTime");
            return (Criteria) this;
        }

        public Criteria andLastingTimeGreaterThan(Integer value) {
            addCriterion("lasting_time >", value, "lastingTime");
            return (Criteria) this;
        }

        public Criteria andLastingTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("lasting_time >=", value, "lastingTime");
            return (Criteria) this;
        }

        public Criteria andLastingTimeLessThan(Integer value) {
            addCriterion("lasting_time <", value, "lastingTime");
            return (Criteria) this;
        }

        public Criteria andLastingTimeLessThanOrEqualTo(Integer value) {
            addCriterion("lasting_time <=", value, "lastingTime");
            return (Criteria) this;
        }

        public Criteria andLastingTimeIn(List<Integer> values) {
            addCriterion("lasting_time in", values, "lastingTime");
            return (Criteria) this;
        }

        public Criteria andLastingTimeNotIn(List<Integer> values) {
            addCriterion("lasting_time not in", values, "lastingTime");
            return (Criteria) this;
        }

        public Criteria andLastingTimeBetween(Integer value1, Integer value2) {
            addCriterion("lasting_time between", value1, value2, "lastingTime");
            return (Criteria) this;
        }

        public Criteria andLastingTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("lasting_time not between", value1, value2, "lastingTime");
            return (Criteria) this;
        }

        public Criteria andShowTimeIsNull() {
            addCriterion("show_time is null");
            return (Criteria) this;
        }

        public Criteria andShowTimeIsNotNull() {
            addCriterion("show_time is not null");
            return (Criteria) this;
        }

        public Criteria andShowTimeEqualTo(Date value) {
            addCriterion("show_time =", value, "showTime");
            return (Criteria) this;
        }

        public Criteria andShowTimeNotEqualTo(Date value) {
            addCriterion("show_time <>", value, "showTime");
            return (Criteria) this;
        }

        public Criteria andShowTimeGreaterThan(Date value) {
            addCriterion("show_time >", value, "showTime");
            return (Criteria) this;
        }

        public Criteria andShowTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("show_time >=", value, "showTime");
            return (Criteria) this;
        }

        public Criteria andShowTimeLessThan(Date value) {
            addCriterion("show_time <", value, "showTime");
            return (Criteria) this;
        }

        public Criteria andShowTimeLessThanOrEqualTo(Date value) {
            addCriterion("show_time <=", value, "showTime");
            return (Criteria) this;
        }

        public Criteria andShowTimeIn(List<Date> values) {
            addCriterion("show_time in", values, "showTime");
            return (Criteria) this;
        }

        public Criteria andShowTimeNotIn(List<Date> values) {
            addCriterion("show_time not in", values, "showTime");
            return (Criteria) this;
        }

        public Criteria andShowTimeBetween(Date value1, Date value2) {
            addCriterion("show_time between", value1, value2, "showTime");
            return (Criteria) this;
        }

        public Criteria andShowTimeNotBetween(Date value1, Date value2) {
            addCriterion("show_time not between", value1, value2, "showTime");
            return (Criteria) this;
        }

        public Criteria andActorIsNull() {
            addCriterion("actor is null");
            return (Criteria) this;
        }

        public Criteria andActorIsNotNull() {
            addCriterion("actor is not null");
            return (Criteria) this;
        }

        public Criteria andActorEqualTo(String value) {
            addCriterion("actor =", value, "actor");
            return (Criteria) this;
        }

        public Criteria andActorNotEqualTo(String value) {
            addCriterion("actor <>", value, "actor");
            return (Criteria) this;
        }

        public Criteria andActorGreaterThan(String value) {
            addCriterion("actor >", value, "actor");
            return (Criteria) this;
        }

        public Criteria andActorGreaterThanOrEqualTo(String value) {
            addCriterion("actor >=", value, "actor");
            return (Criteria) this;
        }

        public Criteria andActorLessThan(String value) {
            addCriterion("actor <", value, "actor");
            return (Criteria) this;
        }

        public Criteria andActorLessThanOrEqualTo(String value) {
            addCriterion("actor <=", value, "actor");
            return (Criteria) this;
        }

        public Criteria andActorLike(String value) {
            addCriterion("actor like", value, "actor");
            return (Criteria) this;
        }

        public Criteria andActorNotLike(String value) {
            addCriterion("actor not like", value, "actor");
            return (Criteria) this;
        }

        public Criteria andActorIn(List<String> values) {
            addCriterion("actor in", values, "actor");
            return (Criteria) this;
        }

        public Criteria andActorNotIn(List<String> values) {
            addCriterion("actor not in", values, "actor");
            return (Criteria) this;
        }

        public Criteria andActorBetween(String value1, String value2) {
            addCriterion("actor between", value1, value2, "actor");
            return (Criteria) this;
        }

        public Criteria andActorNotBetween(String value1, String value2) {
            addCriterion("actor not between", value1, value2, "actor");
            return (Criteria) this;
        }

        public Criteria andDirectorIsNull() {
            addCriterion("director is null");
            return (Criteria) this;
        }

        public Criteria andDirectorIsNotNull() {
            addCriterion("director is not null");
            return (Criteria) this;
        }

        public Criteria andDirectorEqualTo(String value) {
            addCriterion("director =", value, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorNotEqualTo(String value) {
            addCriterion("director <>", value, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorGreaterThan(String value) {
            addCriterion("director >", value, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorGreaterThanOrEqualTo(String value) {
            addCriterion("director >=", value, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorLessThan(String value) {
            addCriterion("director <", value, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorLessThanOrEqualTo(String value) {
            addCriterion("director <=", value, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorLike(String value) {
            addCriterion("director like", value, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorNotLike(String value) {
            addCriterion("director not like", value, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorIn(List<String> values) {
            addCriterion("director in", values, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorNotIn(List<String> values) {
            addCriterion("director not in", values, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorBetween(String value1, String value2) {
            addCriterion("director between", value1, value2, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorNotBetween(String value1, String value2) {
            addCriterion("director not between", value1, value2, "director");
            return (Criteria) this;
        }

        public Criteria andShowtableIndexIsNull() {
            addCriterion("showtable_index is null");
            return (Criteria) this;
        }

        public Criteria andShowtableIndexIsNotNull() {
            addCriterion("showtable_index is not null");
            return (Criteria) this;
        }

        public Criteria andShowtableIndexEqualTo(String value) {
            addCriterion("showtable_index =", value, "showtableIndex");
            return (Criteria) this;
        }

        public Criteria andShowtableIndexNotEqualTo(String value) {
            addCriterion("showtable_index <>", value, "showtableIndex");
            return (Criteria) this;
        }

        public Criteria andShowtableIndexGreaterThan(String value) {
            addCriterion("showtable_index >", value, "showtableIndex");
            return (Criteria) this;
        }

        public Criteria andShowtableIndexGreaterThanOrEqualTo(String value) {
            addCriterion("showtable_index >=", value, "showtableIndex");
            return (Criteria) this;
        }

        public Criteria andShowtableIndexLessThan(String value) {
            addCriterion("showtable_index <", value, "showtableIndex");
            return (Criteria) this;
        }

        public Criteria andShowtableIndexLessThanOrEqualTo(String value) {
            addCriterion("showtable_index <=", value, "showtableIndex");
            return (Criteria) this;
        }

        public Criteria andShowtableIndexLike(String value) {
            addCriterion("showtable_index like", value, "showtableIndex");
            return (Criteria) this;
        }

        public Criteria andShowtableIndexNotLike(String value) {
            addCriterion("showtable_index not like", value, "showtableIndex");
            return (Criteria) this;
        }

        public Criteria andShowtableIndexIn(List<String> values) {
            addCriterion("showtable_index in", values, "showtableIndex");
            return (Criteria) this;
        }

        public Criteria andShowtableIndexNotIn(List<String> values) {
            addCriterion("showtable_index not in", values, "showtableIndex");
            return (Criteria) this;
        }

        public Criteria andShowtableIndexBetween(String value1, String value2) {
            addCriterion("showtable_index between", value1, value2, "showtableIndex");
            return (Criteria) this;
        }

        public Criteria andShowtableIndexNotBetween(String value1, String value2) {
            addCriterion("showtable_index not between", value1, value2, "showtableIndex");
            return (Criteria) this;
        }

        public Criteria andReviewtableIndexIsNull() {
            addCriterion("reviewtable_index is null");
            return (Criteria) this;
        }

        public Criteria andReviewtableIndexIsNotNull() {
            addCriterion("reviewtable_index is not null");
            return (Criteria) this;
        }

        public Criteria andReviewtableIndexEqualTo(String value) {
            addCriterion("reviewtable_index =", value, "reviewtableIndex");
            return (Criteria) this;
        }

        public Criteria andReviewtableIndexNotEqualTo(String value) {
            addCriterion("reviewtable_index <>", value, "reviewtableIndex");
            return (Criteria) this;
        }

        public Criteria andReviewtableIndexGreaterThan(String value) {
            addCriterion("reviewtable_index >", value, "reviewtableIndex");
            return (Criteria) this;
        }

        public Criteria andReviewtableIndexGreaterThanOrEqualTo(String value) {
            addCriterion("reviewtable_index >=", value, "reviewtableIndex");
            return (Criteria) this;
        }

        public Criteria andReviewtableIndexLessThan(String value) {
            addCriterion("reviewtable_index <", value, "reviewtableIndex");
            return (Criteria) this;
        }

        public Criteria andReviewtableIndexLessThanOrEqualTo(String value) {
            addCriterion("reviewtable_index <=", value, "reviewtableIndex");
            return (Criteria) this;
        }

        public Criteria andReviewtableIndexLike(String value) {
            addCriterion("reviewtable_index like", value, "reviewtableIndex");
            return (Criteria) this;
        }

        public Criteria andReviewtableIndexNotLike(String value) {
            addCriterion("reviewtable_index not like", value, "reviewtableIndex");
            return (Criteria) this;
        }

        public Criteria andReviewtableIndexIn(List<String> values) {
            addCriterion("reviewtable_index in", values, "reviewtableIndex");
            return (Criteria) this;
        }

        public Criteria andReviewtableIndexNotIn(List<String> values) {
            addCriterion("reviewtable_index not in", values, "reviewtableIndex");
            return (Criteria) this;
        }

        public Criteria andReviewtableIndexBetween(String value1, String value2) {
            addCriterion("reviewtable_index between", value1, value2, "reviewtableIndex");
            return (Criteria) this;
        }

        public Criteria andReviewtableIndexNotBetween(String value1, String value2) {
            addCriterion("reviewtable_index not between", value1, value2, "reviewtableIndex");
            return (Criteria) this;
        }

        public Criteria andVideoUrlIsNull() {
            addCriterion("video_url is null");
            return (Criteria) this;
        }

        public Criteria andVideoUrlIsNotNull() {
            addCriterion("video_url is not null");
            return (Criteria) this;
        }

        public Criteria andVideoUrlEqualTo(String value) {
            addCriterion("video_url =", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlNotEqualTo(String value) {
            addCriterion("video_url <>", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlGreaterThan(String value) {
            addCriterion("video_url >", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlGreaterThanOrEqualTo(String value) {
            addCriterion("video_url >=", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlLessThan(String value) {
            addCriterion("video_url <", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlLessThanOrEqualTo(String value) {
            addCriterion("video_url <=", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlLike(String value) {
            addCriterion("video_url like", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlNotLike(String value) {
            addCriterion("video_url not like", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlIn(List<String> values) {
            addCriterion("video_url in", values, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlNotIn(List<String> values) {
            addCriterion("video_url not in", values, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlBetween(String value1, String value2) {
            addCriterion("video_url between", value1, value2, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlNotBetween(String value1, String value2) {
            addCriterion("video_url not between", value1, value2, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andImagUrlIsNull() {
            addCriterion("imag_url is null");
            return (Criteria) this;
        }

        public Criteria andImagUrlIsNotNull() {
            addCriterion("imag_url is not null");
            return (Criteria) this;
        }

        public Criteria andImagUrlEqualTo(String value) {
            addCriterion("imag_url =", value, "imagUrl");
            return (Criteria) this;
        }

        public Criteria andImagUrlNotEqualTo(String value) {
            addCriterion("imag_url <>", value, "imagUrl");
            return (Criteria) this;
        }

        public Criteria andImagUrlGreaterThan(String value) {
            addCriterion("imag_url >", value, "imagUrl");
            return (Criteria) this;
        }

        public Criteria andImagUrlGreaterThanOrEqualTo(String value) {
            addCriterion("imag_url >=", value, "imagUrl");
            return (Criteria) this;
        }

        public Criteria andImagUrlLessThan(String value) {
            addCriterion("imag_url <", value, "imagUrl");
            return (Criteria) this;
        }

        public Criteria andImagUrlLessThanOrEqualTo(String value) {
            addCriterion("imag_url <=", value, "imagUrl");
            return (Criteria) this;
        }

        public Criteria andImagUrlLike(String value) {
            addCriterion("imag_url like", value, "imagUrl");
            return (Criteria) this;
        }

        public Criteria andImagUrlNotLike(String value) {
            addCriterion("imag_url not like", value, "imagUrl");
            return (Criteria) this;
        }

        public Criteria andImagUrlIn(List<String> values) {
            addCriterion("imag_url in", values, "imagUrl");
            return (Criteria) this;
        }

        public Criteria andImagUrlNotIn(List<String> values) {
            addCriterion("imag_url not in", values, "imagUrl");
            return (Criteria) this;
        }

        public Criteria andImagUrlBetween(String value1, String value2) {
            addCriterion("imag_url between", value1, value2, "imagUrl");
            return (Criteria) this;
        }

        public Criteria andImagUrlNotBetween(String value1, String value2) {
            addCriterion("imag_url not between", value1, value2, "imagUrl");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}