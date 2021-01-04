package com.xpwi.springboot.controller;

import com.xpwi.springboot.config.Config;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Api(tags = "HelloController", description = "Hello")
public class HelloController {

    @Resource
    private Config config;
    Logger  logger =  LoggerFactory.getLogger(HelloController.class);


    @ApiOperation("获取所有品牌列表")
    @RequestMapping("/hello")
    public String Hello() {
        logger.info("In hello World");
        return config.getName() + " " + config.getUrl();
    }

}
