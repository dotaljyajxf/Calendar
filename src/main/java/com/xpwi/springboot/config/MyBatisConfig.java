package com.xpwi.springboot.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@MapperScan({"com.xpwi.springboot.mbg.mapper","com.xpwi.springboot.dao"})
public class MyBatisConfig {
}
