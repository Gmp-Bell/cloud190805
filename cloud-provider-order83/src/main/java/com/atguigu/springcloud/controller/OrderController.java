package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author GMP
 * @create 2020-05-20 15:47
 */
@RestController
public class OrderController {

    //public static final String USER_URL = "http://localhost:8003";
    public static final String USER_URL = "http://cloud-user-service";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping(value = "consumer/user/insert")
    public CommonResult insert(User user){

        return restTemplate.postForObject(USER_URL+"/user/insert",user,CommonResult.class);
    }

    @GetMapping(value = "consumer/user/get/{id}")
    public CommonResult insert(@PathVariable("id") Integer id){

        return restTemplate.getForObject(USER_URL+"/user/get/"+id,CommonResult.class,id);
    }

}
