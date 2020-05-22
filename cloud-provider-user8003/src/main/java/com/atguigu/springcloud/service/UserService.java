package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.User;

/**
 * @author GMP
 * @create 2020-05-19 23:58
 */

public interface UserService {
    public void insert(User user);

    public User getUserById(int id);

    public int deleteDeptById(Integer id);
}
