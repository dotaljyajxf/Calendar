package com.xpwi.springboot.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ScheduleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ScheduleExample() {
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

        public Criteria andLaunchUidIsNull() {
            addCriterion("launch_uid is null");
            return (Criteria) this;
        }

        public Criteria andLaunchUidIsNotNull() {
            addCriterion("launch_uid is not null");
            return (Criteria) this;
        }

        public Criteria andLaunchUidEqualTo(Integer value) {
            addCriterion("launch_uid =", value, "launchUid");
            return (Criteria) this;
        }

        public Criteria andLaunchUidNotEqualTo(Integer value) {
            addCriterion("launch_uid <>", value, "launchUid");
            return (Criteria) this;
        }

        public Criteria andLaunchUidGreaterThan(Integer value) {
            addCriterion("launch_uid >", value, "launchUid");
            return (Criteria) this;
        }

        public Criteria andLaunchUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("launch_uid >=", value, "launchUid");
            return (Criteria) this;
        }

        public Criteria andLaunchUidLessThan(Integer value) {
            addCriterion("launch_uid <", value, "launchUid");
            return (Criteria) this;
        }

        public Criteria andLaunchUidLessThanOrEqualTo(Integer value) {
            addCriterion("launch_uid <=", value, "launchUid");
            return (Criteria) this;
        }

        public Criteria andLaunchUidIn(List<Integer> values) {
            addCriterion("launch_uid in", values, "launchUid");
            return (Criteria) this;
        }

        public Criteria andLaunchUidNotIn(List<Integer> values) {
            addCriterion("launch_uid not in", values, "launchUid");
            return (Criteria) this;
        }

        public Criteria andLaunchUidBetween(Integer value1, Integer value2) {
            addCriterion("launch_uid between", value1, value2, "launchUid");
            return (Criteria) this;
        }

        public Criteria andLaunchUidNotBetween(Integer value1, Integer value2) {
            addCriterion("launch_uid not between", value1, value2, "launchUid");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Boolean value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Boolean value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Boolean value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Boolean value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Boolean value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Boolean> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Boolean> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Boolean value1, Boolean value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomIsNull() {
            addCriterion("meeting_room is null");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomIsNotNull() {
            addCriterion("meeting_room is not null");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomEqualTo(Integer value) {
            addCriterion("meeting_room =", value, "meetingRoom");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomNotEqualTo(Integer value) {
            addCriterion("meeting_room <>", value, "meetingRoom");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomGreaterThan(Integer value) {
            addCriterion("meeting_room >", value, "meetingRoom");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomGreaterThanOrEqualTo(Integer value) {
            addCriterion("meeting_room >=", value, "meetingRoom");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomLessThan(Integer value) {
            addCriterion("meeting_room <", value, "meetingRoom");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomLessThanOrEqualTo(Integer value) {
            addCriterion("meeting_room <=", value, "meetingRoom");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomIn(List<Integer> values) {
            addCriterion("meeting_room in", values, "meetingRoom");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomNotIn(List<Integer> values) {
            addCriterion("meeting_room not in", values, "meetingRoom");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomBetween(Integer value1, Integer value2) {
            addCriterion("meeting_room between", value1, value2, "meetingRoom");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomNotBetween(Integer value1, Integer value2) {
            addCriterion("meeting_room not between", value1, value2, "meetingRoom");
            return (Criteria) this;
        }

        public Criteria andBeginUnixIsNull() {
            addCriterion("begin_unix is null");
            return (Criteria) this;
        }

        public Criteria andBeginUnixIsNotNull() {
            addCriterion("begin_unix is not null");
            return (Criteria) this;
        }

        public Criteria andBeginUnixEqualTo(Integer value) {
            addCriterion("begin_unix =", value, "beginUnix");
            return (Criteria) this;
        }

        public Criteria andBeginUnixNotEqualTo(Integer value) {
            addCriterion("begin_unix <>", value, "beginUnix");
            return (Criteria) this;
        }

        public Criteria andBeginUnixGreaterThan(Integer value) {
            addCriterion("begin_unix >", value, "beginUnix");
            return (Criteria) this;
        }

        public Criteria andBeginUnixGreaterThanOrEqualTo(Integer value) {
            addCriterion("begin_unix >=", value, "beginUnix");
            return (Criteria) this;
        }

        public Criteria andBeginUnixLessThan(Integer value) {
            addCriterion("begin_unix <", value, "beginUnix");
            return (Criteria) this;
        }

        public Criteria andBeginUnixLessThanOrEqualTo(Integer value) {
            addCriterion("begin_unix <=", value, "beginUnix");
            return (Criteria) this;
        }

        public Criteria andBeginUnixIn(List<Integer> values) {
            addCriterion("begin_unix in", values, "beginUnix");
            return (Criteria) this;
        }

        public Criteria andBeginUnixNotIn(List<Integer> values) {
            addCriterion("begin_unix not in", values, "beginUnix");
            return (Criteria) this;
        }

        public Criteria andBeginUnixBetween(Integer value1, Integer value2) {
            addCriterion("begin_unix between", value1, value2, "beginUnix");
            return (Criteria) this;
        }

        public Criteria andBeginUnixNotBetween(Integer value1, Integer value2) {
            addCriterion("begin_unix not between", value1, value2, "beginUnix");
            return (Criteria) this;
        }

        public Criteria andEndUnixIsNull() {
            addCriterion("end_unix is null");
            return (Criteria) this;
        }

        public Criteria andEndUnixIsNotNull() {
            addCriterion("end_unix is not null");
            return (Criteria) this;
        }

        public Criteria andEndUnixEqualTo(Integer value) {
            addCriterion("end_unix =", value, "endUnix");
            return (Criteria) this;
        }

        public Criteria andEndUnixNotEqualTo(Integer value) {
            addCriterion("end_unix <>", value, "endUnix");
            return (Criteria) this;
        }

        public Criteria andEndUnixGreaterThan(Integer value) {
            addCriterion("end_unix >", value, "endUnix");
            return (Criteria) this;
        }

        public Criteria andEndUnixGreaterThanOrEqualTo(Integer value) {
            addCriterion("end_unix >=", value, "endUnix");
            return (Criteria) this;
        }

        public Criteria andEndUnixLessThan(Integer value) {
            addCriterion("end_unix <", value, "endUnix");
            return (Criteria) this;
        }

        public Criteria andEndUnixLessThanOrEqualTo(Integer value) {
            addCriterion("end_unix <=", value, "endUnix");
            return (Criteria) this;
        }

        public Criteria andEndUnixIn(List<Integer> values) {
            addCriterion("end_unix in", values, "endUnix");
            return (Criteria) this;
        }

        public Criteria andEndUnixNotIn(List<Integer> values) {
            addCriterion("end_unix not in", values, "endUnix");
            return (Criteria) this;
        }

        public Criteria andEndUnixBetween(Integer value1, Integer value2) {
            addCriterion("end_unix between", value1, value2, "endUnix");
            return (Criteria) this;
        }

        public Criteria andEndUnixNotBetween(Integer value1, Integer value2) {
            addCriterion("end_unix not between", value1, value2, "endUnix");
            return (Criteria) this;
        }

        public Criteria andNotifyUnixIsNull() {
            addCriterion("notify_unix is null");
            return (Criteria) this;
        }

        public Criteria andNotifyUnixIsNotNull() {
            addCriterion("notify_unix is not null");
            return (Criteria) this;
        }

        public Criteria andNotifyUnixEqualTo(Integer value) {
            addCriterion("notify_unix =", value, "notifyUnix");
            return (Criteria) this;
        }

        public Criteria andNotifyUnixNotEqualTo(Integer value) {
            addCriterion("notify_unix <>", value, "notifyUnix");
            return (Criteria) this;
        }

        public Criteria andNotifyUnixGreaterThan(Integer value) {
            addCriterion("notify_unix >", value, "notifyUnix");
            return (Criteria) this;
        }

        public Criteria andNotifyUnixGreaterThanOrEqualTo(Integer value) {
            addCriterion("notify_unix >=", value, "notifyUnix");
            return (Criteria) this;
        }

        public Criteria andNotifyUnixLessThan(Integer value) {
            addCriterion("notify_unix <", value, "notifyUnix");
            return (Criteria) this;
        }

        public Criteria andNotifyUnixLessThanOrEqualTo(Integer value) {
            addCriterion("notify_unix <=", value, "notifyUnix");
            return (Criteria) this;
        }

        public Criteria andNotifyUnixIn(List<Integer> values) {
            addCriterion("notify_unix in", values, "notifyUnix");
            return (Criteria) this;
        }

        public Criteria andNotifyUnixNotIn(List<Integer> values) {
            addCriterion("notify_unix not in", values, "notifyUnix");
            return (Criteria) this;
        }

        public Criteria andNotifyUnixBetween(Integer value1, Integer value2) {
            addCriterion("notify_unix between", value1, value2, "notifyUnix");
            return (Criteria) this;
        }

        public Criteria andNotifyUnixNotBetween(Integer value1, Integer value2) {
            addCriterion("notify_unix not between", value1, value2, "notifyUnix");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNull() {
            addCriterion("is_deleted is null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNotNull() {
            addCriterion("is_deleted is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedEqualTo(Boolean value) {
            addCriterion("is_deleted =", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotEqualTo(Boolean value) {
            addCriterion("is_deleted <>", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThan(Boolean value) {
            addCriterion("is_deleted >", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_deleted >=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThan(Boolean value) {
            addCriterion("is_deleted <", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThanOrEqualTo(Boolean value) {
            addCriterion("is_deleted <=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIn(List<Boolean> values) {
            addCriterion("is_deleted in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotIn(List<Boolean> values) {
            addCriterion("is_deleted not in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedBetween(Boolean value1, Boolean value2) {
            addCriterion("is_deleted between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_deleted not between", value1, value2, "isDeleted");
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

        public Criteria andCreatedAtIsNull() {
            addCriterion("created_at is null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNotNull() {
            addCriterion("created_at is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtEqualTo(Date value) {
            addCriterion("created_at =", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotEqualTo(Date value) {
            addCriterion("created_at <>", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThan(Date value) {
            addCriterion("created_at >", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("created_at >=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThan(Date value) {
            addCriterion("created_at <", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThanOrEqualTo(Date value) {
            addCriterion("created_at <=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIn(List<Date> values) {
            addCriterion("created_at in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotIn(List<Date> values) {
            addCriterion("created_at not in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtBetween(Date value1, Date value2) {
            addCriterion("created_at between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotBetween(Date value1, Date value2) {
            addCriterion("created_at not between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNull() {
            addCriterion("updated_at is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNotNull() {
            addCriterion("updated_at is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtEqualTo(Date value) {
            addCriterion("updated_at =", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotEqualTo(Date value) {
            addCriterion("updated_at <>", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThan(Date value) {
            addCriterion("updated_at >", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("updated_at >=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThan(Date value) {
            addCriterion("updated_at <", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThanOrEqualTo(Date value) {
            addCriterion("updated_at <=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIn(List<Date> values) {
            addCriterion("updated_at in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotIn(List<Date> values) {
            addCriterion("updated_at not in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtBetween(Date value1, Date value2) {
            addCriterion("updated_at between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotBetween(Date value1, Date value2) {
            addCriterion("updated_at not between", value1, value2, "updatedAt");
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