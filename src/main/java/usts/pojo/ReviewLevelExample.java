package usts.pojo;

import java.util.ArrayList;
import java.util.List;

public class ReviewLevelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReviewLevelExample() {
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

        public Criteria andReviewlevelIndexIsNull() {
            addCriterion("reviewlevel_index is null");
            return (Criteria) this;
        }

        public Criteria andReviewlevelIndexIsNotNull() {
            addCriterion("reviewlevel_index is not null");
            return (Criteria) this;
        }

        public Criteria andReviewlevelIndexEqualTo(Integer value) {
            addCriterion("reviewlevel_index =", value, "reviewlevelIndex");
            return (Criteria) this;
        }

        public Criteria andReviewlevelIndexNotEqualTo(Integer value) {
            addCriterion("reviewlevel_index <>", value, "reviewlevelIndex");
            return (Criteria) this;
        }

        public Criteria andReviewlevelIndexGreaterThan(Integer value) {
            addCriterion("reviewlevel_index >", value, "reviewlevelIndex");
            return (Criteria) this;
        }

        public Criteria andReviewlevelIndexGreaterThanOrEqualTo(Integer value) {
            addCriterion("reviewlevel_index >=", value, "reviewlevelIndex");
            return (Criteria) this;
        }

        public Criteria andReviewlevelIndexLessThan(Integer value) {
            addCriterion("reviewlevel_index <", value, "reviewlevelIndex");
            return (Criteria) this;
        }

        public Criteria andReviewlevelIndexLessThanOrEqualTo(Integer value) {
            addCriterion("reviewlevel_index <=", value, "reviewlevelIndex");
            return (Criteria) this;
        }

        public Criteria andReviewlevelIndexIn(List<Integer> values) {
            addCriterion("reviewlevel_index in", values, "reviewlevelIndex");
            return (Criteria) this;
        }

        public Criteria andReviewlevelIndexNotIn(List<Integer> values) {
            addCriterion("reviewlevel_index not in", values, "reviewlevelIndex");
            return (Criteria) this;
        }

        public Criteria andReviewlevelIndexBetween(Integer value1, Integer value2) {
            addCriterion("reviewlevel_index between", value1, value2, "reviewlevelIndex");
            return (Criteria) this;
        }

        public Criteria andReviewlevelIndexNotBetween(Integer value1, Integer value2) {
            addCriterion("reviewlevel_index not between", value1, value2, "reviewlevelIndex");
            return (Criteria) this;
        }

        public Criteria andUserIndexIsNull() {
            addCriterion("user_index is null");
            return (Criteria) this;
        }

        public Criteria andUserIndexIsNotNull() {
            addCriterion("user_index is not null");
            return (Criteria) this;
        }

        public Criteria andUserIndexEqualTo(Integer value) {
            addCriterion("user_index =", value, "userIndex");
            return (Criteria) this;
        }

        public Criteria andUserIndexNotEqualTo(Integer value) {
            addCriterion("user_index <>", value, "userIndex");
            return (Criteria) this;
        }

        public Criteria andUserIndexGreaterThan(Integer value) {
            addCriterion("user_index >", value, "userIndex");
            return (Criteria) this;
        }

        public Criteria andUserIndexGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_index >=", value, "userIndex");
            return (Criteria) this;
        }

        public Criteria andUserIndexLessThan(Integer value) {
            addCriterion("user_index <", value, "userIndex");
            return (Criteria) this;
        }

        public Criteria andUserIndexLessThanOrEqualTo(Integer value) {
            addCriterion("user_index <=", value, "userIndex");
            return (Criteria) this;
        }

        public Criteria andUserIndexIn(List<Integer> values) {
            addCriterion("user_index in", values, "userIndex");
            return (Criteria) this;
        }

        public Criteria andUserIndexNotIn(List<Integer> values) {
            addCriterion("user_index not in", values, "userIndex");
            return (Criteria) this;
        }

        public Criteria andUserIndexBetween(Integer value1, Integer value2) {
            addCriterion("user_index between", value1, value2, "userIndex");
            return (Criteria) this;
        }

        public Criteria andUserIndexNotBetween(Integer value1, Integer value2) {
            addCriterion("user_index not between", value1, value2, "userIndex");
            return (Criteria) this;
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

        public Criteria andReviewLevelIsNull() {
            addCriterion("review_level is null");
            return (Criteria) this;
        }

        public Criteria andReviewLevelIsNotNull() {
            addCriterion("review_level is not null");
            return (Criteria) this;
        }

        public Criteria andReviewLevelEqualTo(Double value) {
            addCriterion("review_level =", value, "reviewLevel");
            return (Criteria) this;
        }

        public Criteria andReviewLevelNotEqualTo(Double value) {
            addCriterion("review_level <>", value, "reviewLevel");
            return (Criteria) this;
        }

        public Criteria andReviewLevelGreaterThan(Double value) {
            addCriterion("review_level >", value, "reviewLevel");
            return (Criteria) this;
        }

        public Criteria andReviewLevelGreaterThanOrEqualTo(Double value) {
            addCriterion("review_level >=", value, "reviewLevel");
            return (Criteria) this;
        }

        public Criteria andReviewLevelLessThan(Double value) {
            addCriterion("review_level <", value, "reviewLevel");
            return (Criteria) this;
        }

        public Criteria andReviewLevelLessThanOrEqualTo(Double value) {
            addCriterion("review_level <=", value, "reviewLevel");
            return (Criteria) this;
        }

        public Criteria andReviewLevelIn(List<Double> values) {
            addCriterion("review_level in", values, "reviewLevel");
            return (Criteria) this;
        }

        public Criteria andReviewLevelNotIn(List<Double> values) {
            addCriterion("review_level not in", values, "reviewLevel");
            return (Criteria) this;
        }

        public Criteria andReviewLevelBetween(Double value1, Double value2) {
            addCriterion("review_level between", value1, value2, "reviewLevel");
            return (Criteria) this;
        }

        public Criteria andReviewLevelNotBetween(Double value1, Double value2) {
            addCriterion("review_level not between", value1, value2, "reviewLevel");
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