package com.mybatisStudy03many2many.dao;

import com.mybatisStudy03many2many.domain.User;
import com.mybatisStudy03many2many.utils.SqlSessionFactoryUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.List;

/**
 * @author LM_Code
 * @create 2019-04-02-21:57
 */
public class IUserDaoTest {
    SqlSession sqlSession = null;
    IUserDao userDao = null;
    @Before
    public void before(){
        sqlSession = SqlSessionFactoryUtil.getSqlSession(true);
        userDao = sqlSession.getMapper(IUserDao.class);
    }
    @After
    public void after(){
        SqlSessionFactoryUtil.close(sqlSession);
    }

    @Test
    public void testFindById(){
        User user = userDao.findById(46);
        System.out.println(user);
        Assert.assertNotNull(user);
    }

    @Test
    public void testFindAll(){
        List<User> list = userDao.findAll();
        for (User user : list) {
            System.out.println("-----------------------------------");
            System.out.println(user);
            System.out.println(user.getRoles());
        }
    }
}
