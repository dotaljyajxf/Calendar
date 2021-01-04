package com.xpwi.springboot.controller;


import com.xpwi.springboot.common.result.CommonResult;
import com.xpwi.springboot.dto.ScheduleParam;
import com.xpwi.springboot.mbg.model.Schedule;
import com.xpwi.springboot.service.ScheduleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;


@RestController(value = "/schedule")
@Api(tags = "schedule", description = "日程相关接口")
public class ScheduleController {

    @Resource
    private ScheduleService scheduleService;

    @ApiOperation("新建日程")
    @RequestMapping(value = "/create",method = RequestMethod.POST)
    public CommonResult insertSchedule(@RequestBody ScheduleParam schedule) {
        int count = scheduleService.createSchedule(schedule);
        if (count == 0) {
            CommonResult.failed();
        }
        return CommonResult.success(null);
    }

    @ApiOperation("查询日程")
    @RequestMapping(value = "/infos",method = RequestMethod.GET)
    public CommonResult getSchedule(@RequestParam(value = "begin_unix",required = true) int beginUnix,
                                    @RequestParam(value = "end_unix",required = true) int endUnix,
                                    @RequestParam(value = "user_ids",required = true) List<Integer> userIds) {

        List<Schedule> ret = scheduleService.getSchedule(beginUnix,endUnix,userIds);
        return CommonResult.success(ret);
    }

    @ApiOperation("日程详细")
    @RequestMapping(value = "/detail",method = RequestMethod.GET)
    public CommonResult scheduleDetail(@RequestParam(value = "s_id",required = true) int scheduleId) {

        return CommonResult.success(null);
    }

    @ApiOperation("删除日程")
    @RequestMapping(value = "/delete",method = RequestMethod.DELETE)
    public CommonResult scheduleDelete(@RequestParam(value = "s_id",required = true) int scheduleId) {

        return CommonResult.success(scheduleService.ScheduleDelete(scheduleId));
    }

    @ApiOperation("修改日程")
    @RequestMapping(value = "/modify",method = RequestMethod.POST)
    public CommonResult scheduleModify(@RequestParam(value = "s_id",required = true) int scheduleId) {

        return CommonResult.success(null);
    }
}
