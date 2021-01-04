package com.xpwi.springboot.common.rabbitMq;


import com.xpwi.springboot.service.QueueService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ReceiveMessage {
    private static Logger LOGGER = LoggerFactory.getLogger(ReceiveMessage.class);
    @Autowired
    private QueueService queueService;

    @RabbitListener(queues = "schedule.notify")
    public void process(Integer scheduleId){
        LOGGER.info("receive delay message scheduleId:{}",scheduleId);
        queueService.HandleMessage(scheduleId);
    }
}
