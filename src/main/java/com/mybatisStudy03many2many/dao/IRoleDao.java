package com.mybatisStudy03many2many.dao;

import com.mybatisStudy03many2many.domain.Role;

import java.util.List;

/**
 * @author LM_Code
 * @create 2019-04-03-18:11
 */
public interface IRoleDao {
    /**
     * 查询所有角色
     * @return
     */
    public List<Role> findAll();
}
