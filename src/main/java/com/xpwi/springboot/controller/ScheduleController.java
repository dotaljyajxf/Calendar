package com.xpwi.springboot.controller;


import com.xpwi.springboot.common.result.CommonResult;
import com.xpwi.springboot.dto.ScheduleParam;
import com.xpwi.springboot.service.ScheduleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@Api(tags = "schedule", description = "日程相关接口")
public class ScheduleController {

    Logger logger = LoggerFactory.getLogger(ScheduleController.class);

    @Autowired
    private ScheduleService scheduleService;

    @ApiOperation("新建日程")
    @RequestMapping(value = "create",method = RequestMethod.PUT)
    public CommonResult insertSchedule(@RequestBody ScheduleParam schedule) {
        int count = scheduleService.createSchedule(schedule);
        if (count == 0) {
            CommonResult.failed();
        }
        return CommonResult.success(null);
    }

    @ApiOperation("查询日程")
    @RequestMapping(value = "",method = RequestMethod.GET)
    public CommonResult getSchedule(@RequestParam(value = "begin_unix",required = true) int beginUnix,
                                    @RequestParam(value = "end_unix",required = true) int endUnix,
                                    @RequestParam(value = "user_ids",required = true) List<Integer> userIds) {

        return CommonResult.success(null);
    }
}
