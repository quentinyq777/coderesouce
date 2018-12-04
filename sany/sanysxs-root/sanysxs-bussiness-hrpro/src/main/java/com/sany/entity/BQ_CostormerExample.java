package com.sany.entity;

import java.util.ArrayList;
import java.util.List;

public class BQ_CostormerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BQ_CostormerExample() {
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCostormtypeIsNull() {
            addCriterion("costormtype is null");
            return (Criteria) this;
        }

        public Criteria andCostormtypeIsNotNull() {
            addCriterion("costormtype is not null");
            return (Criteria) this;
        }

        public Criteria andCostormtypeEqualTo(String value) {
            addCriterion("costormtype =", value, "costormtype");
            return (Criteria) this;
        }

        public Criteria andCostormtypeNotEqualTo(String value) {
            addCriterion("costormtype <>", value, "costormtype");
            return (Criteria) this;
        }

        public Criteria andCostormtypeGreaterThan(String value) {
            addCriterion("costormtype >", value, "costormtype");
            return (Criteria) this;
        }

        public Criteria andCostormtypeGreaterThanOrEqualTo(String value) {
            addCriterion("costormtype >=", value, "costormtype");
            return (Criteria) this;
        }

        public Criteria andCostormtypeLessThan(String value) {
            addCriterion("costormtype <", value, "costormtype");
            return (Criteria) this;
        }

        public Criteria andCostormtypeLessThanOrEqualTo(String value) {
            addCriterion("costormtype <=", value, "costormtype");
            return (Criteria) this;
        }

        public Criteria andCostormtypeLike(String value) {
            addCriterion("costormtype like", value, "costormtype");
            return (Criteria) this;
        }

        public Criteria andCostormtypeNotLike(String value) {
            addCriterion("costormtype not like", value, "costormtype");
            return (Criteria) this;
        }

        public Criteria andCostormtypeIn(List<String> values) {
            addCriterion("costormtype in", values, "costormtype");
            return (Criteria) this;
        }

        public Criteria andCostormtypeNotIn(List<String> values) {
            addCriterion("costormtype not in", values, "costormtype");
            return (Criteria) this;
        }

        public Criteria andCostormtypeBetween(String value1, String value2) {
            addCriterion("costormtype between", value1, value2, "costormtype");
            return (Criteria) this;
        }

        public Criteria andCostormtypeNotBetween(String value1, String value2) {
            addCriterion("costormtype not between", value1, value2, "costormtype");
            return (Criteria) this;
        }

        public Criteria andCostormnameIsNull() {
            addCriterion("costormname is null");
            return (Criteria) this;
        }

        public Criteria andCostormnameIsNotNull() {
            addCriterion("costormname is not null");
            return (Criteria) this;
        }

        public Criteria andCostormnameEqualTo(String value) {
            addCriterion("costormname =", value, "costormname");
            return (Criteria) this;
        }

        public Criteria andCostormnameNotEqualTo(String value) {
            addCriterion("costormname <>", value, "costormname");
            return (Criteria) this;
        }

        public Criteria andCostormnameGreaterThan(String value) {
            addCriterion("costormname >", value, "costormname");
            return (Criteria) this;
        }

        public Criteria andCostormnameGreaterThanOrEqualTo(String value) {
            addCriterion("costormname >=", value, "costormname");
            return (Criteria) this;
        }

        public Criteria andCostormnameLessThan(String value) {
            addCriterion("costormname <", value, "costormname");
            return (Criteria) this;
        }

        public Criteria andCostormnameLessThanOrEqualTo(String value) {
            addCriterion("costormname <=", value, "costormname");
            return (Criteria) this;
        }

        public Criteria andCostormnameLike(String value) {
            addCriterion("costormname like", value, "costormname");
            return (Criteria) this;
        }

        public Criteria andCostormnameNotLike(String value) {
            addCriterion("costormname not like", value, "costormname");
            return (Criteria) this;
        }

        public Criteria andCostormnameIn(List<String> values) {
            addCriterion("costormname in", values, "costormname");
            return (Criteria) this;
        }

        public Criteria andCostormnameNotIn(List<String> values) {
            addCriterion("costormname not in", values, "costormname");
            return (Criteria) this;
        }

        public Criteria andCostormnameBetween(String value1, String value2) {
            addCriterion("costormname between", value1, value2, "costormname");
            return (Criteria) this;
        }

        public Criteria andCostormnameNotBetween(String value1, String value2) {
            addCriterion("costormname not between", value1, value2, "costormname");
            return (Criteria) this;
        }

        public Criteria andTaxnoIsNull() {
            addCriterion("taxno is null");
            return (Criteria) this;
        }

        public Criteria andTaxnoIsNotNull() {
            addCriterion("taxno is not null");
            return (Criteria) this;
        }

        public Criteria andTaxnoEqualTo(String value) {
            addCriterion("taxno =", value, "taxno");
            return (Criteria) this;
        }

        public Criteria andTaxnoNotEqualTo(String value) {
            addCriterion("taxno <>", value, "taxno");
            return (Criteria) this;
        }

        public Criteria andTaxnoGreaterThan(String value) {
            addCriterion("taxno >", value, "taxno");
            return (Criteria) this;
        }

        public Criteria andTaxnoGreaterThanOrEqualTo(String value) {
            addCriterion("taxno >=", value, "taxno");
            return (Criteria) this;
        }

        public Criteria andTaxnoLessThan(String value) {
            addCriterion("taxno <", value, "taxno");
            return (Criteria) this;
        }

        public Criteria andTaxnoLessThanOrEqualTo(String value) {
            addCriterion("taxno <=", value, "taxno");
            return (Criteria) this;
        }

        public Criteria andTaxnoLike(String value) {
            addCriterion("taxno like", value, "taxno");
            return (Criteria) this;
        }

        public Criteria andTaxnoNotLike(String value) {
            addCriterion("taxno not like", value, "taxno");
            return (Criteria) this;
        }

        public Criteria andTaxnoIn(List<String> values) {
            addCriterion("taxno in", values, "taxno");
            return (Criteria) this;
        }

        public Criteria andTaxnoNotIn(List<String> values) {
            addCriterion("taxno not in", values, "taxno");
            return (Criteria) this;
        }

        public Criteria andTaxnoBetween(String value1, String value2) {
            addCriterion("taxno between", value1, value2, "taxno");
            return (Criteria) this;
        }

        public Criteria andTaxnoNotBetween(String value1, String value2) {
            addCriterion("taxno not between", value1, value2, "taxno");
            return (Criteria) this;
        }

        public Criteria andTaxnameIsNull() {
            addCriterion("taxname is null");
            return (Criteria) this;
        }

        public Criteria andTaxnameIsNotNull() {
            addCriterion("taxname is not null");
            return (Criteria) this;
        }

        public Criteria andTaxnameEqualTo(String value) {
            addCriterion("taxname =", value, "taxname");
            return (Criteria) this;
        }

        public Criteria andTaxnameNotEqualTo(String value) {
            addCriterion("taxname <>", value, "taxname");
            return (Criteria) this;
        }

        public Criteria andTaxnameGreaterThan(String value) {
            addCriterion("taxname >", value, "taxname");
            return (Criteria) this;
        }

        public Criteria andTaxnameGreaterThanOrEqualTo(String value) {
            addCriterion("taxname >=", value, "taxname");
            return (Criteria) this;
        }

        public Criteria andTaxnameLessThan(String value) {
            addCriterion("taxname <", value, "taxname");
            return (Criteria) this;
        }

        public Criteria andTaxnameLessThanOrEqualTo(String value) {
            addCriterion("taxname <=", value, "taxname");
            return (Criteria) this;
        }

        public Criteria andTaxnameLike(String value) {
            addCriterion("taxname like", value, "taxname");
            return (Criteria) this;
        }

        public Criteria andTaxnameNotLike(String value) {
            addCriterion("taxname not like", value, "taxname");
            return (Criteria) this;
        }

        public Criteria andTaxnameIn(List<String> values) {
            addCriterion("taxname in", values, "taxname");
            return (Criteria) this;
        }

        public Criteria andTaxnameNotIn(List<String> values) {
            addCriterion("taxname not in", values, "taxname");
            return (Criteria) this;
        }

        public Criteria andTaxnameBetween(String value1, String value2) {
            addCriterion("taxname between", value1, value2, "taxname");
            return (Criteria) this;
        }

        public Criteria andTaxnameNotBetween(String value1, String value2) {
            addCriterion("taxname not between", value1, value2, "taxname");
            return (Criteria) this;
        }

        public Criteria andTaxno1IsNull() {
            addCriterion("taxno1 is null");
            return (Criteria) this;
        }

        public Criteria andTaxno1IsNotNull() {
            addCriterion("taxno1 is not null");
            return (Criteria) this;
        }

        public Criteria andTaxno1EqualTo(String value) {
            addCriterion("taxno1 =", value, "taxno1");
            return (Criteria) this;
        }

        public Criteria andTaxno1NotEqualTo(String value) {
            addCriterion("taxno1 <>", value, "taxno1");
            return (Criteria) this;
        }

        public Criteria andTaxno1GreaterThan(String value) {
            addCriterion("taxno1 >", value, "taxno1");
            return (Criteria) this;
        }

        public Criteria andTaxno1GreaterThanOrEqualTo(String value) {
            addCriterion("taxno1 >=", value, "taxno1");
            return (Criteria) this;
        }

        public Criteria andTaxno1LessThan(String value) {
            addCriterion("taxno1 <", value, "taxno1");
            return (Criteria) this;
        }

        public Criteria andTaxno1LessThanOrEqualTo(String value) {
            addCriterion("taxno1 <=", value, "taxno1");
            return (Criteria) this;
        }

        public Criteria andTaxno1Like(String value) {
            addCriterion("taxno1 like", value, "taxno1");
            return (Criteria) this;
        }

        public Criteria andTaxno1NotLike(String value) {
            addCriterion("taxno1 not like", value, "taxno1");
            return (Criteria) this;
        }

        public Criteria andTaxno1In(List<String> values) {
            addCriterion("taxno1 in", values, "taxno1");
            return (Criteria) this;
        }

        public Criteria andTaxno1NotIn(List<String> values) {
            addCriterion("taxno1 not in", values, "taxno1");
            return (Criteria) this;
        }

        public Criteria andTaxno1Between(String value1, String value2) {
            addCriterion("taxno1 between", value1, value2, "taxno1");
            return (Criteria) this;
        }

        public Criteria andTaxno1NotBetween(String value1, String value2) {
            addCriterion("taxno1 not between", value1, value2, "taxno1");
            return (Criteria) this;
        }

        public Criteria andTaxname1IsNull() {
            addCriterion("taxname1 is null");
            return (Criteria) this;
        }

        public Criteria andTaxname1IsNotNull() {
            addCriterion("taxname1 is not null");
            return (Criteria) this;
        }

        public Criteria andTaxname1EqualTo(String value) {
            addCriterion("taxname1 =", value, "taxname1");
            return (Criteria) this;
        }

        public Criteria andTaxname1NotEqualTo(String value) {
            addCriterion("taxname1 <>", value, "taxname1");
            return (Criteria) this;
        }

        public Criteria andTaxname1GreaterThan(String value) {
            addCriterion("taxname1 >", value, "taxname1");
            return (Criteria) this;
        }

        public Criteria andTaxname1GreaterThanOrEqualTo(String value) {
            addCriterion("taxname1 >=", value, "taxname1");
            return (Criteria) this;
        }

        public Criteria andTaxname1LessThan(String value) {
            addCriterion("taxname1 <", value, "taxname1");
            return (Criteria) this;
        }

        public Criteria andTaxname1LessThanOrEqualTo(String value) {
            addCriterion("taxname1 <=", value, "taxname1");
            return (Criteria) this;
        }

        public Criteria andTaxname1Like(String value) {
            addCriterion("taxname1 like", value, "taxname1");
            return (Criteria) this;
        }

        public Criteria andTaxname1NotLike(String value) {
            addCriterion("taxname1 not like", value, "taxname1");
            return (Criteria) this;
        }

        public Criteria andTaxname1In(List<String> values) {
            addCriterion("taxname1 in", values, "taxname1");
            return (Criteria) this;
        }

        public Criteria andTaxname1NotIn(List<String> values) {
            addCriterion("taxname1 not in", values, "taxname1");
            return (Criteria) this;
        }

        public Criteria andTaxname1Between(String value1, String value2) {
            addCriterion("taxname1 between", value1, value2, "taxname1");
            return (Criteria) this;
        }

        public Criteria andTaxname1NotBetween(String value1, String value2) {
            addCriterion("taxname1 not between", value1, value2, "taxname1");
            return (Criteria) this;
        }

        public Criteria andTaxno2IsNull() {
            addCriterion("taxno2 is null");
            return (Criteria) this;
        }

        public Criteria andTaxno2IsNotNull() {
            addCriterion("taxno2 is not null");
            return (Criteria) this;
        }

        public Criteria andTaxno2EqualTo(String value) {
            addCriterion("taxno2 =", value, "taxno2");
            return (Criteria) this;
        }

        public Criteria andTaxno2NotEqualTo(String value) {
            addCriterion("taxno2 <>", value, "taxno2");
            return (Criteria) this;
        }

        public Criteria andTaxno2GreaterThan(String value) {
            addCriterion("taxno2 >", value, "taxno2");
            return (Criteria) this;
        }

        public Criteria andTaxno2GreaterThanOrEqualTo(String value) {
            addCriterion("taxno2 >=", value, "taxno2");
            return (Criteria) this;
        }

        public Criteria andTaxno2LessThan(String value) {
            addCriterion("taxno2 <", value, "taxno2");
            return (Criteria) this;
        }

        public Criteria andTaxno2LessThanOrEqualTo(String value) {
            addCriterion("taxno2 <=", value, "taxno2");
            return (Criteria) this;
        }

        public Criteria andTaxno2Like(String value) {
            addCriterion("taxno2 like", value, "taxno2");
            return (Criteria) this;
        }

        public Criteria andTaxno2NotLike(String value) {
            addCriterion("taxno2 not like", value, "taxno2");
            return (Criteria) this;
        }

        public Criteria andTaxno2In(List<String> values) {
            addCriterion("taxno2 in", values, "taxno2");
            return (Criteria) this;
        }

        public Criteria andTaxno2NotIn(List<String> values) {
            addCriterion("taxno2 not in", values, "taxno2");
            return (Criteria) this;
        }

        public Criteria andTaxno2Between(String value1, String value2) {
            addCriterion("taxno2 between", value1, value2, "taxno2");
            return (Criteria) this;
        }

        public Criteria andTaxno2NotBetween(String value1, String value2) {
            addCriterion("taxno2 not between", value1, value2, "taxno2");
            return (Criteria) this;
        }

        public Criteria andTaxname2IsNull() {
            addCriterion("taxname2 is null");
            return (Criteria) this;
        }

        public Criteria andTaxname2IsNotNull() {
            addCriterion("taxname2 is not null");
            return (Criteria) this;
        }

        public Criteria andTaxname2EqualTo(String value) {
            addCriterion("taxname2 =", value, "taxname2");
            return (Criteria) this;
        }

        public Criteria andTaxname2NotEqualTo(String value) {
            addCriterion("taxname2 <>", value, "taxname2");
            return (Criteria) this;
        }

        public Criteria andTaxname2GreaterThan(String value) {
            addCriterion("taxname2 >", value, "taxname2");
            return (Criteria) this;
        }

        public Criteria andTaxname2GreaterThanOrEqualTo(String value) {
            addCriterion("taxname2 >=", value, "taxname2");
            return (Criteria) this;
        }

        public Criteria andTaxname2LessThan(String value) {
            addCriterion("taxname2 <", value, "taxname2");
            return (Criteria) this;
        }

        public Criteria andTaxname2LessThanOrEqualTo(String value) {
            addCriterion("taxname2 <=", value, "taxname2");
            return (Criteria) this;
        }

        public Criteria andTaxname2Like(String value) {
            addCriterion("taxname2 like", value, "taxname2");
            return (Criteria) this;
        }

        public Criteria andTaxname2NotLike(String value) {
            addCriterion("taxname2 not like", value, "taxname2");
            return (Criteria) this;
        }

        public Criteria andTaxname2In(List<String> values) {
            addCriterion("taxname2 in", values, "taxname2");
            return (Criteria) this;
        }

        public Criteria andTaxname2NotIn(List<String> values) {
            addCriterion("taxname2 not in", values, "taxname2");
            return (Criteria) this;
        }

        public Criteria andTaxname2Between(String value1, String value2) {
            addCriterion("taxname2 between", value1, value2, "taxname2");
            return (Criteria) this;
        }

        public Criteria andTaxname2NotBetween(String value1, String value2) {
            addCriterion("taxname2 not between", value1, value2, "taxname2");
            return (Criteria) this;
        }

        public Criteria andTaxno3IsNull() {
            addCriterion("taxno3 is null");
            return (Criteria) this;
        }

        public Criteria andTaxno3IsNotNull() {
            addCriterion("taxno3 is not null");
            return (Criteria) this;
        }

        public Criteria andTaxno3EqualTo(String value) {
            addCriterion("taxno3 =", value, "taxno3");
            return (Criteria) this;
        }

        public Criteria andTaxno3NotEqualTo(String value) {
            addCriterion("taxno3 <>", value, "taxno3");
            return (Criteria) this;
        }

        public Criteria andTaxno3GreaterThan(String value) {
            addCriterion("taxno3 >", value, "taxno3");
            return (Criteria) this;
        }

        public Criteria andTaxno3GreaterThanOrEqualTo(String value) {
            addCriterion("taxno3 >=", value, "taxno3");
            return (Criteria) this;
        }

        public Criteria andTaxno3LessThan(String value) {
            addCriterion("taxno3 <", value, "taxno3");
            return (Criteria) this;
        }

        public Criteria andTaxno3LessThanOrEqualTo(String value) {
            addCriterion("taxno3 <=", value, "taxno3");
            return (Criteria) this;
        }

        public Criteria andTaxno3Like(String value) {
            addCriterion("taxno3 like", value, "taxno3");
            return (Criteria) this;
        }

        public Criteria andTaxno3NotLike(String value) {
            addCriterion("taxno3 not like", value, "taxno3");
            return (Criteria) this;
        }

        public Criteria andTaxno3In(List<String> values) {
            addCriterion("taxno3 in", values, "taxno3");
            return (Criteria) this;
        }

        public Criteria andTaxno3NotIn(List<String> values) {
            addCriterion("taxno3 not in", values, "taxno3");
            return (Criteria) this;
        }

        public Criteria andTaxno3Between(String value1, String value2) {
            addCriterion("taxno3 between", value1, value2, "taxno3");
            return (Criteria) this;
        }

        public Criteria andTaxno3NotBetween(String value1, String value2) {
            addCriterion("taxno3 not between", value1, value2, "taxno3");
            return (Criteria) this;
        }

        public Criteria andTaxname3IsNull() {
            addCriterion("taxname3 is null");
            return (Criteria) this;
        }

        public Criteria andTaxname3IsNotNull() {
            addCriterion("taxname3 is not null");
            return (Criteria) this;
        }

        public Criteria andTaxname3EqualTo(String value) {
            addCriterion("taxname3 =", value, "taxname3");
            return (Criteria) this;
        }

        public Criteria andTaxname3NotEqualTo(String value) {
            addCriterion("taxname3 <>", value, "taxname3");
            return (Criteria) this;
        }

        public Criteria andTaxname3GreaterThan(String value) {
            addCriterion("taxname3 >", value, "taxname3");
            return (Criteria) this;
        }

        public Criteria andTaxname3GreaterThanOrEqualTo(String value) {
            addCriterion("taxname3 >=", value, "taxname3");
            return (Criteria) this;
        }

        public Criteria andTaxname3LessThan(String value) {
            addCriterion("taxname3 <", value, "taxname3");
            return (Criteria) this;
        }

        public Criteria andTaxname3LessThanOrEqualTo(String value) {
            addCriterion("taxname3 <=", value, "taxname3");
            return (Criteria) this;
        }

        public Criteria andTaxname3Like(String value) {
            addCriterion("taxname3 like", value, "taxname3");
            return (Criteria) this;
        }

        public Criteria andTaxname3NotLike(String value) {
            addCriterion("taxname3 not like", value, "taxname3");
            return (Criteria) this;
        }

        public Criteria andTaxname3In(List<String> values) {
            addCriterion("taxname3 in", values, "taxname3");
            return (Criteria) this;
        }

        public Criteria andTaxname3NotIn(List<String> values) {
            addCriterion("taxname3 not in", values, "taxname3");
            return (Criteria) this;
        }

        public Criteria andTaxname3Between(String value1, String value2) {
            addCriterion("taxname3 between", value1, value2, "taxname3");
            return (Criteria) this;
        }

        public Criteria andTaxname3NotBetween(String value1, String value2) {
            addCriterion("taxname3 not between", value1, value2, "taxname3");
            return (Criteria) this;
        }

        public Criteria andTaxno4IsNull() {
            addCriterion("taxno4 is null");
            return (Criteria) this;
        }

        public Criteria andTaxno4IsNotNull() {
            addCriterion("taxno4 is not null");
            return (Criteria) this;
        }

        public Criteria andTaxno4EqualTo(String value) {
            addCriterion("taxno4 =", value, "taxno4");
            return (Criteria) this;
        }

        public Criteria andTaxno4NotEqualTo(String value) {
            addCriterion("taxno4 <>", value, "taxno4");
            return (Criteria) this;
        }

        public Criteria andTaxno4GreaterThan(String value) {
            addCriterion("taxno4 >", value, "taxno4");
            return (Criteria) this;
        }

        public Criteria andTaxno4GreaterThanOrEqualTo(String value) {
            addCriterion("taxno4 >=", value, "taxno4");
            return (Criteria) this;
        }

        public Criteria andTaxno4LessThan(String value) {
            addCriterion("taxno4 <", value, "taxno4");
            return (Criteria) this;
        }

        public Criteria andTaxno4LessThanOrEqualTo(String value) {
            addCriterion("taxno4 <=", value, "taxno4");
            return (Criteria) this;
        }

        public Criteria andTaxno4Like(String value) {
            addCriterion("taxno4 like", value, "taxno4");
            return (Criteria) this;
        }

        public Criteria andTaxno4NotLike(String value) {
            addCriterion("taxno4 not like", value, "taxno4");
            return (Criteria) this;
        }

        public Criteria andTaxno4In(List<String> values) {
            addCriterion("taxno4 in", values, "taxno4");
            return (Criteria) this;
        }

        public Criteria andTaxno4NotIn(List<String> values) {
            addCriterion("taxno4 not in", values, "taxno4");
            return (Criteria) this;
        }

        public Criteria andTaxno4Between(String value1, String value2) {
            addCriterion("taxno4 between", value1, value2, "taxno4");
            return (Criteria) this;
        }

        public Criteria andTaxno4NotBetween(String value1, String value2) {
            addCriterion("taxno4 not between", value1, value2, "taxno4");
            return (Criteria) this;
        }

        public Criteria andTaxname4IsNull() {
            addCriterion("taxname4 is null");
            return (Criteria) this;
        }

        public Criteria andTaxname4IsNotNull() {
            addCriterion("taxname4 is not null");
            return (Criteria) this;
        }

        public Criteria andTaxname4EqualTo(String value) {
            addCriterion("taxname4 =", value, "taxname4");
            return (Criteria) this;
        }

        public Criteria andTaxname4NotEqualTo(String value) {
            addCriterion("taxname4 <>", value, "taxname4");
            return (Criteria) this;
        }

        public Criteria andTaxname4GreaterThan(String value) {
            addCriterion("taxname4 >", value, "taxname4");
            return (Criteria) this;
        }

        public Criteria andTaxname4GreaterThanOrEqualTo(String value) {
            addCriterion("taxname4 >=", value, "taxname4");
            return (Criteria) this;
        }

        public Criteria andTaxname4LessThan(String value) {
            addCriterion("taxname4 <", value, "taxname4");
            return (Criteria) this;
        }

        public Criteria andTaxname4LessThanOrEqualTo(String value) {
            addCriterion("taxname4 <=", value, "taxname4");
            return (Criteria) this;
        }

        public Criteria andTaxname4Like(String value) {
            addCriterion("taxname4 like", value, "taxname4");
            return (Criteria) this;
        }

        public Criteria andTaxname4NotLike(String value) {
            addCriterion("taxname4 not like", value, "taxname4");
            return (Criteria) this;
        }

        public Criteria andTaxname4In(List<String> values) {
            addCriterion("taxname4 in", values, "taxname4");
            return (Criteria) this;
        }

        public Criteria andTaxname4NotIn(List<String> values) {
            addCriterion("taxname4 not in", values, "taxname4");
            return (Criteria) this;
        }

        public Criteria andTaxname4Between(String value1, String value2) {
            addCriterion("taxname4 between", value1, value2, "taxname4");
            return (Criteria) this;
        }

        public Criteria andTaxname4NotBetween(String value1, String value2) {
            addCriterion("taxname4 not between", value1, value2, "taxname4");
            return (Criteria) this;
        }

        public Criteria andContracter1IsNull() {
            addCriterion("contracter1 is null");
            return (Criteria) this;
        }

        public Criteria andContracter1IsNotNull() {
            addCriterion("contracter1 is not null");
            return (Criteria) this;
        }

        public Criteria andContracter1EqualTo(String value) {
            addCriterion("contracter1 =", value, "contracter1");
            return (Criteria) this;
        }

        public Criteria andContracter1NotEqualTo(String value) {
            addCriterion("contracter1 <>", value, "contracter1");
            return (Criteria) this;
        }

        public Criteria andContracter1GreaterThan(String value) {
            addCriterion("contracter1 >", value, "contracter1");
            return (Criteria) this;
        }

        public Criteria andContracter1GreaterThanOrEqualTo(String value) {
            addCriterion("contracter1 >=", value, "contracter1");
            return (Criteria) this;
        }

        public Criteria andContracter1LessThan(String value) {
            addCriterion("contracter1 <", value, "contracter1");
            return (Criteria) this;
        }

        public Criteria andContracter1LessThanOrEqualTo(String value) {
            addCriterion("contracter1 <=", value, "contracter1");
            return (Criteria) this;
        }

        public Criteria andContracter1Like(String value) {
            addCriterion("contracter1 like", value, "contracter1");
            return (Criteria) this;
        }

        public Criteria andContracter1NotLike(String value) {
            addCriterion("contracter1 not like", value, "contracter1");
            return (Criteria) this;
        }

        public Criteria andContracter1In(List<String> values) {
            addCriterion("contracter1 in", values, "contracter1");
            return (Criteria) this;
        }

        public Criteria andContracter1NotIn(List<String> values) {
            addCriterion("contracter1 not in", values, "contracter1");
            return (Criteria) this;
        }

        public Criteria andContracter1Between(String value1, String value2) {
            addCriterion("contracter1 between", value1, value2, "contracter1");
            return (Criteria) this;
        }

        public Criteria andContracter1NotBetween(String value1, String value2) {
            addCriterion("contracter1 not between", value1, value2, "contracter1");
            return (Criteria) this;
        }

        public Criteria andTel1IsNull() {
            addCriterion("tel1 is null");
            return (Criteria) this;
        }

        public Criteria andTel1IsNotNull() {
            addCriterion("tel1 is not null");
            return (Criteria) this;
        }

        public Criteria andTel1EqualTo(String value) {
            addCriterion("tel1 =", value, "tel1");
            return (Criteria) this;
        }

        public Criteria andTel1NotEqualTo(String value) {
            addCriterion("tel1 <>", value, "tel1");
            return (Criteria) this;
        }

        public Criteria andTel1GreaterThan(String value) {
            addCriterion("tel1 >", value, "tel1");
            return (Criteria) this;
        }

        public Criteria andTel1GreaterThanOrEqualTo(String value) {
            addCriterion("tel1 >=", value, "tel1");
            return (Criteria) this;
        }

        public Criteria andTel1LessThan(String value) {
            addCriterion("tel1 <", value, "tel1");
            return (Criteria) this;
        }

        public Criteria andTel1LessThanOrEqualTo(String value) {
            addCriterion("tel1 <=", value, "tel1");
            return (Criteria) this;
        }

        public Criteria andTel1Like(String value) {
            addCriterion("tel1 like", value, "tel1");
            return (Criteria) this;
        }

        public Criteria andTel1NotLike(String value) {
            addCriterion("tel1 not like", value, "tel1");
            return (Criteria) this;
        }

        public Criteria andTel1In(List<String> values) {
            addCriterion("tel1 in", values, "tel1");
            return (Criteria) this;
        }

        public Criteria andTel1NotIn(List<String> values) {
            addCriterion("tel1 not in", values, "tel1");
            return (Criteria) this;
        }

        public Criteria andTel1Between(String value1, String value2) {
            addCriterion("tel1 between", value1, value2, "tel1");
            return (Criteria) this;
        }

        public Criteria andTel1NotBetween(String value1, String value2) {
            addCriterion("tel1 not between", value1, value2, "tel1");
            return (Criteria) this;
        }

        public Criteria andContracter2IsNull() {
            addCriterion("contracter2 is null");
            return (Criteria) this;
        }

        public Criteria andContracter2IsNotNull() {
            addCriterion("contracter2 is not null");
            return (Criteria) this;
        }

        public Criteria andContracter2EqualTo(String value) {
            addCriterion("contracter2 =", value, "contracter2");
            return (Criteria) this;
        }

        public Criteria andContracter2NotEqualTo(String value) {
            addCriterion("contracter2 <>", value, "contracter2");
            return (Criteria) this;
        }

        public Criteria andContracter2GreaterThan(String value) {
            addCriterion("contracter2 >", value, "contracter2");
            return (Criteria) this;
        }

        public Criteria andContracter2GreaterThanOrEqualTo(String value) {
            addCriterion("contracter2 >=", value, "contracter2");
            return (Criteria) this;
        }

        public Criteria andContracter2LessThan(String value) {
            addCriterion("contracter2 <", value, "contracter2");
            return (Criteria) this;
        }

        public Criteria andContracter2LessThanOrEqualTo(String value) {
            addCriterion("contracter2 <=", value, "contracter2");
            return (Criteria) this;
        }

        public Criteria andContracter2Like(String value) {
            addCriterion("contracter2 like", value, "contracter2");
            return (Criteria) this;
        }

        public Criteria andContracter2NotLike(String value) {
            addCriterion("contracter2 not like", value, "contracter2");
            return (Criteria) this;
        }

        public Criteria andContracter2In(List<String> values) {
            addCriterion("contracter2 in", values, "contracter2");
            return (Criteria) this;
        }

        public Criteria andContracter2NotIn(List<String> values) {
            addCriterion("contracter2 not in", values, "contracter2");
            return (Criteria) this;
        }

        public Criteria andContracter2Between(String value1, String value2) {
            addCriterion("contracter2 between", value1, value2, "contracter2");
            return (Criteria) this;
        }

        public Criteria andContracter2NotBetween(String value1, String value2) {
            addCriterion("contracter2 not between", value1, value2, "contracter2");
            return (Criteria) this;
        }

        public Criteria andTel2IsNull() {
            addCriterion("tel2 is null");
            return (Criteria) this;
        }

        public Criteria andTel2IsNotNull() {
            addCriterion("tel2 is not null");
            return (Criteria) this;
        }

        public Criteria andTel2EqualTo(String value) {
            addCriterion("tel2 =", value, "tel2");
            return (Criteria) this;
        }

        public Criteria andTel2NotEqualTo(String value) {
            addCriterion("tel2 <>", value, "tel2");
            return (Criteria) this;
        }

        public Criteria andTel2GreaterThan(String value) {
            addCriterion("tel2 >", value, "tel2");
            return (Criteria) this;
        }

        public Criteria andTel2GreaterThanOrEqualTo(String value) {
            addCriterion("tel2 >=", value, "tel2");
            return (Criteria) this;
        }

        public Criteria andTel2LessThan(String value) {
            addCriterion("tel2 <", value, "tel2");
            return (Criteria) this;
        }

        public Criteria andTel2LessThanOrEqualTo(String value) {
            addCriterion("tel2 <=", value, "tel2");
            return (Criteria) this;
        }

        public Criteria andTel2Like(String value) {
            addCriterion("tel2 like", value, "tel2");
            return (Criteria) this;
        }

        public Criteria andTel2NotLike(String value) {
            addCriterion("tel2 not like", value, "tel2");
            return (Criteria) this;
        }

        public Criteria andTel2In(List<String> values) {
            addCriterion("tel2 in", values, "tel2");
            return (Criteria) this;
        }

        public Criteria andTel2NotIn(List<String> values) {
            addCriterion("tel2 not in", values, "tel2");
            return (Criteria) this;
        }

        public Criteria andTel2Between(String value1, String value2) {
            addCriterion("tel2 between", value1, value2, "tel2");
            return (Criteria) this;
        }

        public Criteria andTel2NotBetween(String value1, String value2) {
            addCriterion("tel2 not between", value1, value2, "tel2");
            return (Criteria) this;
        }

        public Criteria andContracter3IsNull() {
            addCriterion("contracter3 is null");
            return (Criteria) this;
        }

        public Criteria andContracter3IsNotNull() {
            addCriterion("contracter3 is not null");
            return (Criteria) this;
        }

        public Criteria andContracter3EqualTo(String value) {
            addCriterion("contracter3 =", value, "contracter3");
            return (Criteria) this;
        }

        public Criteria andContracter3NotEqualTo(String value) {
            addCriterion("contracter3 <>", value, "contracter3");
            return (Criteria) this;
        }

        public Criteria andContracter3GreaterThan(String value) {
            addCriterion("contracter3 >", value, "contracter3");
            return (Criteria) this;
        }

        public Criteria andContracter3GreaterThanOrEqualTo(String value) {
            addCriterion("contracter3 >=", value, "contracter3");
            return (Criteria) this;
        }

        public Criteria andContracter3LessThan(String value) {
            addCriterion("contracter3 <", value, "contracter3");
            return (Criteria) this;
        }

        public Criteria andContracter3LessThanOrEqualTo(String value) {
            addCriterion("contracter3 <=", value, "contracter3");
            return (Criteria) this;
        }

        public Criteria andContracter3Like(String value) {
            addCriterion("contracter3 like", value, "contracter3");
            return (Criteria) this;
        }

        public Criteria andContracter3NotLike(String value) {
            addCriterion("contracter3 not like", value, "contracter3");
            return (Criteria) this;
        }

        public Criteria andContracter3In(List<String> values) {
            addCriterion("contracter3 in", values, "contracter3");
            return (Criteria) this;
        }

        public Criteria andContracter3NotIn(List<String> values) {
            addCriterion("contracter3 not in", values, "contracter3");
            return (Criteria) this;
        }

        public Criteria andContracter3Between(String value1, String value2) {
            addCriterion("contracter3 between", value1, value2, "contracter3");
            return (Criteria) this;
        }

        public Criteria andContracter3NotBetween(String value1, String value2) {
            addCriterion("contracter3 not between", value1, value2, "contracter3");
            return (Criteria) this;
        }

        public Criteria andTel3IsNull() {
            addCriterion("tel3 is null");
            return (Criteria) this;
        }

        public Criteria andTel3IsNotNull() {
            addCriterion("tel3 is not null");
            return (Criteria) this;
        }

        public Criteria andTel3EqualTo(String value) {
            addCriterion("tel3 =", value, "tel3");
            return (Criteria) this;
        }

        public Criteria andTel3NotEqualTo(String value) {
            addCriterion("tel3 <>", value, "tel3");
            return (Criteria) this;
        }

        public Criteria andTel3GreaterThan(String value) {
            addCriterion("tel3 >", value, "tel3");
            return (Criteria) this;
        }

        public Criteria andTel3GreaterThanOrEqualTo(String value) {
            addCriterion("tel3 >=", value, "tel3");
            return (Criteria) this;
        }

        public Criteria andTel3LessThan(String value) {
            addCriterion("tel3 <", value, "tel3");
            return (Criteria) this;
        }

        public Criteria andTel3LessThanOrEqualTo(String value) {
            addCriterion("tel3 <=", value, "tel3");
            return (Criteria) this;
        }

        public Criteria andTel3Like(String value) {
            addCriterion("tel3 like", value, "tel3");
            return (Criteria) this;
        }

        public Criteria andTel3NotLike(String value) {
            addCriterion("tel3 not like", value, "tel3");
            return (Criteria) this;
        }

        public Criteria andTel3In(List<String> values) {
            addCriterion("tel3 in", values, "tel3");
            return (Criteria) this;
        }

        public Criteria andTel3NotIn(List<String> values) {
            addCriterion("tel3 not in", values, "tel3");
            return (Criteria) this;
        }

        public Criteria andTel3Between(String value1, String value2) {
            addCriterion("tel3 between", value1, value2, "tel3");
            return (Criteria) this;
        }

        public Criteria andTel3NotBetween(String value1, String value2) {
            addCriterion("tel3 not between", value1, value2, "tel3");
            return (Criteria) this;
        }

        public Criteria andContracter4IsNull() {
            addCriterion("contracter4 is null");
            return (Criteria) this;
        }

        public Criteria andContracter4IsNotNull() {
            addCriterion("contracter4 is not null");
            return (Criteria) this;
        }

        public Criteria andContracter4EqualTo(String value) {
            addCriterion("contracter4 =", value, "contracter4");
            return (Criteria) this;
        }

        public Criteria andContracter4NotEqualTo(String value) {
            addCriterion("contracter4 <>", value, "contracter4");
            return (Criteria) this;
        }

        public Criteria andContracter4GreaterThan(String value) {
            addCriterion("contracter4 >", value, "contracter4");
            return (Criteria) this;
        }

        public Criteria andContracter4GreaterThanOrEqualTo(String value) {
            addCriterion("contracter4 >=", value, "contracter4");
            return (Criteria) this;
        }

        public Criteria andContracter4LessThan(String value) {
            addCriterion("contracter4 <", value, "contracter4");
            return (Criteria) this;
        }

        public Criteria andContracter4LessThanOrEqualTo(String value) {
            addCriterion("contracter4 <=", value, "contracter4");
            return (Criteria) this;
        }

        public Criteria andContracter4Like(String value) {
            addCriterion("contracter4 like", value, "contracter4");
            return (Criteria) this;
        }

        public Criteria andContracter4NotLike(String value) {
            addCriterion("contracter4 not like", value, "contracter4");
            return (Criteria) this;
        }

        public Criteria andContracter4In(List<String> values) {
            addCriterion("contracter4 in", values, "contracter4");
            return (Criteria) this;
        }

        public Criteria andContracter4NotIn(List<String> values) {
            addCriterion("contracter4 not in", values, "contracter4");
            return (Criteria) this;
        }

        public Criteria andContracter4Between(String value1, String value2) {
            addCriterion("contracter4 between", value1, value2, "contracter4");
            return (Criteria) this;
        }

        public Criteria andContracter4NotBetween(String value1, String value2) {
            addCriterion("contracter4 not between", value1, value2, "contracter4");
            return (Criteria) this;
        }

        public Criteria andTel4IsNull() {
            addCriterion("tel4 is null");
            return (Criteria) this;
        }

        public Criteria andTel4IsNotNull() {
            addCriterion("tel4 is not null");
            return (Criteria) this;
        }

        public Criteria andTel4EqualTo(String value) {
            addCriterion("tel4 =", value, "tel4");
            return (Criteria) this;
        }

        public Criteria andTel4NotEqualTo(String value) {
            addCriterion("tel4 <>", value, "tel4");
            return (Criteria) this;
        }

        public Criteria andTel4GreaterThan(String value) {
            addCriterion("tel4 >", value, "tel4");
            return (Criteria) this;
        }

        public Criteria andTel4GreaterThanOrEqualTo(String value) {
            addCriterion("tel4 >=", value, "tel4");
            return (Criteria) this;
        }

        public Criteria andTel4LessThan(String value) {
            addCriterion("tel4 <", value, "tel4");
            return (Criteria) this;
        }

        public Criteria andTel4LessThanOrEqualTo(String value) {
            addCriterion("tel4 <=", value, "tel4");
            return (Criteria) this;
        }

        public Criteria andTel4Like(String value) {
            addCriterion("tel4 like", value, "tel4");
            return (Criteria) this;
        }

        public Criteria andTel4NotLike(String value) {
            addCriterion("tel4 not like", value, "tel4");
            return (Criteria) this;
        }

        public Criteria andTel4In(List<String> values) {
            addCriterion("tel4 in", values, "tel4");
            return (Criteria) this;
        }

        public Criteria andTel4NotIn(List<String> values) {
            addCriterion("tel4 not in", values, "tel4");
            return (Criteria) this;
        }

        public Criteria andTel4Between(String value1, String value2) {
            addCriterion("tel4 between", value1, value2, "tel4");
            return (Criteria) this;
        }

        public Criteria andTel4NotBetween(String value1, String value2) {
            addCriterion("tel4 not between", value1, value2, "tel4");
            return (Criteria) this;
        }

        public Criteria andContracter5IsNull() {
            addCriterion("contracter5 is null");
            return (Criteria) this;
        }

        public Criteria andContracter5IsNotNull() {
            addCriterion("contracter5 is not null");
            return (Criteria) this;
        }

        public Criteria andContracter5EqualTo(String value) {
            addCriterion("contracter5 =", value, "contracter5");
            return (Criteria) this;
        }

        public Criteria andContracter5NotEqualTo(String value) {
            addCriterion("contracter5 <>", value, "contracter5");
            return (Criteria) this;
        }

        public Criteria andContracter5GreaterThan(String value) {
            addCriterion("contracter5 >", value, "contracter5");
            return (Criteria) this;
        }

        public Criteria andContracter5GreaterThanOrEqualTo(String value) {
            addCriterion("contracter5 >=", value, "contracter5");
            return (Criteria) this;
        }

        public Criteria andContracter5LessThan(String value) {
            addCriterion("contracter5 <", value, "contracter5");
            return (Criteria) this;
        }

        public Criteria andContracter5LessThanOrEqualTo(String value) {
            addCriterion("contracter5 <=", value, "contracter5");
            return (Criteria) this;
        }

        public Criteria andContracter5Like(String value) {
            addCriterion("contracter5 like", value, "contracter5");
            return (Criteria) this;
        }

        public Criteria andContracter5NotLike(String value) {
            addCriterion("contracter5 not like", value, "contracter5");
            return (Criteria) this;
        }

        public Criteria andContracter5In(List<String> values) {
            addCriterion("contracter5 in", values, "contracter5");
            return (Criteria) this;
        }

        public Criteria andContracter5NotIn(List<String> values) {
            addCriterion("contracter5 not in", values, "contracter5");
            return (Criteria) this;
        }

        public Criteria andContracter5Between(String value1, String value2) {
            addCriterion("contracter5 between", value1, value2, "contracter5");
            return (Criteria) this;
        }

        public Criteria andContracter5NotBetween(String value1, String value2) {
            addCriterion("contracter5 not between", value1, value2, "contracter5");
            return (Criteria) this;
        }

        public Criteria andTel5IsNull() {
            addCriterion("tel5 is null");
            return (Criteria) this;
        }

        public Criteria andTel5IsNotNull() {
            addCriterion("tel5 is not null");
            return (Criteria) this;
        }

        public Criteria andTel5EqualTo(String value) {
            addCriterion("tel5 =", value, "tel5");
            return (Criteria) this;
        }

        public Criteria andTel5NotEqualTo(String value) {
            addCriterion("tel5 <>", value, "tel5");
            return (Criteria) this;
        }

        public Criteria andTel5GreaterThan(String value) {
            addCriterion("tel5 >", value, "tel5");
            return (Criteria) this;
        }

        public Criteria andTel5GreaterThanOrEqualTo(String value) {
            addCriterion("tel5 >=", value, "tel5");
            return (Criteria) this;
        }

        public Criteria andTel5LessThan(String value) {
            addCriterion("tel5 <", value, "tel5");
            return (Criteria) this;
        }

        public Criteria andTel5LessThanOrEqualTo(String value) {
            addCriterion("tel5 <=", value, "tel5");
            return (Criteria) this;
        }

        public Criteria andTel5Like(String value) {
            addCriterion("tel5 like", value, "tel5");
            return (Criteria) this;
        }

        public Criteria andTel5NotLike(String value) {
            addCriterion("tel5 not like", value, "tel5");
            return (Criteria) this;
        }

        public Criteria andTel5In(List<String> values) {
            addCriterion("tel5 in", values, "tel5");
            return (Criteria) this;
        }

        public Criteria andTel5NotIn(List<String> values) {
            addCriterion("tel5 not in", values, "tel5");
            return (Criteria) this;
        }

        public Criteria andTel5Between(String value1, String value2) {
            addCriterion("tel5 between", value1, value2, "tel5");
            return (Criteria) this;
        }

        public Criteria andTel5NotBetween(String value1, String value2) {
            addCriterion("tel5 not between", value1, value2, "tel5");
            return (Criteria) this;
        }

        public Criteria andBankIsNull() {
            addCriterion("bank is null");
            return (Criteria) this;
        }

        public Criteria andBankIsNotNull() {
            addCriterion("bank is not null");
            return (Criteria) this;
        }

        public Criteria andBankEqualTo(String value) {
            addCriterion("bank =", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotEqualTo(String value) {
            addCriterion("bank <>", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankGreaterThan(String value) {
            addCriterion("bank >", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankGreaterThanOrEqualTo(String value) {
            addCriterion("bank >=", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankLessThan(String value) {
            addCriterion("bank <", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankLessThanOrEqualTo(String value) {
            addCriterion("bank <=", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankLike(String value) {
            addCriterion("bank like", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotLike(String value) {
            addCriterion("bank not like", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankIn(List<String> values) {
            addCriterion("bank in", values, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotIn(List<String> values) {
            addCriterion("bank not in", values, "bank");
            return (Criteria) this;
        }

        public Criteria andBankBetween(String value1, String value2) {
            addCriterion("bank between", value1, value2, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotBetween(String value1, String value2) {
            addCriterion("bank not between", value1, value2, "bank");
            return (Criteria) this;
        }

        public Criteria andBankacountIsNull() {
            addCriterion("bankacount is null");
            return (Criteria) this;
        }

        public Criteria andBankacountIsNotNull() {
            addCriterion("bankacount is not null");
            return (Criteria) this;
        }

        public Criteria andBankacountEqualTo(String value) {
            addCriterion("bankacount =", value, "bankacount");
            return (Criteria) this;
        }

        public Criteria andBankacountNotEqualTo(String value) {
            addCriterion("bankacount <>", value, "bankacount");
            return (Criteria) this;
        }

        public Criteria andBankacountGreaterThan(String value) {
            addCriterion("bankacount >", value, "bankacount");
            return (Criteria) this;
        }

        public Criteria andBankacountGreaterThanOrEqualTo(String value) {
            addCriterion("bankacount >=", value, "bankacount");
            return (Criteria) this;
        }

        public Criteria andBankacountLessThan(String value) {
            addCriterion("bankacount <", value, "bankacount");
            return (Criteria) this;
        }

        public Criteria andBankacountLessThanOrEqualTo(String value) {
            addCriterion("bankacount <=", value, "bankacount");
            return (Criteria) this;
        }

        public Criteria andBankacountLike(String value) {
            addCriterion("bankacount like", value, "bankacount");
            return (Criteria) this;
        }

        public Criteria andBankacountNotLike(String value) {
            addCriterion("bankacount not like", value, "bankacount");
            return (Criteria) this;
        }

        public Criteria andBankacountIn(List<String> values) {
            addCriterion("bankacount in", values, "bankacount");
            return (Criteria) this;
        }

        public Criteria andBankacountNotIn(List<String> values) {
            addCriterion("bankacount not in", values, "bankacount");
            return (Criteria) this;
        }

        public Criteria andBankacountBetween(String value1, String value2) {
            addCriterion("bankacount between", value1, value2, "bankacount");
            return (Criteria) this;
        }

        public Criteria andBankacountNotBetween(String value1, String value2) {
            addCriterion("bankacount not between", value1, value2, "bankacount");
            return (Criteria) this;
        }

        public Criteria andIsflagIsNull() {
            addCriterion("isFlag is null");
            return (Criteria) this;
        }

        public Criteria andIsflagIsNotNull() {
            addCriterion("isFlag is not null");
            return (Criteria) this;
        }

        public Criteria andIsflagEqualTo(String value) {
            addCriterion("isFlag =", value, "isflag");
            return (Criteria) this;
        }

        public Criteria andIsflagNotEqualTo(String value) {
            addCriterion("isFlag <>", value, "isflag");
            return (Criteria) this;
        }

        public Criteria andIsflagGreaterThan(String value) {
            addCriterion("isFlag >", value, "isflag");
            return (Criteria) this;
        }

        public Criteria andIsflagGreaterThanOrEqualTo(String value) {
            addCriterion("isFlag >=", value, "isflag");
            return (Criteria) this;
        }

        public Criteria andIsflagLessThan(String value) {
            addCriterion("isFlag <", value, "isflag");
            return (Criteria) this;
        }

        public Criteria andIsflagLessThanOrEqualTo(String value) {
            addCriterion("isFlag <=", value, "isflag");
            return (Criteria) this;
        }

        public Criteria andIsflagLike(String value) {
            addCriterion("isFlag like", value, "isflag");
            return (Criteria) this;
        }

        public Criteria andIsflagNotLike(String value) {
            addCriterion("isFlag not like", value, "isflag");
            return (Criteria) this;
        }

        public Criteria andIsflagIn(List<String> values) {
            addCriterion("isFlag in", values, "isflag");
            return (Criteria) this;
        }

        public Criteria andIsflagNotIn(List<String> values) {
            addCriterion("isFlag not in", values, "isflag");
            return (Criteria) this;
        }

        public Criteria andIsflagBetween(String value1, String value2) {
            addCriterion("isFlag between", value1, value2, "isflag");
            return (Criteria) this;
        }

        public Criteria andIsflagNotBetween(String value1, String value2) {
            addCriterion("isFlag not between", value1, value2, "isflag");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andOperdateIsNull() {
            addCriterion("operDate is null");
            return (Criteria) this;
        }

        public Criteria andOperdateIsNotNull() {
            addCriterion("operDate is not null");
            return (Criteria) this;
        }

        public Criteria andOperdateEqualTo(String value) {
            addCriterion("operDate =", value, "operdate");
            return (Criteria) this;
        }

        public Criteria andOperdateNotEqualTo(String value) {
            addCriterion("operDate <>", value, "operdate");
            return (Criteria) this;
        }

        public Criteria andOperdateGreaterThan(String value) {
            addCriterion("operDate >", value, "operdate");
            return (Criteria) this;
        }

        public Criteria andOperdateGreaterThanOrEqualTo(String value) {
            addCriterion("operDate >=", value, "operdate");
            return (Criteria) this;
        }

        public Criteria andOperdateLessThan(String value) {
            addCriterion("operDate <", value, "operdate");
            return (Criteria) this;
        }

        public Criteria andOperdateLessThanOrEqualTo(String value) {
            addCriterion("operDate <=", value, "operdate");
            return (Criteria) this;
        }

        public Criteria andOperdateLike(String value) {
            addCriterion("operDate like", value, "operdate");
            return (Criteria) this;
        }

        public Criteria andOperdateNotLike(String value) {
            addCriterion("operDate not like", value, "operdate");
            return (Criteria) this;
        }

        public Criteria andOperdateIn(List<String> values) {
            addCriterion("operDate in", values, "operdate");
            return (Criteria) this;
        }

        public Criteria andOperdateNotIn(List<String> values) {
            addCriterion("operDate not in", values, "operdate");
            return (Criteria) this;
        }

        public Criteria andOperdateBetween(String value1, String value2) {
            addCriterion("operDate between", value1, value2, "operdate");
            return (Criteria) this;
        }

        public Criteria andOperdateNotBetween(String value1, String value2) {
            addCriterion("operDate not between", value1, value2, "operdate");
            return (Criteria) this;
        }

        public Criteria andOperatercodeIsNull() {
            addCriterion("operaterCode is null");
            return (Criteria) this;
        }

        public Criteria andOperatercodeIsNotNull() {
            addCriterion("operaterCode is not null");
            return (Criteria) this;
        }

        public Criteria andOperatercodeEqualTo(String value) {
            addCriterion("operaterCode =", value, "operatercode");
            return (Criteria) this;
        }

        public Criteria andOperatercodeNotEqualTo(String value) {
            addCriterion("operaterCode <>", value, "operatercode");
            return (Criteria) this;
        }

        public Criteria andOperatercodeGreaterThan(String value) {
            addCriterion("operaterCode >", value, "operatercode");
            return (Criteria) this;
        }

        public Criteria andOperatercodeGreaterThanOrEqualTo(String value) {
            addCriterion("operaterCode >=", value, "operatercode");
            return (Criteria) this;
        }

        public Criteria andOperatercodeLessThan(String value) {
            addCriterion("operaterCode <", value, "operatercode");
            return (Criteria) this;
        }

        public Criteria andOperatercodeLessThanOrEqualTo(String value) {
            addCriterion("operaterCode <=", value, "operatercode");
            return (Criteria) this;
        }

        public Criteria andOperatercodeLike(String value) {
            addCriterion("operaterCode like", value, "operatercode");
            return (Criteria) this;
        }

        public Criteria andOperatercodeNotLike(String value) {
            addCriterion("operaterCode not like", value, "operatercode");
            return (Criteria) this;
        }

        public Criteria andOperatercodeIn(List<String> values) {
            addCriterion("operaterCode in", values, "operatercode");
            return (Criteria) this;
        }

        public Criteria andOperatercodeNotIn(List<String> values) {
            addCriterion("operaterCode not in", values, "operatercode");
            return (Criteria) this;
        }

        public Criteria andOperatercodeBetween(String value1, String value2) {
            addCriterion("operaterCode between", value1, value2, "operatercode");
            return (Criteria) this;
        }

        public Criteria andOperatercodeNotBetween(String value1, String value2) {
            addCriterion("operaterCode not between", value1, value2, "operatercode");
            return (Criteria) this;
        }

        public Criteria andOperaternameIsNull() {
            addCriterion("operaterName is null");
            return (Criteria) this;
        }

        public Criteria andOperaternameIsNotNull() {
            addCriterion("operaterName is not null");
            return (Criteria) this;
        }

        public Criteria andOperaternameEqualTo(String value) {
            addCriterion("operaterName =", value, "operatername");
            return (Criteria) this;
        }

        public Criteria andOperaternameNotEqualTo(String value) {
            addCriterion("operaterName <>", value, "operatername");
            return (Criteria) this;
        }

        public Criteria andOperaternameGreaterThan(String value) {
            addCriterion("operaterName >", value, "operatername");
            return (Criteria) this;
        }

        public Criteria andOperaternameGreaterThanOrEqualTo(String value) {
            addCriterion("operaterName >=", value, "operatername");
            return (Criteria) this;
        }

        public Criteria andOperaternameLessThan(String value) {
            addCriterion("operaterName <", value, "operatername");
            return (Criteria) this;
        }

        public Criteria andOperaternameLessThanOrEqualTo(String value) {
            addCriterion("operaterName <=", value, "operatername");
            return (Criteria) this;
        }

        public Criteria andOperaternameLike(String value) {
            addCriterion("operaterName like", value, "operatername");
            return (Criteria) this;
        }

        public Criteria andOperaternameNotLike(String value) {
            addCriterion("operaterName not like", value, "operatername");
            return (Criteria) this;
        }

        public Criteria andOperaternameIn(List<String> values) {
            addCriterion("operaterName in", values, "operatername");
            return (Criteria) this;
        }

        public Criteria andOperaternameNotIn(List<String> values) {
            addCriterion("operaterName not in", values, "operatername");
            return (Criteria) this;
        }

        public Criteria andOperaternameBetween(String value1, String value2) {
            addCriterion("operaterName between", value1, value2, "operatername");
            return (Criteria) this;
        }

        public Criteria andOperaternameNotBetween(String value1, String value2) {
            addCriterion("operaterName not between", value1, value2, "operatername");
            return (Criteria) this;
        }

        public Criteria andOpedepcodeIsNull() {
            addCriterion("opeDepCode is null");
            return (Criteria) this;
        }

        public Criteria andOpedepcodeIsNotNull() {
            addCriterion("opeDepCode is not null");
            return (Criteria) this;
        }

        public Criteria andOpedepcodeEqualTo(String value) {
            addCriterion("opeDepCode =", value, "opedepcode");
            return (Criteria) this;
        }

        public Criteria andOpedepcodeNotEqualTo(String value) {
            addCriterion("opeDepCode <>", value, "opedepcode");
            return (Criteria) this;
        }

        public Criteria andOpedepcodeGreaterThan(String value) {
            addCriterion("opeDepCode >", value, "opedepcode");
            return (Criteria) this;
        }

        public Criteria andOpedepcodeGreaterThanOrEqualTo(String value) {
            addCriterion("opeDepCode >=", value, "opedepcode");
            return (Criteria) this;
        }

        public Criteria andOpedepcodeLessThan(String value) {
            addCriterion("opeDepCode <", value, "opedepcode");
            return (Criteria) this;
        }

        public Criteria andOpedepcodeLessThanOrEqualTo(String value) {
            addCriterion("opeDepCode <=", value, "opedepcode");
            return (Criteria) this;
        }

        public Criteria andOpedepcodeLike(String value) {
            addCriterion("opeDepCode like", value, "opedepcode");
            return (Criteria) this;
        }

        public Criteria andOpedepcodeNotLike(String value) {
            addCriterion("opeDepCode not like", value, "opedepcode");
            return (Criteria) this;
        }

        public Criteria andOpedepcodeIn(List<String> values) {
            addCriterion("opeDepCode in", values, "opedepcode");
            return (Criteria) this;
        }

        public Criteria andOpedepcodeNotIn(List<String> values) {
            addCriterion("opeDepCode not in", values, "opedepcode");
            return (Criteria) this;
        }

        public Criteria andOpedepcodeBetween(String value1, String value2) {
            addCriterion("opeDepCode between", value1, value2, "opedepcode");
            return (Criteria) this;
        }

        public Criteria andOpedepcodeNotBetween(String value1, String value2) {
            addCriterion("opeDepCode not between", value1, value2, "opedepcode");
            return (Criteria) this;
        }

        public Criteria andOpedepnameIsNull() {
            addCriterion("opeDepName is null");
            return (Criteria) this;
        }

        public Criteria andOpedepnameIsNotNull() {
            addCriterion("opeDepName is not null");
            return (Criteria) this;
        }

        public Criteria andOpedepnameEqualTo(String value) {
            addCriterion("opeDepName =", value, "opedepname");
            return (Criteria) this;
        }

        public Criteria andOpedepnameNotEqualTo(String value) {
            addCriterion("opeDepName <>", value, "opedepname");
            return (Criteria) this;
        }

        public Criteria andOpedepnameGreaterThan(String value) {
            addCriterion("opeDepName >", value, "opedepname");
            return (Criteria) this;
        }

        public Criteria andOpedepnameGreaterThanOrEqualTo(String value) {
            addCriterion("opeDepName >=", value, "opedepname");
            return (Criteria) this;
        }

        public Criteria andOpedepnameLessThan(String value) {
            addCriterion("opeDepName <", value, "opedepname");
            return (Criteria) this;
        }

        public Criteria andOpedepnameLessThanOrEqualTo(String value) {
            addCriterion("opeDepName <=", value, "opedepname");
            return (Criteria) this;
        }

        public Criteria andOpedepnameLike(String value) {
            addCriterion("opeDepName like", value, "opedepname");
            return (Criteria) this;
        }

        public Criteria andOpedepnameNotLike(String value) {
            addCriterion("opeDepName not like", value, "opedepname");
            return (Criteria) this;
        }

        public Criteria andOpedepnameIn(List<String> values) {
            addCriterion("opeDepName in", values, "opedepname");
            return (Criteria) this;
        }

        public Criteria andOpedepnameNotIn(List<String> values) {
            addCriterion("opeDepName not in", values, "opedepname");
            return (Criteria) this;
        }

        public Criteria andOpedepnameBetween(String value1, String value2) {
            addCriterion("opeDepName between", value1, value2, "opedepname");
            return (Criteria) this;
        }

        public Criteria andOpedepnameNotBetween(String value1, String value2) {
            addCriterion("opeDepName not between", value1, value2, "opedepname");
            return (Criteria) this;
        }

        public Criteria andOpeschoolcodeIsNull() {
            addCriterion("opeSchoolCode is null");
            return (Criteria) this;
        }

        public Criteria andOpeschoolcodeIsNotNull() {
            addCriterion("opeSchoolCode is not null");
            return (Criteria) this;
        }

        public Criteria andOpeschoolcodeEqualTo(String value) {
            addCriterion("opeSchoolCode =", value, "opeschoolcode");
            return (Criteria) this;
        }

        public Criteria andOpeschoolcodeNotEqualTo(String value) {
            addCriterion("opeSchoolCode <>", value, "opeschoolcode");
            return (Criteria) this;
        }

        public Criteria andOpeschoolcodeGreaterThan(String value) {
            addCriterion("opeSchoolCode >", value, "opeschoolcode");
            return (Criteria) this;
        }

        public Criteria andOpeschoolcodeGreaterThanOrEqualTo(String value) {
            addCriterion("opeSchoolCode >=", value, "opeschoolcode");
            return (Criteria) this;
        }

        public Criteria andOpeschoolcodeLessThan(String value) {
            addCriterion("opeSchoolCode <", value, "opeschoolcode");
            return (Criteria) this;
        }

        public Criteria andOpeschoolcodeLessThanOrEqualTo(String value) {
            addCriterion("opeSchoolCode <=", value, "opeschoolcode");
            return (Criteria) this;
        }

        public Criteria andOpeschoolcodeLike(String value) {
            addCriterion("opeSchoolCode like", value, "opeschoolcode");
            return (Criteria) this;
        }

        public Criteria andOpeschoolcodeNotLike(String value) {
            addCriterion("opeSchoolCode not like", value, "opeschoolcode");
            return (Criteria) this;
        }

        public Criteria andOpeschoolcodeIn(List<String> values) {
            addCriterion("opeSchoolCode in", values, "opeschoolcode");
            return (Criteria) this;
        }

        public Criteria andOpeschoolcodeNotIn(List<String> values) {
            addCriterion("opeSchoolCode not in", values, "opeschoolcode");
            return (Criteria) this;
        }

        public Criteria andOpeschoolcodeBetween(String value1, String value2) {
            addCriterion("opeSchoolCode between", value1, value2, "opeschoolcode");
            return (Criteria) this;
        }

        public Criteria andOpeschoolcodeNotBetween(String value1, String value2) {
            addCriterion("opeSchoolCode not between", value1, value2, "opeschoolcode");
            return (Criteria) this;
        }

        public Criteria andOpeschoolnameIsNull() {
            addCriterion("opeSchoolName is null");
            return (Criteria) this;
        }

        public Criteria andOpeschoolnameIsNotNull() {
            addCriterion("opeSchoolName is not null");
            return (Criteria) this;
        }

        public Criteria andOpeschoolnameEqualTo(String value) {
            addCriterion("opeSchoolName =", value, "opeschoolname");
            return (Criteria) this;
        }

        public Criteria andOpeschoolnameNotEqualTo(String value) {
            addCriterion("opeSchoolName <>", value, "opeschoolname");
            return (Criteria) this;
        }

        public Criteria andOpeschoolnameGreaterThan(String value) {
            addCriterion("opeSchoolName >", value, "opeschoolname");
            return (Criteria) this;
        }

        public Criteria andOpeschoolnameGreaterThanOrEqualTo(String value) {
            addCriterion("opeSchoolName >=", value, "opeschoolname");
            return (Criteria) this;
        }

        public Criteria andOpeschoolnameLessThan(String value) {
            addCriterion("opeSchoolName <", value, "opeschoolname");
            return (Criteria) this;
        }

        public Criteria andOpeschoolnameLessThanOrEqualTo(String value) {
            addCriterion("opeSchoolName <=", value, "opeschoolname");
            return (Criteria) this;
        }

        public Criteria andOpeschoolnameLike(String value) {
            addCriterion("opeSchoolName like", value, "opeschoolname");
            return (Criteria) this;
        }

        public Criteria andOpeschoolnameNotLike(String value) {
            addCriterion("opeSchoolName not like", value, "opeschoolname");
            return (Criteria) this;
        }

        public Criteria andOpeschoolnameIn(List<String> values) {
            addCriterion("opeSchoolName in", values, "opeschoolname");
            return (Criteria) this;
        }

        public Criteria andOpeschoolnameNotIn(List<String> values) {
            addCriterion("opeSchoolName not in", values, "opeschoolname");
            return (Criteria) this;
        }

        public Criteria andOpeschoolnameBetween(String value1, String value2) {
            addCriterion("opeSchoolName between", value1, value2, "opeschoolname");
            return (Criteria) this;
        }

        public Criteria andOpeschoolnameNotBetween(String value1, String value2) {
            addCriterion("opeSchoolName not between", value1, value2, "opeschoolname");
            return (Criteria) this;
        }

        public Criteria andBelongschoolcodeIsNull() {
            addCriterion("belongSchoolCode is null");
            return (Criteria) this;
        }

        public Criteria andBelongschoolcodeIsNotNull() {
            addCriterion("belongSchoolCode is not null");
            return (Criteria) this;
        }

        public Criteria andBelongschoolcodeEqualTo(String value) {
            addCriterion("belongSchoolCode =", value, "belongschoolcode");
            return (Criteria) this;
        }

        public Criteria andBelongschoolcodeNotEqualTo(String value) {
            addCriterion("belongSchoolCode <>", value, "belongschoolcode");
            return (Criteria) this;
        }

        public Criteria andBelongschoolcodeGreaterThan(String value) {
            addCriterion("belongSchoolCode >", value, "belongschoolcode");
            return (Criteria) this;
        }

        public Criteria andBelongschoolcodeGreaterThanOrEqualTo(String value) {
            addCriterion("belongSchoolCode >=", value, "belongschoolcode");
            return (Criteria) this;
        }

        public Criteria andBelongschoolcodeLessThan(String value) {
            addCriterion("belongSchoolCode <", value, "belongschoolcode");
            return (Criteria) this;
        }

        public Criteria andBelongschoolcodeLessThanOrEqualTo(String value) {
            addCriterion("belongSchoolCode <=", value, "belongschoolcode");
            return (Criteria) this;
        }

        public Criteria andBelongschoolcodeLike(String value) {
            addCriterion("belongSchoolCode like", value, "belongschoolcode");
            return (Criteria) this;
        }

        public Criteria andBelongschoolcodeNotLike(String value) {
            addCriterion("belongSchoolCode not like", value, "belongschoolcode");
            return (Criteria) this;
        }

        public Criteria andBelongschoolcodeIn(List<String> values) {
            addCriterion("belongSchoolCode in", values, "belongschoolcode");
            return (Criteria) this;
        }

        public Criteria andBelongschoolcodeNotIn(List<String> values) {
            addCriterion("belongSchoolCode not in", values, "belongschoolcode");
            return (Criteria) this;
        }

        public Criteria andBelongschoolcodeBetween(String value1, String value2) {
            addCriterion("belongSchoolCode between", value1, value2, "belongschoolcode");
            return (Criteria) this;
        }

        public Criteria andBelongschoolcodeNotBetween(String value1, String value2) {
            addCriterion("belongSchoolCode not between", value1, value2, "belongschoolcode");
            return (Criteria) this;
        }

        public Criteria andBelongschoolnameIsNull() {
            addCriterion("belongSchoolName is null");
            return (Criteria) this;
        }

        public Criteria andBelongschoolnameIsNotNull() {
            addCriterion("belongSchoolName is not null");
            return (Criteria) this;
        }

        public Criteria andBelongschoolnameEqualTo(String value) {
            addCriterion("belongSchoolName =", value, "belongschoolname");
            return (Criteria) this;
        }

        public Criteria andBelongschoolnameNotEqualTo(String value) {
            addCriterion("belongSchoolName <>", value, "belongschoolname");
            return (Criteria) this;
        }

        public Criteria andBelongschoolnameGreaterThan(String value) {
            addCriterion("belongSchoolName >", value, "belongschoolname");
            return (Criteria) this;
        }

        public Criteria andBelongschoolnameGreaterThanOrEqualTo(String value) {
            addCriterion("belongSchoolName >=", value, "belongschoolname");
            return (Criteria) this;
        }

        public Criteria andBelongschoolnameLessThan(String value) {
            addCriterion("belongSchoolName <", value, "belongschoolname");
            return (Criteria) this;
        }

        public Criteria andBelongschoolnameLessThanOrEqualTo(String value) {
            addCriterion("belongSchoolName <=", value, "belongschoolname");
            return (Criteria) this;
        }

        public Criteria andBelongschoolnameLike(String value) {
            addCriterion("belongSchoolName like", value, "belongschoolname");
            return (Criteria) this;
        }

        public Criteria andBelongschoolnameNotLike(String value) {
            addCriterion("belongSchoolName not like", value, "belongschoolname");
            return (Criteria) this;
        }

        public Criteria andBelongschoolnameIn(List<String> values) {
            addCriterion("belongSchoolName in", values, "belongschoolname");
            return (Criteria) this;
        }

        public Criteria andBelongschoolnameNotIn(List<String> values) {
            addCriterion("belongSchoolName not in", values, "belongschoolname");
            return (Criteria) this;
        }

        public Criteria andBelongschoolnameBetween(String value1, String value2) {
            addCriterion("belongSchoolName between", value1, value2, "belongschoolname");
            return (Criteria) this;
        }

        public Criteria andBelongschoolnameNotBetween(String value1, String value2) {
            addCriterion("belongSchoolName not between", value1, value2, "belongschoolname");
            return (Criteria) this;
        }

        public Criteria andOperorgcodeIsNull() {
            addCriterion("operOrgCode is null");
            return (Criteria) this;
        }

        public Criteria andOperorgcodeIsNotNull() {
            addCriterion("operOrgCode is not null");
            return (Criteria) this;
        }

        public Criteria andOperorgcodeEqualTo(String value) {
            addCriterion("operOrgCode =", value, "operorgcode");
            return (Criteria) this;
        }

        public Criteria andOperorgcodeNotEqualTo(String value) {
            addCriterion("operOrgCode <>", value, "operorgcode");
            return (Criteria) this;
        }

        public Criteria andOperorgcodeGreaterThan(String value) {
            addCriterion("operOrgCode >", value, "operorgcode");
            return (Criteria) this;
        }

        public Criteria andOperorgcodeGreaterThanOrEqualTo(String value) {
            addCriterion("operOrgCode >=", value, "operorgcode");
            return (Criteria) this;
        }

        public Criteria andOperorgcodeLessThan(String value) {
            addCriterion("operOrgCode <", value, "operorgcode");
            return (Criteria) this;
        }

        public Criteria andOperorgcodeLessThanOrEqualTo(String value) {
            addCriterion("operOrgCode <=", value, "operorgcode");
            return (Criteria) this;
        }

        public Criteria andOperorgcodeLike(String value) {
            addCriterion("operOrgCode like", value, "operorgcode");
            return (Criteria) this;
        }

        public Criteria andOperorgcodeNotLike(String value) {
            addCriterion("operOrgCode not like", value, "operorgcode");
            return (Criteria) this;
        }

        public Criteria andOperorgcodeIn(List<String> values) {
            addCriterion("operOrgCode in", values, "operorgcode");
            return (Criteria) this;
        }

        public Criteria andOperorgcodeNotIn(List<String> values) {
            addCriterion("operOrgCode not in", values, "operorgcode");
            return (Criteria) this;
        }

        public Criteria andOperorgcodeBetween(String value1, String value2) {
            addCriterion("operOrgCode between", value1, value2, "operorgcode");
            return (Criteria) this;
        }

        public Criteria andOperorgcodeNotBetween(String value1, String value2) {
            addCriterion("operOrgCode not between", value1, value2, "operorgcode");
            return (Criteria) this;
        }

        public Criteria andOperorgnameIsNull() {
            addCriterion("operOrgName is null");
            return (Criteria) this;
        }

        public Criteria andOperorgnameIsNotNull() {
            addCriterion("operOrgName is not null");
            return (Criteria) this;
        }

        public Criteria andOperorgnameEqualTo(String value) {
            addCriterion("operOrgName =", value, "operorgname");
            return (Criteria) this;
        }

        public Criteria andOperorgnameNotEqualTo(String value) {
            addCriterion("operOrgName <>", value, "operorgname");
            return (Criteria) this;
        }

        public Criteria andOperorgnameGreaterThan(String value) {
            addCriterion("operOrgName >", value, "operorgname");
            return (Criteria) this;
        }

        public Criteria andOperorgnameGreaterThanOrEqualTo(String value) {
            addCriterion("operOrgName >=", value, "operorgname");
            return (Criteria) this;
        }

        public Criteria andOperorgnameLessThan(String value) {
            addCriterion("operOrgName <", value, "operorgname");
            return (Criteria) this;
        }

        public Criteria andOperorgnameLessThanOrEqualTo(String value) {
            addCriterion("operOrgName <=", value, "operorgname");
            return (Criteria) this;
        }

        public Criteria andOperorgnameLike(String value) {
            addCriterion("operOrgName like", value, "operorgname");
            return (Criteria) this;
        }

        public Criteria andOperorgnameNotLike(String value) {
            addCriterion("operOrgName not like", value, "operorgname");
            return (Criteria) this;
        }

        public Criteria andOperorgnameIn(List<String> values) {
            addCriterion("operOrgName in", values, "operorgname");
            return (Criteria) this;
        }

        public Criteria andOperorgnameNotIn(List<String> values) {
            addCriterion("operOrgName not in", values, "operorgname");
            return (Criteria) this;
        }

        public Criteria andOperorgnameBetween(String value1, String value2) {
            addCriterion("operOrgName between", value1, value2, "operorgname");
            return (Criteria) this;
        }

        public Criteria andOperorgnameNotBetween(String value1, String value2) {
            addCriterion("operOrgName not between", value1, value2, "operorgname");
            return (Criteria) this;
        }

        public Criteria andSpa1IsNull() {
            addCriterion("spa1 is null");
            return (Criteria) this;
        }

        public Criteria andSpa1IsNotNull() {
            addCriterion("spa1 is not null");
            return (Criteria) this;
        }

        public Criteria andSpa1EqualTo(String value) {
            addCriterion("spa1 =", value, "spa1");
            return (Criteria) this;
        }

        public Criteria andSpa1NotEqualTo(String value) {
            addCriterion("spa1 <>", value, "spa1");
            return (Criteria) this;
        }

        public Criteria andSpa1GreaterThan(String value) {
            addCriterion("spa1 >", value, "spa1");
            return (Criteria) this;
        }

        public Criteria andSpa1GreaterThanOrEqualTo(String value) {
            addCriterion("spa1 >=", value, "spa1");
            return (Criteria) this;
        }

        public Criteria andSpa1LessThan(String value) {
            addCriterion("spa1 <", value, "spa1");
            return (Criteria) this;
        }

        public Criteria andSpa1LessThanOrEqualTo(String value) {
            addCriterion("spa1 <=", value, "spa1");
            return (Criteria) this;
        }

        public Criteria andSpa1Like(String value) {
            addCriterion("spa1 like", value, "spa1");
            return (Criteria) this;
        }

        public Criteria andSpa1NotLike(String value) {
            addCriterion("spa1 not like", value, "spa1");
            return (Criteria) this;
        }

        public Criteria andSpa1In(List<String> values) {
            addCriterion("spa1 in", values, "spa1");
            return (Criteria) this;
        }

        public Criteria andSpa1NotIn(List<String> values) {
            addCriterion("spa1 not in", values, "spa1");
            return (Criteria) this;
        }

        public Criteria andSpa1Between(String value1, String value2) {
            addCriterion("spa1 between", value1, value2, "spa1");
            return (Criteria) this;
        }

        public Criteria andSpa1NotBetween(String value1, String value2) {
            addCriterion("spa1 not between", value1, value2, "spa1");
            return (Criteria) this;
        }

        public Criteria andSpa2IsNull() {
            addCriterion("spa2 is null");
            return (Criteria) this;
        }

        public Criteria andSpa2IsNotNull() {
            addCriterion("spa2 is not null");
            return (Criteria) this;
        }

        public Criteria andSpa2EqualTo(String value) {
            addCriterion("spa2 =", value, "spa2");
            return (Criteria) this;
        }

        public Criteria andSpa2NotEqualTo(String value) {
            addCriterion("spa2 <>", value, "spa2");
            return (Criteria) this;
        }

        public Criteria andSpa2GreaterThan(String value) {
            addCriterion("spa2 >", value, "spa2");
            return (Criteria) this;
        }

        public Criteria andSpa2GreaterThanOrEqualTo(String value) {
            addCriterion("spa2 >=", value, "spa2");
            return (Criteria) this;
        }

        public Criteria andSpa2LessThan(String value) {
            addCriterion("spa2 <", value, "spa2");
            return (Criteria) this;
        }

        public Criteria andSpa2LessThanOrEqualTo(String value) {
            addCriterion("spa2 <=", value, "spa2");
            return (Criteria) this;
        }

        public Criteria andSpa2Like(String value) {
            addCriterion("spa2 like", value, "spa2");
            return (Criteria) this;
        }

        public Criteria andSpa2NotLike(String value) {
            addCriterion("spa2 not like", value, "spa2");
            return (Criteria) this;
        }

        public Criteria andSpa2In(List<String> values) {
            addCriterion("spa2 in", values, "spa2");
            return (Criteria) this;
        }

        public Criteria andSpa2NotIn(List<String> values) {
            addCriterion("spa2 not in", values, "spa2");
            return (Criteria) this;
        }

        public Criteria andSpa2Between(String value1, String value2) {
            addCriterion("spa2 between", value1, value2, "spa2");
            return (Criteria) this;
        }

        public Criteria andSpa2NotBetween(String value1, String value2) {
            addCriterion("spa2 not between", value1, value2, "spa2");
            return (Criteria) this;
        }

        public Criteria andSpa3IsNull() {
            addCriterion("spa3 is null");
            return (Criteria) this;
        }

        public Criteria andSpa3IsNotNull() {
            addCriterion("spa3 is not null");
            return (Criteria) this;
        }

        public Criteria andSpa3EqualTo(String value) {
            addCriterion("spa3 =", value, "spa3");
            return (Criteria) this;
        }

        public Criteria andSpa3NotEqualTo(String value) {
            addCriterion("spa3 <>", value, "spa3");
            return (Criteria) this;
        }

        public Criteria andSpa3GreaterThan(String value) {
            addCriterion("spa3 >", value, "spa3");
            return (Criteria) this;
        }

        public Criteria andSpa3GreaterThanOrEqualTo(String value) {
            addCriterion("spa3 >=", value, "spa3");
            return (Criteria) this;
        }

        public Criteria andSpa3LessThan(String value) {
            addCriterion("spa3 <", value, "spa3");
            return (Criteria) this;
        }

        public Criteria andSpa3LessThanOrEqualTo(String value) {
            addCriterion("spa3 <=", value, "spa3");
            return (Criteria) this;
        }

        public Criteria andSpa3Like(String value) {
            addCriterion("spa3 like", value, "spa3");
            return (Criteria) this;
        }

        public Criteria andSpa3NotLike(String value) {
            addCriterion("spa3 not like", value, "spa3");
            return (Criteria) this;
        }

        public Criteria andSpa3In(List<String> values) {
            addCriterion("spa3 in", values, "spa3");
            return (Criteria) this;
        }

        public Criteria andSpa3NotIn(List<String> values) {
            addCriterion("spa3 not in", values, "spa3");
            return (Criteria) this;
        }

        public Criteria andSpa3Between(String value1, String value2) {
            addCriterion("spa3 between", value1, value2, "spa3");
            return (Criteria) this;
        }

        public Criteria andSpa3NotBetween(String value1, String value2) {
            addCriterion("spa3 not between", value1, value2, "spa3");
            return (Criteria) this;
        }

        public Criteria andSpa4IsNull() {
            addCriterion("spa4 is null");
            return (Criteria) this;
        }

        public Criteria andSpa4IsNotNull() {
            addCriterion("spa4 is not null");
            return (Criteria) this;
        }

        public Criteria andSpa4EqualTo(String value) {
            addCriterion("spa4 =", value, "spa4");
            return (Criteria) this;
        }

        public Criteria andSpa4NotEqualTo(String value) {
            addCriterion("spa4 <>", value, "spa4");
            return (Criteria) this;
        }

        public Criteria andSpa4GreaterThan(String value) {
            addCriterion("spa4 >", value, "spa4");
            return (Criteria) this;
        }

        public Criteria andSpa4GreaterThanOrEqualTo(String value) {
            addCriterion("spa4 >=", value, "spa4");
            return (Criteria) this;
        }

        public Criteria andSpa4LessThan(String value) {
            addCriterion("spa4 <", value, "spa4");
            return (Criteria) this;
        }

        public Criteria andSpa4LessThanOrEqualTo(String value) {
            addCriterion("spa4 <=", value, "spa4");
            return (Criteria) this;
        }

        public Criteria andSpa4Like(String value) {
            addCriterion("spa4 like", value, "spa4");
            return (Criteria) this;
        }

        public Criteria andSpa4NotLike(String value) {
            addCriterion("spa4 not like", value, "spa4");
            return (Criteria) this;
        }

        public Criteria andSpa4In(List<String> values) {
            addCriterion("spa4 in", values, "spa4");
            return (Criteria) this;
        }

        public Criteria andSpa4NotIn(List<String> values) {
            addCriterion("spa4 not in", values, "spa4");
            return (Criteria) this;
        }

        public Criteria andSpa4Between(String value1, String value2) {
            addCriterion("spa4 between", value1, value2, "spa4");
            return (Criteria) this;
        }

        public Criteria andSpa4NotBetween(String value1, String value2) {
            addCriterion("spa4 not between", value1, value2, "spa4");
            return (Criteria) this;
        }

        public Criteria andSpa5IsNull() {
            addCriterion("spa5 is null");
            return (Criteria) this;
        }

        public Criteria andSpa5IsNotNull() {
            addCriterion("spa5 is not null");
            return (Criteria) this;
        }

        public Criteria andSpa5EqualTo(String value) {
            addCriterion("spa5 =", value, "spa5");
            return (Criteria) this;
        }

        public Criteria andSpa5NotEqualTo(String value) {
            addCriterion("spa5 <>", value, "spa5");
            return (Criteria) this;
        }

        public Criteria andSpa5GreaterThan(String value) {
            addCriterion("spa5 >", value, "spa5");
            return (Criteria) this;
        }

        public Criteria andSpa5GreaterThanOrEqualTo(String value) {
            addCriterion("spa5 >=", value, "spa5");
            return (Criteria) this;
        }

        public Criteria andSpa5LessThan(String value) {
            addCriterion("spa5 <", value, "spa5");
            return (Criteria) this;
        }

        public Criteria andSpa5LessThanOrEqualTo(String value) {
            addCriterion("spa5 <=", value, "spa5");
            return (Criteria) this;
        }

        public Criteria andSpa5Like(String value) {
            addCriterion("spa5 like", value, "spa5");
            return (Criteria) this;
        }

        public Criteria andSpa5NotLike(String value) {
            addCriterion("spa5 not like", value, "spa5");
            return (Criteria) this;
        }

        public Criteria andSpa5In(List<String> values) {
            addCriterion("spa5 in", values, "spa5");
            return (Criteria) this;
        }

        public Criteria andSpa5NotIn(List<String> values) {
            addCriterion("spa5 not in", values, "spa5");
            return (Criteria) this;
        }

        public Criteria andSpa5Between(String value1, String value2) {
            addCriterion("spa5 between", value1, value2, "spa5");
            return (Criteria) this;
        }

        public Criteria andSpa5NotBetween(String value1, String value2) {
            addCriterion("spa5 not between", value1, value2, "spa5");
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