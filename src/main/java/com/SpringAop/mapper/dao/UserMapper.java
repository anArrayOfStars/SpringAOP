package com.SpringAop.mapper.dao;

import com.SpringAop.pojo.User;
import org.springframework.stereotype.Component;

/**
 * @author mayue
 * @date 2017-10-25
 */
public interface UserMapper {

    /**
     * 增加用户
     * @param user
     */
    void insertUser(User user);

    /**
     * 删除用户
     * @param id
     */
    void deleteUser(Integer id);
}
