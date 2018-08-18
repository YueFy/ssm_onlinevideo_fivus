package pojo;

import java.util.ArrayList;
import java.util.List;

public class ReviewExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReviewExample() {
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

        public Criteria andReviewIndexIsNull() {
            addCriterion("review_index is null");
            return (Criteria) this;
        }

        public Criteria andReviewIndexIsNotNull() {
            addCriterion("review_index is not null");
            return (Criteria) this;
        }

        public Criteria andReviewIndexEqualTo(Integer value) {
            addCriterion("review_index =", value, "reviewIndex");
            return (Criteria) this;
        }

        public Criteria andReviewIndexNotEqualTo(Integer value) {
            addCriterion("review_index <>", value, "reviewIndex");
            return (Criteria) this;
        }

        public Criteria andReviewIndexGreaterThan(Integer value) {
            addCriterion("review_index >", value, "reviewIndex");
            return (Criteria) this;
        }

        public Criteria andReviewIndexGreaterThanOrEqualTo(Integer value) {
            addCriterion("review_index >=", value, "reviewIndex");
            return (Criteria) this;
        }

        public Criteria andReviewIndexLessThan(Integer value) {
            addCriterion("review_index <", value, "reviewIndex");
            return (Criteria) this;
        }

        public Criteria andReviewIndexLessThanOrEqualTo(Integer value) {
            addCriterion("review_index <=", value, "reviewIndex");
            return (Criteria) this;
        }

        public Criteria andReviewIndexIn(List<Integer> values) {
            addCriterion("review_index in", values, "reviewIndex");
            return (Criteria) this;
        }

        public Criteria andReviewIndexNotIn(List<Integer> values) {
            addCriterion("review_index not in", values, "reviewIndex");
            return (Criteria) this;
        }

        public Criteria andReviewIndexBetween(Integer value1, Integer value2) {
            addCriterion("review_index between", value1, value2, "reviewIndex");
            return (Criteria) this;
        }

        public Criteria andReviewIndexNotBetween(Integer value1, Integer value2) {
            addCriterion("review_index not between", value1, value2, "reviewIndex");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
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

        public Criteria andReplayIsNull() {
            addCriterion("replay is null");
            return (Criteria) this;
        }

        public Criteria andReplayIsNotNull() {
            addCriterion("replay is not null");
            return (Criteria) this;
        }

        public Criteria andReplayEqualTo(String value) {
            addCriterion("replay =", value, "replay");
            return (Criteria) this;
        }

        public Criteria andReplayNotEqualTo(String value) {
            addCriterion("replay <>", value, "replay");
            return (Criteria) this;
        }

        public Criteria andReplayGreaterThan(String value) {
            addCriterion("replay >", value, "replay");
            return (Criteria) this;
        }

        public Criteria andReplayGreaterThanOrEqualTo(String value) {
            addCriterion("replay >=", value, "replay");
            return (Criteria) this;
        }

        public Criteria andReplayLessThan(String value) {
            addCriterion("replay <", value, "replay");
            return (Criteria) this;
        }

        public Criteria andReplayLessThanOrEqualTo(String value) {
            addCriterion("replay <=", value, "replay");
            return (Criteria) this;
        }

        public Criteria andReplayLike(String value) {
            addCriterion("replay like", value, "replay");
            return (Criteria) this;
        }

        public Criteria andReplayNotLike(String value) {
            addCriterion("replay not like", value, "replay");
            return (Criteria) this;
        }

        public Criteria andReplayIn(List<String> values) {
            addCriterion("replay in", values, "replay");
            return (Criteria) this;
        }

        public Criteria andReplayNotIn(List<String> values) {
            addCriterion("replay not in", values, "replay");
            return (Criteria) this;
        }

        public Criteria andReplayBetween(String value1, String value2) {
            addCriterion("replay between", value1, value2, "replay");
            return (Criteria) this;
        }

        public Criteria andReplayNotBetween(String value1, String value2) {
            addCriterion("replay not between", value1, value2, "replay");
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