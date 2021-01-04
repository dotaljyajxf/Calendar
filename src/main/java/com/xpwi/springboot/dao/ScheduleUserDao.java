package com.xpwi.springboot.dao;

import com.xpwi.springboot.mbg.model.ScheduleUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ScheduleUserDao {

    /**
     * 查询用户开始时间范围内可见的日程
     */
    List<ScheduleUser> getScheduleIdsByUidsAndBeginUnix(@Param("uids") List<Integer> uids, @Param("beginUnix") int beginUnix, @Param("endUnix") int endUnix);

    /**
     * 查询用户开始时间范围内可见的日程
     */
    List<ScheduleUser> getScheduleIdsByUidsAndEndUnix(@Param("uids") List<Integer> uids, @Param("beginUnix") int beginUnix, @Param("endUnix") int endUnix);

    /**
     * 批量插入日程用户信息
     */
    int insertScheduleUsers(@Param("list")List<ScheduleUser> ScheduleUsersList);
}
