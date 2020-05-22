package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author GMP
 * @create 2020-05-20 15:41
 */
@SpringBootApplication
@EnableDiscoveryClient
public class MainApp83 {
    public static void main(String[] args) {
        SpringApplication.run(MainApp83.class,args);
    }
}
