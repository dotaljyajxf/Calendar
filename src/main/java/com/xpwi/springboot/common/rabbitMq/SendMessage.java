package com.xpwi.springboot.common.rabbitMq;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.AmqpException;
import org.springframework.amqp.core.MessagePostProcessor;


@Component
public class SendMessage {
    private static Logger LOGGER = LoggerFactory.getLogger(SendMessage.class);
    @Autowired
    private AmqpTemplate amqpTemplate;

    public void sendMessage(Integer scheduleId,final long notifyTimes){
        long duration = notifyTimes*1000 - System.currentTimeMillis();
        LOGGER.info("duration:{}",duration);
        if (duration < 0) {
            return;
        }

        //给延迟队列发送消息
        MessagePostProcessor processor = new MessagePostProcessor() {

            @Override
            public Message postProcessMessage(Message message) throws AmqpException {
                //给消息设置延迟毫秒值
                message.getMessageProperties().setExpiration(String.valueOf(duration));
                LOGGER.info("add Message id:{},duration:{}",scheduleId,duration);
                return message;
            }
        };
        amqpTemplate.convertAndSend(QueueEnum.QUEUE_TTL_SCHEDULE_NOTIFY.getExchange(), QueueEnum.QUEUE_TTL_SCHEDULE_NOTIFY.getRouteKey(), scheduleId, processor);

//        amqpTemplate.convertAndSend(QueueEnum.QUEUE_TTL_SCHEDULE_NOTIFY.getExchange(), QueueEnum.QUEUE_TTL_SCHEDULE_NOTIFY.getRouteKey(), scheduleId, new MessagePostProcessor(){
//            @Override
//            public Message postProcessMessage(Message message) throws AmqpException {
//                //给消息设置延迟毫秒值
//                message.getMessageProperties().setExpiration(String.valueOf(duration));
//                LOGGER.info("add Message id:{},duration:{}",scheduleId,duration);
//                return message;
//            }
//        });
    }
}
