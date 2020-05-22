package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author GMP
 * @create 2020-05-19 22:02
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User implements Serializable {
    private int uid;
    private String userName;

}
