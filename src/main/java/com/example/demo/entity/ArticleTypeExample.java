package com.example.demo.entity;

import java.util.ArrayList;
import java.util.List;

public class ArticleTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ArticleTypeExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andArticletypeNameIsNull() {
            addCriterion("articleType_name is null");
            return (Criteria) this;
        }

        public Criteria andArticletypeNameIsNotNull() {
            addCriterion("articleType_name is not null");
            return (Criteria) this;
        }

        public Criteria andArticletypeNameEqualTo(String value) {
            addCriterion("articleType_name =", value, "articletypeName");
            return (Criteria) this;
        }

        public Criteria andArticletypeNameNotEqualTo(String value) {
            addCriterion("articleType_name <>", value, "articletypeName");
            return (Criteria) this;
        }

        public Criteria andArticletypeNameGreaterThan(String value) {
            addCriterion("articleType_name >", value, "articletypeName");
            return (Criteria) this;
        }

        public Criteria andArticletypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("articleType_name >=", value, "articletypeName");
            return (Criteria) this;
        }

        public Criteria andArticletypeNameLessThan(String value) {
            addCriterion("articleType_name <", value, "articletypeName");
            return (Criteria) this;
        }

        public Criteria andArticletypeNameLessThanOrEqualTo(String value) {
            addCriterion("articleType_name <=", value, "articletypeName");
            return (Criteria) this;
        }

        public Criteria andArticletypeNameLike(String value) {
            addCriterion("articleType_name like", value, "articletypeName");
            return (Criteria) this;
        }

        public Criteria andArticletypeNameNotLike(String value) {
            addCriterion("articleType_name not like", value, "articletypeName");
            return (Criteria) this;
        }

        public Criteria andArticletypeNameIn(List<String> values) {
            addCriterion("articleType_name in", values, "articletypeName");
            return (Criteria) this;
        }

        public Criteria andArticletypeNameNotIn(List<String> values) {
            addCriterion("articleType_name not in", values, "articletypeName");
            return (Criteria) this;
        }

        public Criteria andArticletypeNameBetween(String value1, String value2) {
            addCriterion("articleType_name between", value1, value2, "articletypeName");
            return (Criteria) this;
        }

        public Criteria andArticletypeNameNotBetween(String value1, String value2) {
            addCriterion("articleType_name not between", value1, value2, "articletypeName");
            return (Criteria) this;
        }

        public Criteria andArticletypeInfoIsNull() {
            addCriterion("articleType_info is null");
            return (Criteria) this;
        }

        public Criteria andArticletypeInfoIsNotNull() {
            addCriterion("articleType_info is not null");
            return (Criteria) this;
        }

        public Criteria andArticletypeInfoEqualTo(String value) {
            addCriterion("articleType_info =", value, "articletypeInfo");
            return (Criteria) this;
        }

        public Criteria andArticletypeInfoNotEqualTo(String value) {
            addCriterion("articleType_info <>", value, "articletypeInfo");
            return (Criteria) this;
        }

        public Criteria andArticletypeInfoGreaterThan(String value) {
            addCriterion("articleType_info >", value, "articletypeInfo");
            return (Criteria) this;
        }

        public Criteria andArticletypeInfoGreaterThanOrEqualTo(String value) {
            addCriterion("articleType_info >=", value, "articletypeInfo");
            return (Criteria) this;
        }

        public Criteria andArticletypeInfoLessThan(String value) {
            addCriterion("articleType_info <", value, "articletypeInfo");
            return (Criteria) this;
        }

        public Criteria andArticletypeInfoLessThanOrEqualTo(String value) {
            addCriterion("articleType_info <=", value, "articletypeInfo");
            return (Criteria) this;
        }

        public Criteria andArticletypeInfoLike(String value) {
            addCriterion("articleType_info like", value, "articletypeInfo");
            return (Criteria) this;
        }

        public Criteria andArticletypeInfoNotLike(String value) {
            addCriterion("articleType_info not like", value, "articletypeInfo");
            return (Criteria) this;
        }

        public Criteria andArticletypeInfoIn(List<String> values) {
            addCriterion("articleType_info in", values, "articletypeInfo");
            return (Criteria) this;
        }

        public Criteria andArticletypeInfoNotIn(List<String> values) {
            addCriterion("articleType_info not in", values, "articletypeInfo");
            return (Criteria) this;
        }

        public Criteria andArticletypeInfoBetween(String value1, String value2) {
            addCriterion("articleType_info between", value1, value2, "articletypeInfo");
            return (Criteria) this;
        }

        public Criteria andArticletypeInfoNotBetween(String value1, String value2) {
            addCriterion("articleType_info not between", value1, value2, "articletypeInfo");
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