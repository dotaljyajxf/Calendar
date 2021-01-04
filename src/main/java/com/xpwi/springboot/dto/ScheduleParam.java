package com.xpwi.springboot.dto;


import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = false)
public class ScheduleParam {
    @ApiModelProperty("日程标题")
    private String title;
    @ApiModelProperty("日程开始时间")
    private int beginUnix;
    @ApiModelProperty("日程类型")
    private int type;
    @ApiModelProperty("重复的次数")
    private int repeatNum;
    @ApiModelProperty("日程结束时间")
    private int endUnix;
    @ApiModelProperty("日程描述")
    private String content;
    @ApiModelProperty("会议室ID")
    private int meetingRoom;
    @ApiModelProperty("日程通知时间")
    private int notifyUnix;
    @ApiModelProperty("日程邀请的用户")
    private List<Integer> notifyUsers;
}
