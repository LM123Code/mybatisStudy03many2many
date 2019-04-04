package com.mybatisStudy03many2many.dao;

import com.mybatisStudy03many2many.domain.Role;
import com.mybatisStudy03many2many.utils.SqlSessionFactoryUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * @author LM_Code
 * @create 2019-04-03-18:20
 */
public class IRoleDaoTest {
    SqlSession sqlSession = null;
    IRoleDao userDao = null;
    @Before
    public void before(){
        sqlSession = SqlSessionFactoryUtil.getSqlSession(true);
        userDao = sqlSession.getMapper(IRoleDao.class);
    }
    @After
    public void after(){
        SqlSessionFactoryUtil.close(sqlSession);
    }
    @Test
    public void testFindAll(){
        List<Role> list = userDao.findAll();
        for (Role role : list) {
            System.out.println("-----------------------------------每个角色的信息-----------------------------------");
            System.out.println(role);
            System.out.println(role.getUsers());
        }
    }
}
