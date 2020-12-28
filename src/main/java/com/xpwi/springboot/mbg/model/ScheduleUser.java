package com.xpwi.springboot.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class ScheduleUser implements Serializable {
    private Integer id;

    @ApiModelProperty(value = "ID")
    private Integer sId;

    @ApiModelProperty(value = "ID")
    private Integer userId;

    private Integer beginUnix;

    private Integer endUnix;

    @ApiModelProperty(value = " 1")
    private Boolean isDeleted;

    private Date createdAt;

    private Date updatedAt;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getBeginUnix() {
        return beginUnix;
    }

    public void setBeginUnix(Integer beginUnix) {
        this.beginUnix = beginUnix;
    }

    public Integer getEndUnix() {
        return endUnix;
    }

    public void setEndUnix(Integer endUnix) {
        this.endUnix = endUnix;
    }

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", sId=").append(sId);
        sb.append(", userId=").append(userId);
        sb.append(", beginUnix=").append(beginUnix);
        sb.append(", endUnix=").append(endUnix);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", updatedAt=").append(updatedAt);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}