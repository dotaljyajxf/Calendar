package com.xpwi.springboot.service;

import com.xpwi.springboot.mbg.model.Schedule;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface QueueService {
    /**
     * 根据提交信息生成订单
     */
    @Transactional
    void AddMessage(List<Schedule> listSchedule);

    /**
     * 取消单个超时订单
     */
    @Transactional
    void HandleMessage(Integer scheduleId);
}
