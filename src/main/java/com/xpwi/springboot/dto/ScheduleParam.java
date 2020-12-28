package com.xpwi.springboot.dto;


import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class ScheduleParam {
    @ApiModelProperty("日程标题")
    private String title;
    @ApiModelProperty("日程开始时间")
    private int beginUnix;
    @ApiModelProperty("日程结束时间")
    private int endUnix;
    @ApiModelProperty("日程描述")
    private String content;
    @ApiModelProperty("日程类型，1:普通日程 2:重复日程")
    private int type;
    @ApiModelProperty("重复日程的重复次数")
    private int repeatNum;
    @ApiModelProperty("会议室ID")
    private int meetRoom;
    @ApiModelProperty("日程通知时间")
    private int notifyUnix;
}
