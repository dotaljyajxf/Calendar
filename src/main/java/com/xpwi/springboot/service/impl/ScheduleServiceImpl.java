package com.xpwi.springboot.service.impl;

import com.xpwi.springboot.dto.ScheduleParam;
import com.xpwi.springboot.mbg.mapper.ScheduleMapper;
import com.xpwi.springboot.mbg.mapper.ScheduleUserMapper;
import com.xpwi.springboot.mbg.model.Schedule;
import com.xpwi.springboot.mbg.model.ScheduleExample;
import com.xpwi.springboot.mbg.model.ScheduleUser;
import com.xpwi.springboot.mbg.model.ScheduleUserExample;
import com.xpwi.springboot.service.ScheduleService;
import org.apache.tomcat.util.threads.ThreadPoolExecutor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Timer;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


@Service
public class ScheduleServiceImpl implements ScheduleService {

    private ScheduleMapper scheduleMapper;
    private ScheduleExample scheduleExample;
    private ScheduleUserMapper scheduleUserMapper;
    private ScheduleUserExample scheduleUserExample;
    @Override
    public int createSchedule(ScheduleParam schedule) {

        Schedule schedule1 = new Schedule();
        BeanUtils.copyProperties(schedule1, schedule);

        ExecutorService single = Executors.newSingleThreadExecutor();
        single.shutdown();
        return scheduleMapper.insert(schedule1);
    }

    @Override
    public int getSchedule(int beginUnix, int endUnix, List<Integer> uids) {

        ScheduleUserExample.Criteria criteria = scheduleUserExample.createCriteria();
        criteria.andUserIdIn(uids).andBeginUnixBetween(beginUnix,endUnix);
        List<ScheduleUser>  retBegin  = scheduleUserMapper.selectByExample(scheduleUserExample);
        scheduleUserExample.createCriteria();

       // UUID.randomUUID()
        ScheduleUserExample.Criteria criteria1 = scheduleUserExample.createCriteria();
        criteria1.andUserIdIn(uids).andEndUnixBetween(beginUnix,endUnix);
        List<ScheduleUser>  retEnd  = scheduleUserMapper.selectByExample(scheduleUserExample);

        return 0;
    }
}
