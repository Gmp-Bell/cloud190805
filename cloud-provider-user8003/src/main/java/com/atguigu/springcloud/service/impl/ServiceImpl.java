package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.dao.UserDao;
import com.atguigu.springcloud.entities.User;
import com.atguigu.springcloud.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author GMP
 * @create 2020-05-20 10:27
 */
@Service
public class ServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public void insert(User user) {

        userDao.insert(user);
    }

    @Override
    public User getUserById(int id) {

        return userDao.getUserById(id);
    }

    @Override
    public int deleteDeptById(Integer id) {
        return 0;
    }
}
