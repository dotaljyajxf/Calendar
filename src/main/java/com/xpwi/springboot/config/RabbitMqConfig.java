package com.xpwi.springboot.config;

import com.xpwi.springboot.common.rabbitMq.QueueEnum;
import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMqConfig {

    /**
     * 普通消费队列所绑定的交换机
     */
    @Bean
    DirectExchange scheduleDirect() {
        return (DirectExchange) ExchangeBuilder
                .directExchange(QueueEnum.QUEUE_SCHEDULE_NOTIFY.getExchange())
                .durable(true)
                .build();
    }

    /**
     * 延时消费队列所绑定的交换机
     */
    @Bean
    DirectExchange scheduleTTLDirect() {
        return (DirectExchange) ExchangeBuilder
                .directExchange(QueueEnum.QUEUE_TTL_SCHEDULE_NOTIFY.getExchange())
                .durable(true)
                .build();
    }

    /**
     * 消息队列
     */
    @Bean
    public Queue scheduleQueue() {
        return new Queue(QueueEnum.QUEUE_SCHEDULE_NOTIFY.getName());
    }

    /**
     * 延时消息队列
     */
    @Bean
    public Queue scheduleTTLQueue() {
        return QueueBuilder
                .durable(QueueEnum.QUEUE_TTL_SCHEDULE_NOTIFY.getName())
                .withArgument("x-dead-letter-exchange", QueueEnum.QUEUE_SCHEDULE_NOTIFY.getExchange())//到期后转发的交换机
                .withArgument("x-dead-letter-routing-key", QueueEnum.QUEUE_SCHEDULE_NOTIFY.getRouteKey())//到期后转发的路由键
                .build();
    }

    /**
     * 将队列绑定到交换机
     */
    @Bean
    Binding scheduleBinding(DirectExchange scheduleDirect,Queue scheduleQueue){
        return BindingBuilder
                .bind(scheduleQueue)
                .to(scheduleDirect)
                .with(QueueEnum.QUEUE_SCHEDULE_NOTIFY.getRouteKey());
    }

    /**
     * 将延时队列绑定到交换机
     */
    @Bean
    Binding scheduleTTLBinding(DirectExchange scheduleTTLDirect,Queue scheduleTTLQueue){
        return BindingBuilder
                .bind(scheduleTTLQueue)
                .to(scheduleTTLDirect)
                .with(QueueEnum.QUEUE_TTL_SCHEDULE_NOTIFY.getRouteKey());
    }
}
