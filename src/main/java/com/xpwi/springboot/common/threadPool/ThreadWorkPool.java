package com.xpwi.springboot.common.threadPool;

import org.springframework.stereotype.Component;

import java.util.concurrent.*;

@Component
public class ThreadWorkPool {

    private ThreadPoolExecutor  executors = new ThreadPoolExecutor(10, 20,
                                  0L,TimeUnit.MILLISECONDS,
                                  new LinkedBlockingQueue<Runnable>(50),
            Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());

    public void executeTask(Runnable command) {
        executors.execute(command);
    }
}
