package com.xpwi.springboot.dao;

import com.xpwi.springboot.mbg.model.ScheduleUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ScheduleUserDao {

    /**
     * 根据后台用户ID获取菜单
     */
    List<ScheduleUser> getScheduleIdsByUidsAndBeginUnix(@Param("uids") List<Integer> uids, @Param("beginUnix") int beginUnix, @Param("endUnix") int endUnix);
}
