package com.example.demo.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ArticleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ArticleExample() {
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

        public Criteria andArticleTypeidIsNull() {
            addCriterion("article_typeID is null");
            return (Criteria) this;
        }

        public Criteria andArticleTypeidIsNotNull() {
            addCriterion("article_typeID is not null");
            return (Criteria) this;
        }

        public Criteria andArticleTypeidEqualTo(Integer value) {
            addCriterion("article_typeID =", value, "articleTypeid");
            return (Criteria) this;
        }

        public Criteria andArticleTypeidNotEqualTo(Integer value) {
            addCriterion("article_typeID <>", value, "articleTypeid");
            return (Criteria) this;
        }

        public Criteria andArticleTypeidGreaterThan(Integer value) {
            addCriterion("article_typeID >", value, "articleTypeid");
            return (Criteria) this;
        }

        public Criteria andArticleTypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("article_typeID >=", value, "articleTypeid");
            return (Criteria) this;
        }

        public Criteria andArticleTypeidLessThan(Integer value) {
            addCriterion("article_typeID <", value, "articleTypeid");
            return (Criteria) this;
        }

        public Criteria andArticleTypeidLessThanOrEqualTo(Integer value) {
            addCriterion("article_typeID <=", value, "articleTypeid");
            return (Criteria) this;
        }

        public Criteria andArticleTypeidIn(List<Integer> values) {
            addCriterion("article_typeID in", values, "articleTypeid");
            return (Criteria) this;
        }

        public Criteria andArticleTypeidNotIn(List<Integer> values) {
            addCriterion("article_typeID not in", values, "articleTypeid");
            return (Criteria) this;
        }

        public Criteria andArticleTypeidBetween(Integer value1, Integer value2) {
            addCriterion("article_typeID between", value1, value2, "articleTypeid");
            return (Criteria) this;
        }

        public Criteria andArticleTypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("article_typeID not between", value1, value2, "articleTypeid");
            return (Criteria) this;
        }

        public Criteria andArticleTitleIsNull() {
            addCriterion("article_title is null");
            return (Criteria) this;
        }

        public Criteria andArticleTitleIsNotNull() {
            addCriterion("article_title is not null");
            return (Criteria) this;
        }

        public Criteria andArticleTitleEqualTo(String value) {
            addCriterion("article_title =", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleNotEqualTo(String value) {
            addCriterion("article_title <>", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleGreaterThan(String value) {
            addCriterion("article_title >", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleGreaterThanOrEqualTo(String value) {
            addCriterion("article_title >=", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleLessThan(String value) {
            addCriterion("article_title <", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleLessThanOrEqualTo(String value) {
            addCriterion("article_title <=", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleLike(String value) {
            addCriterion("article_title like", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleNotLike(String value) {
            addCriterion("article_title not like", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleIn(List<String> values) {
            addCriterion("article_title in", values, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleNotIn(List<String> values) {
            addCriterion("article_title not in", values, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleBetween(String value1, String value2) {
            addCriterion("article_title between", value1, value2, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleNotBetween(String value1, String value2) {
            addCriterion("article_title not between", value1, value2, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleCountIsNull() {
            addCriterion("article_count is null");
            return (Criteria) this;
        }

        public Criteria andArticleCountIsNotNull() {
            addCriterion("article_count is not null");
            return (Criteria) this;
        }

        public Criteria andArticleCountEqualTo(Integer value) {
            addCriterion("article_count =", value, "articleCount");
            return (Criteria) this;
        }

        public Criteria andArticleCountNotEqualTo(Integer value) {
            addCriterion("article_count <>", value, "articleCount");
            return (Criteria) this;
        }

        public Criteria andArticleCountGreaterThan(Integer value) {
            addCriterion("article_count >", value, "articleCount");
            return (Criteria) this;
        }

        public Criteria andArticleCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("article_count >=", value, "articleCount");
            return (Criteria) this;
        }

        public Criteria andArticleCountLessThan(Integer value) {
            addCriterion("article_count <", value, "articleCount");
            return (Criteria) this;
        }

        public Criteria andArticleCountLessThanOrEqualTo(Integer value) {
            addCriterion("article_count <=", value, "articleCount");
            return (Criteria) this;
        }

        public Criteria andArticleCountIn(List<Integer> values) {
            addCriterion("article_count in", values, "articleCount");
            return (Criteria) this;
        }

        public Criteria andArticleCountNotIn(List<Integer> values) {
            addCriterion("article_count not in", values, "articleCount");
            return (Criteria) this;
        }

        public Criteria andArticleCountBetween(Integer value1, Integer value2) {
            addCriterion("article_count between", value1, value2, "articleCount");
            return (Criteria) this;
        }

        public Criteria andArticleCountNotBetween(Integer value1, Integer value2) {
            addCriterion("article_count not between", value1, value2, "articleCount");
            return (Criteria) this;
        }

        public Criteria andArticleFromIsNull() {
            addCriterion("article_from is null");
            return (Criteria) this;
        }

        public Criteria andArticleFromIsNotNull() {
            addCriterion("article_from is not null");
            return (Criteria) this;
        }

        public Criteria andArticleFromEqualTo(Integer value) {
            addCriterion("article_from =", value, "articleFrom");
            return (Criteria) this;
        }

        public Criteria andArticleFromNotEqualTo(Integer value) {
            addCriterion("article_from <>", value, "articleFrom");
            return (Criteria) this;
        }

        public Criteria andArticleFromGreaterThan(Integer value) {
            addCriterion("article_from >", value, "articleFrom");
            return (Criteria) this;
        }

        public Criteria andArticleFromGreaterThanOrEqualTo(Integer value) {
            addCriterion("article_from >=", value, "articleFrom");
            return (Criteria) this;
        }

        public Criteria andArticleFromLessThan(Integer value) {
            addCriterion("article_from <", value, "articleFrom");
            return (Criteria) this;
        }

        public Criteria andArticleFromLessThanOrEqualTo(Integer value) {
            addCriterion("article_from <=", value, "articleFrom");
            return (Criteria) this;
        }

        public Criteria andArticleFromIn(List<Integer> values) {
            addCriterion("article_from in", values, "articleFrom");
            return (Criteria) this;
        }

        public Criteria andArticleFromNotIn(List<Integer> values) {
            addCriterion("article_from not in", values, "articleFrom");
            return (Criteria) this;
        }

        public Criteria andArticleFromBetween(Integer value1, Integer value2) {
            addCriterion("article_from between", value1, value2, "articleFrom");
            return (Criteria) this;
        }

        public Criteria andArticleFromNotBetween(Integer value1, Integer value2) {
            addCriterion("article_from not between", value1, value2, "articleFrom");
            return (Criteria) this;
        }

        public Criteria andArticleMasteridIsNull() {
            addCriterion("article_masterID is null");
            return (Criteria) this;
        }

        public Criteria andArticleMasteridIsNotNull() {
            addCriterion("article_masterID is not null");
            return (Criteria) this;
        }

        public Criteria andArticleMasteridEqualTo(Integer value) {
            addCriterion("article_masterID =", value, "articleMasterid");
            return (Criteria) this;
        }

        public Criteria andArticleMasteridNotEqualTo(Integer value) {
            addCriterion("article_masterID <>", value, "articleMasterid");
            return (Criteria) this;
        }

        public Criteria andArticleMasteridGreaterThan(Integer value) {
            addCriterion("article_masterID >", value, "articleMasterid");
            return (Criteria) this;
        }

        public Criteria andArticleMasteridGreaterThanOrEqualTo(Integer value) {
            addCriterion("article_masterID >=", value, "articleMasterid");
            return (Criteria) this;
        }

        public Criteria andArticleMasteridLessThan(Integer value) {
            addCriterion("article_masterID <", value, "articleMasterid");
            return (Criteria) this;
        }

        public Criteria andArticleMasteridLessThanOrEqualTo(Integer value) {
            addCriterion("article_masterID <=", value, "articleMasterid");
            return (Criteria) this;
        }

        public Criteria andArticleMasteridIn(List<Integer> values) {
            addCriterion("article_masterID in", values, "articleMasterid");
            return (Criteria) this;
        }

        public Criteria andArticleMasteridNotIn(List<Integer> values) {
            addCriterion("article_masterID not in", values, "articleMasterid");
            return (Criteria) this;
        }

        public Criteria andArticleMasteridBetween(Integer value1, Integer value2) {
            addCriterion("article_masterID between", value1, value2, "articleMasterid");
            return (Criteria) this;
        }

        public Criteria andArticleMasteridNotBetween(Integer value1, Integer value2) {
            addCriterion("article_masterID not between", value1, value2, "articleMasterid");
            return (Criteria) this;
        }

        public Criteria andArticleDateIsNull() {
            addCriterion("article_date is null");
            return (Criteria) this;
        }

        public Criteria andArticleDateIsNotNull() {
            addCriterion("article_date is not null");
            return (Criteria) this;
        }

        public Criteria andArticleDateEqualTo(Date value) {
            addCriterion("article_date =", value, "articleDate");
            return (Criteria) this;
        }

        public Criteria andArticleDateNotEqualTo(Date value) {
            addCriterion("article_date <>", value, "articleDate");
            return (Criteria) this;
        }

        public Criteria andArticleDateGreaterThan(Date value) {
            addCriterion("article_date >", value, "articleDate");
            return (Criteria) this;
        }

        public Criteria andArticleDateGreaterThanOrEqualTo(Date value) {
            addCriterion("article_date >=", value, "articleDate");
            return (Criteria) this;
        }

        public Criteria andArticleDateLessThan(Date value) {
            addCriterion("article_date <", value, "articleDate");
            return (Criteria) this;
        }

        public Criteria andArticleDateLessThanOrEqualTo(Date value) {
            addCriterion("article_date <=", value, "articleDate");
            return (Criteria) this;
        }

        public Criteria andArticleDateIn(List<Date> values) {
            addCriterion("article_date in", values, "articleDate");
            return (Criteria) this;
        }

        public Criteria andArticleDateNotIn(List<Date> values) {
            addCriterion("article_date not in", values, "articleDate");
            return (Criteria) this;
        }

        public Criteria andArticleDateBetween(Date value1, Date value2) {
            addCriterion("article_date between", value1, value2, "articleDate");
            return (Criteria) this;
        }

        public Criteria andArticleDateNotBetween(Date value1, Date value2) {
            addCriterion("article_date not between", value1, value2, "articleDate");
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