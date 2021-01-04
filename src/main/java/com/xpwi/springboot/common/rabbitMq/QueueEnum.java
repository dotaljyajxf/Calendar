package com.xpwi.springboot.common.rabbitMq;

import lombok.Getter;

/**
 * 消息队列枚举配置
 * Created by macro on 2018/9/14.
 */
@Getter
public enum QueueEnum {
    /**
     * 消息通知队列
     */
    QUEUE_SCHEDULE_NOTIFY("schedule.notify.direct", "schedule.notify", "schedule.notify"),
    /**
     * 消息通知ttl队列
     */
    QUEUE_TTL_SCHEDULE_NOTIFY("schedule.notify.direct.ttl", "schedule.notify.ttl", "schedule.notify.ttl");

    /**
     * 交换名称
     */
    private String exchange;
    /**
     * 队列名称
     */
    private String name;
    /**
     * 路由键
     */
    private String routeKey;

    QueueEnum(String exchange, String name, String routeKey) {
        this.exchange = exchange;
        this.name = name;
        this.routeKey = routeKey;
    }
}
