package usts.pojo;

import java.util.ArrayList;
import java.util.List;

public class ReplayExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReplayExample() {
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

        public Criteria andReplayIndexIsNull() {
            addCriterion("replay_index is null");
            return (Criteria) this;
        }

        public Criteria andReplayIndexIsNotNull() {
            addCriterion("replay_index is not null");
            return (Criteria) this;
        }

        public Criteria andReplayIndexEqualTo(Integer value) {
            addCriterion("replay_index =", value, "replayIndex");
            return (Criteria) this;
        }

        public Criteria andReplayIndexNotEqualTo(Integer value) {
            addCriterion("replay_index <>", value, "replayIndex");
            return (Criteria) this;
        }

        public Criteria andReplayIndexGreaterThan(Integer value) {
            addCriterion("replay_index >", value, "replayIndex");
            return (Criteria) this;
        }

        public Criteria andReplayIndexGreaterThanOrEqualTo(Integer value) {
            addCriterion("replay_index >=", value, "replayIndex");
            return (Criteria) this;
        }

        public Criteria andReplayIndexLessThan(Integer value) {
            addCriterion("replay_index <", value, "replayIndex");
            return (Criteria) this;
        }

        public Criteria andReplayIndexLessThanOrEqualTo(Integer value) {
            addCriterion("replay_index <=", value, "replayIndex");
            return (Criteria) this;
        }

        public Criteria andReplayIndexIn(List<Integer> values) {
            addCriterion("replay_index in", values, "replayIndex");
            return (Criteria) this;
        }

        public Criteria andReplayIndexNotIn(List<Integer> values) {
            addCriterion("replay_index not in", values, "replayIndex");
            return (Criteria) this;
        }

        public Criteria andReplayIndexBetween(Integer value1, Integer value2) {
            addCriterion("replay_index between", value1, value2, "replayIndex");
            return (Criteria) this;
        }

        public Criteria andReplayIndexNotBetween(Integer value1, Integer value2) {
            addCriterion("replay_index not between", value1, value2, "replayIndex");
            return (Criteria) this;
        }

        public Criteria andContextIsNull() {
            addCriterion("context is null");
            return (Criteria) this;
        }

        public Criteria andContextIsNotNull() {
            addCriterion("context is not null");
            return (Criteria) this;
        }

        public Criteria andContextEqualTo(String value) {
            addCriterion("context =", value, "context");
            return (Criteria) this;
        }

        public Criteria andContextNotEqualTo(String value) {
            addCriterion("context <>", value, "context");
            return (Criteria) this;
        }

        public Criteria andContextGreaterThan(String value) {
            addCriterion("context >", value, "context");
            return (Criteria) this;
        }

        public Criteria andContextGreaterThanOrEqualTo(String value) {
            addCriterion("context >=", value, "context");
            return (Criteria) this;
        }

        public Criteria andContextLessThan(String value) {
            addCriterion("context <", value, "context");
            return (Criteria) this;
        }

        public Criteria andContextLessThanOrEqualTo(String value) {
            addCriterion("context <=", value, "context");
            return (Criteria) this;
        }

        public Criteria andContextLike(String value) {
            addCriterion("context like", value, "context");
            return (Criteria) this;
        }

        public Criteria andContextNotLike(String value) {
            addCriterion("context not like", value, "context");
            return (Criteria) this;
        }

        public Criteria andContextIn(List<String> values) {
            addCriterion("context in", values, "context");
            return (Criteria) this;
        }

        public Criteria andContextNotIn(List<String> values) {
            addCriterion("context not in", values, "context");
            return (Criteria) this;
        }

        public Criteria andContextBetween(String value1, String value2) {
            addCriterion("context between", value1, value2, "context");
            return (Criteria) this;
        }

        public Criteria andContextNotBetween(String value1, String value2) {
            addCriterion("context not between", value1, value2, "context");
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