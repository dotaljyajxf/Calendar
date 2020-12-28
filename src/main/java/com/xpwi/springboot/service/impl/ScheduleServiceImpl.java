package com.xpwi.springboot.service.impl;

import com.xpwi.springboot.dto.ScheduleParam;
import com.xpwi.springboot.mbg.mapper.ScheduleMapper;
import com.xpwi.springboot.mbg.mapper.ScheduleUserMapper;
import com.xpwi.springboot.mbg.model.Schedule;
import com.xpwi.springboot.service.ScheduleService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ScheduleServiceImpl implements ScheduleService {

    public ScheduleMapper scheduleMapper;
    public ScheduleUserMapper scheduleUserMapper;
    @Override
    public int createSchedule(ScheduleParam schedule) {

        Schedule schedule1 = new Schedule();
        BeanUtils.copyProperties(schedule1, schedule);

        return scheduleMapper.insertSelective(schedule1);
    }

    @Override
    public int querySchedule(int beginUnix, int endUnix, List<Integer> uids) {
        return 0;
    }
}
