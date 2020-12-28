package com.xpwi.springboot.mbg.mapper;

import com.xpwi.springboot.mbg.model.ScheduleUser;
import com.xpwi.springboot.mbg.model.ScheduleUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ScheduleUserMapper {
    long countByExample(ScheduleUserExample example);

    int deleteByExample(ScheduleUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ScheduleUser record);

    int insertSelective(ScheduleUser record);

    List<ScheduleUser> selectByExample(ScheduleUserExample example);

    ScheduleUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ScheduleUser record, @Param("example") ScheduleUserExample example);

    int updateByExample(@Param("record") ScheduleUser record, @Param("example") ScheduleUserExample example);

    int updateByPrimaryKeySelective(ScheduleUser record);

    int updateByPrimaryKey(ScheduleUser record);
}