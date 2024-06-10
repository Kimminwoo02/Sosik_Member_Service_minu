package com.example.sosikmemberservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

@Configuration
public class AsyncConfig {

    @Bean(name = "defaultExecutorService", destroyMethod = "shutdown")
    public ThreadPoolTaskExecutor defaultExecutor(){
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(200);
        executor.setMaxPoolSize(300);
        executor.setKeepAliveSeconds(10);
        return executor;
    }

    @Bean(name = "messagingExecutorService", destroyMethod = "shutdown")
    public ThreadPoolTaskExecutor messagingTaskExecutor(){
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(200);
        executor.setMaxPoolSize(300);
        executor.setKeepAliveSeconds(10);
        return executor;
    }


}
