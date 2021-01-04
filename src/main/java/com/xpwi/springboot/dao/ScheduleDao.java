package com.xpwi.springboot.dao;

import com.xpwi.springboot.mbg.model.Schedule;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ScheduleDao {

    /**
     * 批量插入日程
     * @param ScheduleList
     * @return
     */
    int insertSchedules(@Param("list")List<Schedule> ScheduleList);
}
