package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entities.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author GMP
 * @create 2020-05-19 22:09
 */
@Mapper
public interface UserDao {
    public void insert(User user);

    public User getUserById(int id);

    public int deleteDeptById(Integer id);
}
