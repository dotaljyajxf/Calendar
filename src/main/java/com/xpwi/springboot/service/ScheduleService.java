package com.xpwi.springboot.service;

import com.xpwi.springboot.dto.ScheduleParam;
import com.xpwi.springboot.mbg.model.Schedule;

import java.util.List;


public interface ScheduleService {

    int createSchedule(ScheduleParam schedule);

    List<Schedule> getSchedule(int beginUnix, int endUnix, List<Integer> uids);

    int ScheduleDetail(int scheduleId);

    int ScheduleDelete(int scheduleId);
}
