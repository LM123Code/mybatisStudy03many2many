package com.mybatisStudy03many2many.dao;

import com.mybatisStudy03many2many.domain.User;

import java.util.List;

/**
 * @author LM_Code
 * @create 2019-04-02-20:59
 */
public interface IUserDao {
    /**
     * 根据id查询用户
     * @param userId
     * @return
     */
    public User findById(Integer userId);

    public List<User> findAll();
}
