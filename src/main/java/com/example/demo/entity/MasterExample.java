package com.example.demo.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MasterExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MasterExample() {
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

        public Criteria andMasterUsernameIsNull() {
            addCriterion("Master_username is null");
            return (Criteria) this;
        }

        public Criteria andMasterUsernameIsNotNull() {
            addCriterion("Master_username is not null");
            return (Criteria) this;
        }

        public Criteria andMasterUsernameEqualTo(String value) {
            addCriterion("Master_username =", value, "masterUsername");
            return (Criteria) this;
        }

        public Criteria andMasterUsernameNotEqualTo(String value) {
            addCriterion("Master_username <>", value, "masterUsername");
            return (Criteria) this;
        }

        public Criteria andMasterUsernameGreaterThan(String value) {
            addCriterion("Master_username >", value, "masterUsername");
            return (Criteria) this;
        }

        public Criteria andMasterUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("Master_username >=", value, "masterUsername");
            return (Criteria) this;
        }

        public Criteria andMasterUsernameLessThan(String value) {
            addCriterion("Master_username <", value, "masterUsername");
            return (Criteria) this;
        }

        public Criteria andMasterUsernameLessThanOrEqualTo(String value) {
            addCriterion("Master_username <=", value, "masterUsername");
            return (Criteria) this;
        }

        public Criteria andMasterUsernameLike(String value) {
            addCriterion("Master_username like", value, "masterUsername");
            return (Criteria) this;
        }

        public Criteria andMasterUsernameNotLike(String value) {
            addCriterion("Master_username not like", value, "masterUsername");
            return (Criteria) this;
        }

        public Criteria andMasterUsernameIn(List<String> values) {
            addCriterion("Master_username in", values, "masterUsername");
            return (Criteria) this;
        }

        public Criteria andMasterUsernameNotIn(List<String> values) {
            addCriterion("Master_username not in", values, "masterUsername");
            return (Criteria) this;
        }

        public Criteria andMasterUsernameBetween(String value1, String value2) {
            addCriterion("Master_username between", value1, value2, "masterUsername");
            return (Criteria) this;
        }

        public Criteria andMasterUsernameNotBetween(String value1, String value2) {
            addCriterion("Master_username not between", value1, value2, "masterUsername");
            return (Criteria) this;
        }

        public Criteria andMasterNicknameIsNull() {
            addCriterion("Master_nickName is null");
            return (Criteria) this;
        }

        public Criteria andMasterNicknameIsNotNull() {
            addCriterion("Master_nickName is not null");
            return (Criteria) this;
        }

        public Criteria andMasterNicknameEqualTo(String value) {
            addCriterion("Master_nickName =", value, "masterNickname");
            return (Criteria) this;
        }

        public Criteria andMasterNicknameNotEqualTo(String value) {
            addCriterion("Master_nickName <>", value, "masterNickname");
            return (Criteria) this;
        }

        public Criteria andMasterNicknameGreaterThan(String value) {
            addCriterion("Master_nickName >", value, "masterNickname");
            return (Criteria) this;
        }

        public Criteria andMasterNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("Master_nickName >=", value, "masterNickname");
            return (Criteria) this;
        }

        public Criteria andMasterNicknameLessThan(String value) {
            addCriterion("Master_nickName <", value, "masterNickname");
            return (Criteria) this;
        }

        public Criteria andMasterNicknameLessThanOrEqualTo(String value) {
            addCriterion("Master_nickName <=", value, "masterNickname");
            return (Criteria) this;
        }

        public Criteria andMasterNicknameLike(String value) {
            addCriterion("Master_nickName like", value, "masterNickname");
            return (Criteria) this;
        }

        public Criteria andMasterNicknameNotLike(String value) {
            addCriterion("Master_nickName not like", value, "masterNickname");
            return (Criteria) this;
        }

        public Criteria andMasterNicknameIn(List<String> values) {
            addCriterion("Master_nickName in", values, "masterNickname");
            return (Criteria) this;
        }

        public Criteria andMasterNicknameNotIn(List<String> values) {
            addCriterion("Master_nickName not in", values, "masterNickname");
            return (Criteria) this;
        }

        public Criteria andMasterNicknameBetween(String value1, String value2) {
            addCriterion("Master_nickName between", value1, value2, "masterNickname");
            return (Criteria) this;
        }

        public Criteria andMasterNicknameNotBetween(String value1, String value2) {
            addCriterion("Master_nickName not between", value1, value2, "masterNickname");
            return (Criteria) this;
        }

        public Criteria andMasterPasswordIsNull() {
            addCriterion("Master_password is null");
            return (Criteria) this;
        }

        public Criteria andMasterPasswordIsNotNull() {
            addCriterion("Master_password is not null");
            return (Criteria) this;
        }

        public Criteria andMasterPasswordEqualTo(String value) {
            addCriterion("Master_password =", value, "masterPassword");
            return (Criteria) this;
        }

        public Criteria andMasterPasswordNotEqualTo(String value) {
            addCriterion("Master_password <>", value, "masterPassword");
            return (Criteria) this;
        }

        public Criteria andMasterPasswordGreaterThan(String value) {
            addCriterion("Master_password >", value, "masterPassword");
            return (Criteria) this;
        }

        public Criteria andMasterPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("Master_password >=", value, "masterPassword");
            return (Criteria) this;
        }

        public Criteria andMasterPasswordLessThan(String value) {
            addCriterion("Master_password <", value, "masterPassword");
            return (Criteria) this;
        }

        public Criteria andMasterPasswordLessThanOrEqualTo(String value) {
            addCriterion("Master_password <=", value, "masterPassword");
            return (Criteria) this;
        }

        public Criteria andMasterPasswordLike(String value) {
            addCriterion("Master_password like", value, "masterPassword");
            return (Criteria) this;
        }

        public Criteria andMasterPasswordNotLike(String value) {
            addCriterion("Master_password not like", value, "masterPassword");
            return (Criteria) this;
        }

        public Criteria andMasterPasswordIn(List<String> values) {
            addCriterion("Master_password in", values, "masterPassword");
            return (Criteria) this;
        }

        public Criteria andMasterPasswordNotIn(List<String> values) {
            addCriterion("Master_password not in", values, "masterPassword");
            return (Criteria) this;
        }

        public Criteria andMasterPasswordBetween(String value1, String value2) {
            addCriterion("Master_password between", value1, value2, "masterPassword");
            return (Criteria) this;
        }

        public Criteria andMasterPasswordNotBetween(String value1, String value2) {
            addCriterion("Master_password not between", value1, value2, "masterPassword");
            return (Criteria) this;
        }

        public Criteria andMasterOicqIsNull() {
            addCriterion("Master_oicq is null");
            return (Criteria) this;
        }

        public Criteria andMasterOicqIsNotNull() {
            addCriterion("Master_oicq is not null");
            return (Criteria) this;
        }

        public Criteria andMasterOicqEqualTo(String value) {
            addCriterion("Master_oicq =", value, "masterOicq");
            return (Criteria) this;
        }

        public Criteria andMasterOicqNotEqualTo(String value) {
            addCriterion("Master_oicq <>", value, "masterOicq");
            return (Criteria) this;
        }

        public Criteria andMasterOicqGreaterThan(String value) {
            addCriterion("Master_oicq >", value, "masterOicq");
            return (Criteria) this;
        }

        public Criteria andMasterOicqGreaterThanOrEqualTo(String value) {
            addCriterion("Master_oicq >=", value, "masterOicq");
            return (Criteria) this;
        }

        public Criteria andMasterOicqLessThan(String value) {
            addCriterion("Master_oicq <", value, "masterOicq");
            return (Criteria) this;
        }

        public Criteria andMasterOicqLessThanOrEqualTo(String value) {
            addCriterion("Master_oicq <=", value, "masterOicq");
            return (Criteria) this;
        }

        public Criteria andMasterOicqLike(String value) {
            addCriterion("Master_oicq like", value, "masterOicq");
            return (Criteria) this;
        }

        public Criteria andMasterOicqNotLike(String value) {
            addCriterion("Master_oicq not like", value, "masterOicq");
            return (Criteria) this;
        }

        public Criteria andMasterOicqIn(List<String> values) {
            addCriterion("Master_oicq in", values, "masterOicq");
            return (Criteria) this;
        }

        public Criteria andMasterOicqNotIn(List<String> values) {
            addCriterion("Master_oicq not in", values, "masterOicq");
            return (Criteria) this;
        }

        public Criteria andMasterOicqBetween(String value1, String value2) {
            addCriterion("Master_oicq between", value1, value2, "masterOicq");
            return (Criteria) this;
        }

        public Criteria andMasterOicqNotBetween(String value1, String value2) {
            addCriterion("Master_oicq not between", value1, value2, "masterOicq");
            return (Criteria) this;
        }

        public Criteria andMasterSexIsNull() {
            addCriterion("Master_sex is null");
            return (Criteria) this;
        }

        public Criteria andMasterSexIsNotNull() {
            addCriterion("Master_sex is not null");
            return (Criteria) this;
        }

        public Criteria andMasterSexEqualTo(Integer value) {
            addCriterion("Master_sex =", value, "masterSex");
            return (Criteria) this;
        }

        public Criteria andMasterSexNotEqualTo(Integer value) {
            addCriterion("Master_sex <>", value, "masterSex");
            return (Criteria) this;
        }

        public Criteria andMasterSexGreaterThan(Integer value) {
            addCriterion("Master_sex >", value, "masterSex");
            return (Criteria) this;
        }

        public Criteria andMasterSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("Master_sex >=", value, "masterSex");
            return (Criteria) this;
        }

        public Criteria andMasterSexLessThan(Integer value) {
            addCriterion("Master_sex <", value, "masterSex");
            return (Criteria) this;
        }

        public Criteria andMasterSexLessThanOrEqualTo(Integer value) {
            addCriterion("Master_sex <=", value, "masterSex");
            return (Criteria) this;
        }

        public Criteria andMasterSexIn(List<Integer> values) {
            addCriterion("Master_sex in", values, "masterSex");
            return (Criteria) this;
        }

        public Criteria andMasterSexNotIn(List<Integer> values) {
            addCriterion("Master_sex not in", values, "masterSex");
            return (Criteria) this;
        }

        public Criteria andMasterSexBetween(Integer value1, Integer value2) {
            addCriterion("Master_sex between", value1, value2, "masterSex");
            return (Criteria) this;
        }

        public Criteria andMasterSexNotBetween(Integer value1, Integer value2) {
            addCriterion("Master_sex not between", value1, value2, "masterSex");
            return (Criteria) this;
        }

        public Criteria andMasterLogintimeIsNull() {
            addCriterion("Master_logintime is null");
            return (Criteria) this;
        }

        public Criteria andMasterLogintimeIsNotNull() {
            addCriterion("Master_logintime is not null");
            return (Criteria) this;
        }

        public Criteria andMasterLogintimeEqualTo(Date value) {
            addCriterion("Master_logintime =", value, "masterLogintime");
            return (Criteria) this;
        }

        public Criteria andMasterLogintimeNotEqualTo(Date value) {
            addCriterion("Master_logintime <>", value, "masterLogintime");
            return (Criteria) this;
        }

        public Criteria andMasterLogintimeGreaterThan(Date value) {
            addCriterion("Master_logintime >", value, "masterLogintime");
            return (Criteria) this;
        }

        public Criteria andMasterLogintimeGreaterThanOrEqualTo(Date value) {
            addCriterion("Master_logintime >=", value, "masterLogintime");
            return (Criteria) this;
        }

        public Criteria andMasterLogintimeLessThan(Date value) {
            addCriterion("Master_logintime <", value, "masterLogintime");
            return (Criteria) this;
        }

        public Criteria andMasterLogintimeLessThanOrEqualTo(Date value) {
            addCriterion("Master_logintime <=", value, "masterLogintime");
            return (Criteria) this;
        }

        public Criteria andMasterLogintimeIn(List<Date> values) {
            addCriterion("Master_logintime in", values, "masterLogintime");
            return (Criteria) this;
        }

        public Criteria andMasterLogintimeNotIn(List<Date> values) {
            addCriterion("Master_logintime not in", values, "masterLogintime");
            return (Criteria) this;
        }

        public Criteria andMasterLogintimeBetween(Date value1, Date value2) {
            addCriterion("Master_logintime between", value1, value2, "masterLogintime");
            return (Criteria) this;
        }

        public Criteria andMasterLogintimeNotBetween(Date value1, Date value2) {
            addCriterion("Master_logintime not between", value1, value2, "masterLogintime");
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