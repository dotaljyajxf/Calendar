package com.xpwi.springboot.controller;


import com.xpwi.springboot.common.result.CommonResult;
import com.xpwi.springboot.dto.UserLoginParam;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Api(tags = "User",description = "用户信息")
@RestController
public class UserController {

    @ApiOperation("登录")
    @RequestMapping(value = "login",method = RequestMethod.POST)
    public CommonResult login(@Validated  @RequestBody UserLoginParam userLoginParam) {
       return null;
    }
}
