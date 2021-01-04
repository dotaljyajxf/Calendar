package com.xpwi.springboot.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class Schedule implements Serializable {
    private Integer id;

    @ApiModelProperty(value = "ID")
    private Integer launchUid;

    private Integer type;

    @ApiModelProperty(value = "id")
    private String repeatUuid;

    @ApiModelProperty(value = "ID")
    private Integer meetingRoom;

    private Integer beginUnix;

    private Integer endUnix;

    private Integer notifyUnix;

    @ApiModelProperty(value = " 1")
    private Boolean isDeleted;

    private String content;

    private Date createdAt;

    private Date updatedAt;

    private String title;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLaunchUid() {
        return launchUid;
    }

    public void setLaunchUid(Integer launchUid) {
        this.launchUid = launchUid;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getRepeatUuid() {
        return repeatUuid;
    }

    public void setRepeatUuid(String repeatUuid) {
        this.repeatUuid = repeatUuid;
    }

    public Integer getMeetingRoom() {
        return meetingRoom;
    }

    public void setMeetingRoom(Integer meetingRoom) {
        this.meetingRoom = meetingRoom;
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

    public Integer getNotifyUnix() {
        return notifyUnix;
    }

    public void setNotifyUnix(Integer notifyUnix) {
        this.notifyUnix = notifyUnix;
    }

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", launchUid=").append(launchUid);
        sb.append(", type=").append(type);
        sb.append(", repeatUuid=").append(repeatUuid);
        sb.append(", meetingRoom=").append(meetingRoom);
        sb.append(", beginUnix=").append(beginUnix);
        sb.append(", endUnix=").append(endUnix);
        sb.append(", notifyUnix=").append(notifyUnix);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", content=").append(content);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", updatedAt=").append(updatedAt);
        sb.append(", title=").append(title);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}