package com.xpwi.springboot.service;

import com.xpwi.springboot.dto.ScheduleParam;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ScheduleService {

    int createSchedule(ScheduleParam schedule);

    int querySchedule(int beginUnix, int endUnix, List<Integer> uids);
}
