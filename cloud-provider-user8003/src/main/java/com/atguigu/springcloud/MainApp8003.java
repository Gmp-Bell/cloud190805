package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author GMP
 * @create 2020-05-19 21:56
 */
@SpringBootApplication
@EnableDiscoveryClient
public class MainApp8003 {
    public static void main(String[] args) {
        SpringApplication.run(MainApp8003.class,args);
    }
}
