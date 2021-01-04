package com.xpwi.springboot.service.impl;

import com.xpwi.springboot.common.rabbitMq.SendMessage;
import com.xpwi.springboot.common.threadPool.ThreadWorkPool;
import com.xpwi.springboot.mbg.model.Schedule;
import com.xpwi.springboot.service.QueueService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QueueServiceImpl implements QueueService {

    @Autowired
    private SendMessage sendMessage;

    @Autowired
    private ThreadWorkPool threadWorkPool;

    private static Logger LOGGER = LoggerFactory.getLogger(QueueServiceImpl.class);
    @Override
    public void AddMessage(List<Schedule> listSchedule) {
        for (Schedule s : listSchedule) {
            sendMessage.sendMessage(s.getId(),s.getNotifyUnix());
        }
    }

    private class Task implements Runnable {
        private int scheduleId;

        Task(int scheduleId) {
            this.scheduleId = scheduleId;
        }

        @Override
        public void run() {
            LOGGER.info("Push schedule : id{}",this.scheduleId);
        }
    }

    @Override
    public void HandleMessage(Integer scheduleId) {
        Task t = new Task(scheduleId);
        threadWorkPool.executeTask(t);
    }
}
