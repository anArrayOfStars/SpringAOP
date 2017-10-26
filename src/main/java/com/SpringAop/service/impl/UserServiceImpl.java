package com.SpringAop.service.impl;

import com.SpringAop.mapper.dao.UserMapper;
import com.SpringAop.pojo.User;
import com.SpringAop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author mayue
 * @date 2017-10-25
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public void addUser(User user) {
        userMapper.insertUser(user);
        System.out.println("添加成功");
    }

    @Override
    public void deleteUser(Integer id) {
        userMapper.deleteUser(id);
        System.out.println("删除成功");
    }
}
