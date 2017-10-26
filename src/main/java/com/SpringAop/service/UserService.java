package com.SpringAop.service;

import com.SpringAop.pojo.User;

/**
 * @author mayue
 * @date 2017-10-25
 */
public interface UserService {
    /**
     * 增加用户
     * @param user
     */
    void addUser(User user);

    /**
     * 删除用户
     * @param id
     */
    void deleteUser(Integer id);
}
