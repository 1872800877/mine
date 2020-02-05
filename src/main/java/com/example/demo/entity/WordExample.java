package com.example.demo.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WordExample() {
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

        public Criteria andWordTitleIsNull() {
            addCriterion("word_title is null");
            return (Criteria) this;
        }

        public Criteria andWordTitleIsNotNull() {
            addCriterion("word_title is not null");
            return (Criteria) this;
        }

        public Criteria andWordTitleEqualTo(String value) {
            addCriterion("word_title =", value, "wordTitle");
            return (Criteria) this;
        }

        public Criteria andWordTitleNotEqualTo(String value) {
            addCriterion("word_title <>", value, "wordTitle");
            return (Criteria) this;
        }

        public Criteria andWordTitleGreaterThan(String value) {
            addCriterion("word_title >", value, "wordTitle");
            return (Criteria) this;
        }

        public Criteria andWordTitleGreaterThanOrEqualTo(String value) {
            addCriterion("word_title >=", value, "wordTitle");
            return (Criteria) this;
        }

        public Criteria andWordTitleLessThan(String value) {
            addCriterion("word_title <", value, "wordTitle");
            return (Criteria) this;
        }

        public Criteria andWordTitleLessThanOrEqualTo(String value) {
            addCriterion("word_title <=", value, "wordTitle");
            return (Criteria) this;
        }

        public Criteria andWordTitleLike(String value) {
            addCriterion("word_title like", value, "wordTitle");
            return (Criteria) this;
        }

        public Criteria andWordTitleNotLike(String value) {
            addCriterion("word_title not like", value, "wordTitle");
            return (Criteria) this;
        }

        public Criteria andWordTitleIn(List<String> values) {
            addCriterion("word_title in", values, "wordTitle");
            return (Criteria) this;
        }

        public Criteria andWordTitleNotIn(List<String> values) {
            addCriterion("word_title not in", values, "wordTitle");
            return (Criteria) this;
        }

        public Criteria andWordTitleBetween(String value1, String value2) {
            addCriterion("word_title between", value1, value2, "wordTitle");
            return (Criteria) this;
        }

        public Criteria andWordTitleNotBetween(String value1, String value2) {
            addCriterion("word_title not between", value1, value2, "wordTitle");
            return (Criteria) this;
        }

        public Criteria andWordContentIsNull() {
            addCriterion("word_content is null");
            return (Criteria) this;
        }

        public Criteria andWordContentIsNotNull() {
            addCriterion("word_content is not null");
            return (Criteria) this;
        }

        public Criteria andWordContentEqualTo(String value) {
            addCriterion("word_content =", value, "wordContent");
            return (Criteria) this;
        }

        public Criteria andWordContentNotEqualTo(String value) {
            addCriterion("word_content <>", value, "wordContent");
            return (Criteria) this;
        }

        public Criteria andWordContentGreaterThan(String value) {
            addCriterion("word_content >", value, "wordContent");
            return (Criteria) this;
        }

        public Criteria andWordContentGreaterThanOrEqualTo(String value) {
            addCriterion("word_content >=", value, "wordContent");
            return (Criteria) this;
        }

        public Criteria andWordContentLessThan(String value) {
            addCriterion("word_content <", value, "wordContent");
            return (Criteria) this;
        }

        public Criteria andWordContentLessThanOrEqualTo(String value) {
            addCriterion("word_content <=", value, "wordContent");
            return (Criteria) this;
        }

        public Criteria andWordContentLike(String value) {
            addCriterion("word_content like", value, "wordContent");
            return (Criteria) this;
        }

        public Criteria andWordContentNotLike(String value) {
            addCriterion("word_content not like", value, "wordContent");
            return (Criteria) this;
        }

        public Criteria andWordContentIn(List<String> values) {
            addCriterion("word_content in", values, "wordContent");
            return (Criteria) this;
        }

        public Criteria andWordContentNotIn(List<String> values) {
            addCriterion("word_content not in", values, "wordContent");
            return (Criteria) this;
        }

        public Criteria andWordContentBetween(String value1, String value2) {
            addCriterion("word_content between", value1, value2, "wordContent");
            return (Criteria) this;
        }

        public Criteria andWordContentNotBetween(String value1, String value2) {
            addCriterion("word_content not between", value1, value2, "wordContent");
            return (Criteria) this;
        }

        public Criteria andWordSdtimeIsNull() {
            addCriterion("word_sdTime is null");
            return (Criteria) this;
        }

        public Criteria andWordSdtimeIsNotNull() {
            addCriterion("word_sdTime is not null");
            return (Criteria) this;
        }

        public Criteria andWordSdtimeEqualTo(Date value) {
            addCriterion("word_sdTime =", value, "wordSdtime");
            return (Criteria) this;
        }

        public Criteria andWordSdtimeNotEqualTo(Date value) {
            addCriterion("word_sdTime <>", value, "wordSdtime");
            return (Criteria) this;
        }

        public Criteria andWordSdtimeGreaterThan(Date value) {
            addCriterion("word_sdTime >", value, "wordSdtime");
            return (Criteria) this;
        }

        public Criteria andWordSdtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("word_sdTime >=", value, "wordSdtime");
            return (Criteria) this;
        }

        public Criteria andWordSdtimeLessThan(Date value) {
            addCriterion("word_sdTime <", value, "wordSdtime");
            return (Criteria) this;
        }

        public Criteria andWordSdtimeLessThanOrEqualTo(Date value) {
            addCriterion("word_sdTime <=", value, "wordSdtime");
            return (Criteria) this;
        }

        public Criteria andWordSdtimeIn(List<Date> values) {
            addCriterion("word_sdTime in", values, "wordSdtime");
            return (Criteria) this;
        }

        public Criteria andWordSdtimeNotIn(List<Date> values) {
            addCriterion("word_sdTime not in", values, "wordSdtime");
            return (Criteria) this;
        }

        public Criteria andWordSdtimeBetween(Date value1, Date value2) {
            addCriterion("word_sdTime between", value1, value2, "wordSdtime");
            return (Criteria) this;
        }

        public Criteria andWordSdtimeNotBetween(Date value1, Date value2) {
            addCriterion("word_sdTime not between", value1, value2, "wordSdtime");
            return (Criteria) this;
        }

        public Criteria andWordAuthoridIsNull() {
            addCriterion("word_authorID is null");
            return (Criteria) this;
        }

        public Criteria andWordAuthoridIsNotNull() {
            addCriterion("word_authorID is not null");
            return (Criteria) this;
        }

        public Criteria andWordAuthoridEqualTo(Integer value) {
            addCriterion("word_authorID =", value, "wordAuthorid");
            return (Criteria) this;
        }

        public Criteria andWordAuthoridNotEqualTo(Integer value) {
            addCriterion("word_authorID <>", value, "wordAuthorid");
            return (Criteria) this;
        }

        public Criteria andWordAuthoridGreaterThan(Integer value) {
            addCriterion("word_authorID >", value, "wordAuthorid");
            return (Criteria) this;
        }

        public Criteria andWordAuthoridGreaterThanOrEqualTo(Integer value) {
            addCriterion("word_authorID >=", value, "wordAuthorid");
            return (Criteria) this;
        }

        public Criteria andWordAuthoridLessThan(Integer value) {
            addCriterion("word_authorID <", value, "wordAuthorid");
            return (Criteria) this;
        }

        public Criteria andWordAuthoridLessThanOrEqualTo(Integer value) {
            addCriterion("word_authorID <=", value, "wordAuthorid");
            return (Criteria) this;
        }

        public Criteria andWordAuthoridIn(List<Integer> values) {
            addCriterion("word_authorID in", values, "wordAuthorid");
            return (Criteria) this;
        }

        public Criteria andWordAuthoridNotIn(List<Integer> values) {
            addCriterion("word_authorID not in", values, "wordAuthorid");
            return (Criteria) this;
        }

        public Criteria andWordAuthoridBetween(Integer value1, Integer value2) {
            addCriterion("word_authorID between", value1, value2, "wordAuthorid");
            return (Criteria) this;
        }

        public Criteria andWordAuthoridNotBetween(Integer value1, Integer value2) {
            addCriterion("word_authorID not between", value1, value2, "wordAuthorid");
            return (Criteria) this;
        }

        public Criteria andWordMasteridIsNull() {
            addCriterion("word_masterID is null");
            return (Criteria) this;
        }

        public Criteria andWordMasteridIsNotNull() {
            addCriterion("word_masterID is not null");
            return (Criteria) this;
        }

        public Criteria andWordMasteridEqualTo(Integer value) {
            addCriterion("word_masterID =", value, "wordMasterid");
            return (Criteria) this;
        }

        public Criteria andWordMasteridNotEqualTo(Integer value) {
            addCriterion("word_masterID <>", value, "wordMasterid");
            return (Criteria) this;
        }

        public Criteria andWordMasteridGreaterThan(Integer value) {
            addCriterion("word_masterID >", value, "wordMasterid");
            return (Criteria) this;
        }

        public Criteria andWordMasteridGreaterThanOrEqualTo(Integer value) {
            addCriterion("word_masterID >=", value, "wordMasterid");
            return (Criteria) this;
        }

        public Criteria andWordMasteridLessThan(Integer value) {
            addCriterion("word_masterID <", value, "wordMasterid");
            return (Criteria) this;
        }

        public Criteria andWordMasteridLessThanOrEqualTo(Integer value) {
            addCriterion("word_masterID <=", value, "wordMasterid");
            return (Criteria) this;
        }

        public Criteria andWordMasteridIn(List<Integer> values) {
            addCriterion("word_masterID in", values, "wordMasterid");
            return (Criteria) this;
        }

        public Criteria andWordMasteridNotIn(List<Integer> values) {
            addCriterion("word_masterID not in", values, "wordMasterid");
            return (Criteria) this;
        }

        public Criteria andWordMasteridBetween(Integer value1, Integer value2) {
            addCriterion("word_masterID between", value1, value2, "wordMasterid");
            return (Criteria) this;
        }

        public Criteria andWordMasteridNotBetween(Integer value1, Integer value2) {
            addCriterion("word_masterID not between", value1, value2, "wordMasterid");
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