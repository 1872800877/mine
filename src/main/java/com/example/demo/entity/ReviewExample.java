package com.example.demo.entity;

import java.util.ArrayList;
import java.util.Date;
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

        public Criteria andReviewArticleidIsNull() {
            addCriterion("review_articleID is null");
            return (Criteria) this;
        }

        public Criteria andReviewArticleidIsNotNull() {
            addCriterion("review_articleID is not null");
            return (Criteria) this;
        }

        public Criteria andReviewArticleidEqualTo(Integer value) {
            addCriterion("review_articleID =", value, "reviewArticleid");
            return (Criteria) this;
        }

        public Criteria andReviewArticleidNotEqualTo(Integer value) {
            addCriterion("review_articleID <>", value, "reviewArticleid");
            return (Criteria) this;
        }

        public Criteria andReviewArticleidGreaterThan(Integer value) {
            addCriterion("review_articleID >", value, "reviewArticleid");
            return (Criteria) this;
        }

        public Criteria andReviewArticleidGreaterThanOrEqualTo(Integer value) {
            addCriterion("review_articleID >=", value, "reviewArticleid");
            return (Criteria) this;
        }

        public Criteria andReviewArticleidLessThan(Integer value) {
            addCriterion("review_articleID <", value, "reviewArticleid");
            return (Criteria) this;
        }

        public Criteria andReviewArticleidLessThanOrEqualTo(Integer value) {
            addCriterion("review_articleID <=", value, "reviewArticleid");
            return (Criteria) this;
        }

        public Criteria andReviewArticleidIn(List<Integer> values) {
            addCriterion("review_articleID in", values, "reviewArticleid");
            return (Criteria) this;
        }

        public Criteria andReviewArticleidNotIn(List<Integer> values) {
            addCriterion("review_articleID not in", values, "reviewArticleid");
            return (Criteria) this;
        }

        public Criteria andReviewArticleidBetween(Integer value1, Integer value2) {
            addCriterion("review_articleID between", value1, value2, "reviewArticleid");
            return (Criteria) this;
        }

        public Criteria andReviewArticleidNotBetween(Integer value1, Integer value2) {
            addCriterion("review_articleID not between", value1, value2, "reviewArticleid");
            return (Criteria) this;
        }

        public Criteria andReviewMasteridIsNull() {
            addCriterion("review_masterID is null");
            return (Criteria) this;
        }

        public Criteria andReviewMasteridIsNotNull() {
            addCriterion("review_masterID is not null");
            return (Criteria) this;
        }

        public Criteria andReviewMasteridEqualTo(Integer value) {
            addCriterion("review_masterID =", value, "reviewMasterid");
            return (Criteria) this;
        }

        public Criteria andReviewMasteridNotEqualTo(Integer value) {
            addCriterion("review_masterID <>", value, "reviewMasterid");
            return (Criteria) this;
        }

        public Criteria andReviewMasteridGreaterThan(Integer value) {
            addCriterion("review_masterID >", value, "reviewMasterid");
            return (Criteria) this;
        }

        public Criteria andReviewMasteridGreaterThanOrEqualTo(Integer value) {
            addCriterion("review_masterID >=", value, "reviewMasterid");
            return (Criteria) this;
        }

        public Criteria andReviewMasteridLessThan(Integer value) {
            addCriterion("review_masterID <", value, "reviewMasterid");
            return (Criteria) this;
        }

        public Criteria andReviewMasteridLessThanOrEqualTo(Integer value) {
            addCriterion("review_masterID <=", value, "reviewMasterid");
            return (Criteria) this;
        }

        public Criteria andReviewMasteridIn(List<Integer> values) {
            addCriterion("review_masterID in", values, "reviewMasterid");
            return (Criteria) this;
        }

        public Criteria andReviewMasteridNotIn(List<Integer> values) {
            addCriterion("review_masterID not in", values, "reviewMasterid");
            return (Criteria) this;
        }

        public Criteria andReviewMasteridBetween(Integer value1, Integer value2) {
            addCriterion("review_masterID between", value1, value2, "reviewMasterid");
            return (Criteria) this;
        }

        public Criteria andReviewMasteridNotBetween(Integer value1, Integer value2) {
            addCriterion("review_masterID not between", value1, value2, "reviewMasterid");
            return (Criteria) this;
        }

        public Criteria andReviewContentIsNull() {
            addCriterion("review_content is null");
            return (Criteria) this;
        }

        public Criteria andReviewContentIsNotNull() {
            addCriterion("review_content is not null");
            return (Criteria) this;
        }

        public Criteria andReviewContentEqualTo(String value) {
            addCriterion("review_content =", value, "reviewContent");
            return (Criteria) this;
        }

        public Criteria andReviewContentNotEqualTo(String value) {
            addCriterion("review_content <>", value, "reviewContent");
            return (Criteria) this;
        }

        public Criteria andReviewContentGreaterThan(String value) {
            addCriterion("review_content >", value, "reviewContent");
            return (Criteria) this;
        }

        public Criteria andReviewContentGreaterThanOrEqualTo(String value) {
            addCriterion("review_content >=", value, "reviewContent");
            return (Criteria) this;
        }

        public Criteria andReviewContentLessThan(String value) {
            addCriterion("review_content <", value, "reviewContent");
            return (Criteria) this;
        }

        public Criteria andReviewContentLessThanOrEqualTo(String value) {
            addCriterion("review_content <=", value, "reviewContent");
            return (Criteria) this;
        }

        public Criteria andReviewContentLike(String value) {
            addCriterion("review_content like", value, "reviewContent");
            return (Criteria) this;
        }

        public Criteria andReviewContentNotLike(String value) {
            addCriterion("review_content not like", value, "reviewContent");
            return (Criteria) this;
        }

        public Criteria andReviewContentIn(List<String> values) {
            addCriterion("review_content in", values, "reviewContent");
            return (Criteria) this;
        }

        public Criteria andReviewContentNotIn(List<String> values) {
            addCriterion("review_content not in", values, "reviewContent");
            return (Criteria) this;
        }

        public Criteria andReviewContentBetween(String value1, String value2) {
            addCriterion("review_content between", value1, value2, "reviewContent");
            return (Criteria) this;
        }

        public Criteria andReviewContentNotBetween(String value1, String value2) {
            addCriterion("review_content not between", value1, value2, "reviewContent");
            return (Criteria) this;
        }

        public Criteria andReviewSdtimeIsNull() {
            addCriterion("review_sdTime is null");
            return (Criteria) this;
        }

        public Criteria andReviewSdtimeIsNotNull() {
            addCriterion("review_sdTime is not null");
            return (Criteria) this;
        }

        public Criteria andReviewSdtimeEqualTo(Date value) {
            addCriterion("review_sdTime =", value, "reviewSdtime");
            return (Criteria) this;
        }

        public Criteria andReviewSdtimeNotEqualTo(Date value) {
            addCriterion("review_sdTime <>", value, "reviewSdtime");
            return (Criteria) this;
        }

        public Criteria andReviewSdtimeGreaterThan(Date value) {
            addCriterion("review_sdTime >", value, "reviewSdtime");
            return (Criteria) this;
        }

        public Criteria andReviewSdtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("review_sdTime >=", value, "reviewSdtime");
            return (Criteria) this;
        }

        public Criteria andReviewSdtimeLessThan(Date value) {
            addCriterion("review_sdTime <", value, "reviewSdtime");
            return (Criteria) this;
        }

        public Criteria andReviewSdtimeLessThanOrEqualTo(Date value) {
            addCriterion("review_sdTime <=", value, "reviewSdtime");
            return (Criteria) this;
        }

        public Criteria andReviewSdtimeIn(List<Date> values) {
            addCriterion("review_sdTime in", values, "reviewSdtime");
            return (Criteria) this;
        }

        public Criteria andReviewSdtimeNotIn(List<Date> values) {
            addCriterion("review_sdTime not in", values, "reviewSdtime");
            return (Criteria) this;
        }

        public Criteria andReviewSdtimeBetween(Date value1, Date value2) {
            addCriterion("review_sdTime between", value1, value2, "reviewSdtime");
            return (Criteria) this;
        }

        public Criteria andReviewSdtimeNotBetween(Date value1, Date value2) {
            addCriterion("review_sdTime not between", value1, value2, "reviewSdtime");
            return (Criteria) this;
        }

        public Criteria andReviewAuthoridIsNull() {
            addCriterion("review_authorID is null");
            return (Criteria) this;
        }

        public Criteria andReviewAuthoridIsNotNull() {
            addCriterion("review_authorID is not null");
            return (Criteria) this;
        }

        public Criteria andReviewAuthoridEqualTo(Integer value) {
            addCriterion("review_authorID =", value, "reviewAuthorid");
            return (Criteria) this;
        }

        public Criteria andReviewAuthoridNotEqualTo(Integer value) {
            addCriterion("review_authorID <>", value, "reviewAuthorid");
            return (Criteria) this;
        }

        public Criteria andReviewAuthoridGreaterThan(Integer value) {
            addCriterion("review_authorID >", value, "reviewAuthorid");
            return (Criteria) this;
        }

        public Criteria andReviewAuthoridGreaterThanOrEqualTo(Integer value) {
            addCriterion("review_authorID >=", value, "reviewAuthorid");
            return (Criteria) this;
        }

        public Criteria andReviewAuthoridLessThan(Integer value) {
            addCriterion("review_authorID <", value, "reviewAuthorid");
            return (Criteria) this;
        }

        public Criteria andReviewAuthoridLessThanOrEqualTo(Integer value) {
            addCriterion("review_authorID <=", value, "reviewAuthorid");
            return (Criteria) this;
        }

        public Criteria andReviewAuthoridIn(List<Integer> values) {
            addCriterion("review_authorID in", values, "reviewAuthorid");
            return (Criteria) this;
        }

        public Criteria andReviewAuthoridNotIn(List<Integer> values) {
            addCriterion("review_authorID not in", values, "reviewAuthorid");
            return (Criteria) this;
        }

        public Criteria andReviewAuthoridBetween(Integer value1, Integer value2) {
            addCriterion("review_authorID between", value1, value2, "reviewAuthorid");
            return (Criteria) this;
        }

        public Criteria andReviewAuthoridNotBetween(Integer value1, Integer value2) {
            addCriterion("review_authorID not between", value1, value2, "reviewAuthorid");
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