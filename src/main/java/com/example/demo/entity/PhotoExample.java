package com.example.demo.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PhotoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PhotoExample() {
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

        public Criteria andPhotoAddrIsNull() {
            addCriterion("Photo_addr is null");
            return (Criteria) this;
        }

        public Criteria andPhotoAddrIsNotNull() {
            addCriterion("Photo_addr is not null");
            return (Criteria) this;
        }

        public Criteria andPhotoAddrEqualTo(String value) {
            addCriterion("Photo_addr =", value, "photoAddr");
            return (Criteria) this;
        }

        public Criteria andPhotoAddrNotEqualTo(String value) {
            addCriterion("Photo_addr <>", value, "photoAddr");
            return (Criteria) this;
        }

        public Criteria andPhotoAddrGreaterThan(String value) {
            addCriterion("Photo_addr >", value, "photoAddr");
            return (Criteria) this;
        }

        public Criteria andPhotoAddrGreaterThanOrEqualTo(String value) {
            addCriterion("Photo_addr >=", value, "photoAddr");
            return (Criteria) this;
        }

        public Criteria andPhotoAddrLessThan(String value) {
            addCriterion("Photo_addr <", value, "photoAddr");
            return (Criteria) this;
        }

        public Criteria andPhotoAddrLessThanOrEqualTo(String value) {
            addCriterion("Photo_addr <=", value, "photoAddr");
            return (Criteria) this;
        }

        public Criteria andPhotoAddrLike(String value) {
            addCriterion("Photo_addr like", value, "photoAddr");
            return (Criteria) this;
        }

        public Criteria andPhotoAddrNotLike(String value) {
            addCriterion("Photo_addr not like", value, "photoAddr");
            return (Criteria) this;
        }

        public Criteria andPhotoAddrIn(List<String> values) {
            addCriterion("Photo_addr in", values, "photoAddr");
            return (Criteria) this;
        }

        public Criteria andPhotoAddrNotIn(List<String> values) {
            addCriterion("Photo_addr not in", values, "photoAddr");
            return (Criteria) this;
        }

        public Criteria andPhotoAddrBetween(String value1, String value2) {
            addCriterion("Photo_addr between", value1, value2, "photoAddr");
            return (Criteria) this;
        }

        public Criteria andPhotoAddrNotBetween(String value1, String value2) {
            addCriterion("Photo_addr not between", value1, value2, "photoAddr");
            return (Criteria) this;
        }

        public Criteria andPhotoAdtimeIsNull() {
            addCriterion("Photo_adTime is null");
            return (Criteria) this;
        }

        public Criteria andPhotoAdtimeIsNotNull() {
            addCriterion("Photo_adTime is not null");
            return (Criteria) this;
        }

        public Criteria andPhotoAdtimeEqualTo(Date value) {
            addCriterion("Photo_adTime =", value, "photoAdtime");
            return (Criteria) this;
        }

        public Criteria andPhotoAdtimeNotEqualTo(Date value) {
            addCriterion("Photo_adTime <>", value, "photoAdtime");
            return (Criteria) this;
        }

        public Criteria andPhotoAdtimeGreaterThan(Date value) {
            addCriterion("Photo_adTime >", value, "photoAdtime");
            return (Criteria) this;
        }

        public Criteria andPhotoAdtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("Photo_adTime >=", value, "photoAdtime");
            return (Criteria) this;
        }

        public Criteria andPhotoAdtimeLessThan(Date value) {
            addCriterion("Photo_adTime <", value, "photoAdtime");
            return (Criteria) this;
        }

        public Criteria andPhotoAdtimeLessThanOrEqualTo(Date value) {
            addCriterion("Photo_adTime <=", value, "photoAdtime");
            return (Criteria) this;
        }

        public Criteria andPhotoAdtimeIn(List<Date> values) {
            addCriterion("Photo_adTime in", values, "photoAdtime");
            return (Criteria) this;
        }

        public Criteria andPhotoAdtimeNotIn(List<Date> values) {
            addCriterion("Photo_adTime not in", values, "photoAdtime");
            return (Criteria) this;
        }

        public Criteria andPhotoAdtimeBetween(Date value1, Date value2) {
            addCriterion("Photo_adTime between", value1, value2, "photoAdtime");
            return (Criteria) this;
        }

        public Criteria andPhotoAdtimeNotBetween(Date value1, Date value2) {
            addCriterion("Photo_adTime not between", value1, value2, "photoAdtime");
            return (Criteria) this;
        }

        public Criteria andPhotoInfoIsNull() {
            addCriterion("Photo_info is null");
            return (Criteria) this;
        }

        public Criteria andPhotoInfoIsNotNull() {
            addCriterion("Photo_info is not null");
            return (Criteria) this;
        }

        public Criteria andPhotoInfoEqualTo(String value) {
            addCriterion("Photo_info =", value, "photoInfo");
            return (Criteria) this;
        }

        public Criteria andPhotoInfoNotEqualTo(String value) {
            addCriterion("Photo_info <>", value, "photoInfo");
            return (Criteria) this;
        }

        public Criteria andPhotoInfoGreaterThan(String value) {
            addCriterion("Photo_info >", value, "photoInfo");
            return (Criteria) this;
        }

        public Criteria andPhotoInfoGreaterThanOrEqualTo(String value) {
            addCriterion("Photo_info >=", value, "photoInfo");
            return (Criteria) this;
        }

        public Criteria andPhotoInfoLessThan(String value) {
            addCriterion("Photo_info <", value, "photoInfo");
            return (Criteria) this;
        }

        public Criteria andPhotoInfoLessThanOrEqualTo(String value) {
            addCriterion("Photo_info <=", value, "photoInfo");
            return (Criteria) this;
        }

        public Criteria andPhotoInfoLike(String value) {
            addCriterion("Photo_info like", value, "photoInfo");
            return (Criteria) this;
        }

        public Criteria andPhotoInfoNotLike(String value) {
            addCriterion("Photo_info not like", value, "photoInfo");
            return (Criteria) this;
        }

        public Criteria andPhotoInfoIn(List<String> values) {
            addCriterion("Photo_info in", values, "photoInfo");
            return (Criteria) this;
        }

        public Criteria andPhotoInfoNotIn(List<String> values) {
            addCriterion("Photo_info not in", values, "photoInfo");
            return (Criteria) this;
        }

        public Criteria andPhotoInfoBetween(String value1, String value2) {
            addCriterion("Photo_info between", value1, value2, "photoInfo");
            return (Criteria) this;
        }

        public Criteria andPhotoInfoNotBetween(String value1, String value2) {
            addCriterion("Photo_info not between", value1, value2, "photoInfo");
            return (Criteria) this;
        }

        public Criteria andPhotoMasteridIsNull() {
            addCriterion("Photo_masterID is null");
            return (Criteria) this;
        }

        public Criteria andPhotoMasteridIsNotNull() {
            addCriterion("Photo_masterID is not null");
            return (Criteria) this;
        }

        public Criteria andPhotoMasteridEqualTo(Integer value) {
            addCriterion("Photo_masterID =", value, "photoMasterid");
            return (Criteria) this;
        }

        public Criteria andPhotoMasteridNotEqualTo(Integer value) {
            addCriterion("Photo_masterID <>", value, "photoMasterid");
            return (Criteria) this;
        }

        public Criteria andPhotoMasteridGreaterThan(Integer value) {
            addCriterion("Photo_masterID >", value, "photoMasterid");
            return (Criteria) this;
        }

        public Criteria andPhotoMasteridGreaterThanOrEqualTo(Integer value) {
            addCriterion("Photo_masterID >=", value, "photoMasterid");
            return (Criteria) this;
        }

        public Criteria andPhotoMasteridLessThan(Integer value) {
            addCriterion("Photo_masterID <", value, "photoMasterid");
            return (Criteria) this;
        }

        public Criteria andPhotoMasteridLessThanOrEqualTo(Integer value) {
            addCriterion("Photo_masterID <=", value, "photoMasterid");
            return (Criteria) this;
        }

        public Criteria andPhotoMasteridIn(List<Integer> values) {
            addCriterion("Photo_masterID in", values, "photoMasterid");
            return (Criteria) this;
        }

        public Criteria andPhotoMasteridNotIn(List<Integer> values) {
            addCriterion("Photo_masterID not in", values, "photoMasterid");
            return (Criteria) this;
        }

        public Criteria andPhotoMasteridBetween(Integer value1, Integer value2) {
            addCriterion("Photo_masterID between", value1, value2, "photoMasterid");
            return (Criteria) this;
        }

        public Criteria andPhotoMasteridNotBetween(Integer value1, Integer value2) {
            addCriterion("Photo_masterID not between", value1, value2, "photoMasterid");
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