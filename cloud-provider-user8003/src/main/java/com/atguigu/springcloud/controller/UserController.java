package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.User;
import com.atguigu.springcloud.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author GMP
 * @create 2020-05-20 10:30
 */
@RestController
public class UserController {

    @Resource
    private UserService userService;

    @PostMapping(value = "/user/insert")
    public CommonResult insert(@RequestBody  User user){
        userService.insert(user);
        return new CommonResult(200,"插入成功",user);
    }

    @GetMapping(value = "/user/get/{id}")
    public CommonResult getUserById(@PathVariable("id")Integer id){
        User user = userService.getUserById(id);
        return new CommonResult(200,"查询信息见右",user);
    }






}
