package com.zjy.sm.dao;

import com.zjy.sm.entity.Admin;
import com.zjy.sm.factory.DaoFactory;
import org.junit.Test;

import java.sql.SQLException;

import static org.junit.Assert.*;

public class AdminDaoTest {
    private  final AdminDao adminDao= DaoFactory.getAdminDaoInstance();
    @Test
    public void findAdminByAccount() {
        Admin admin;
        try{
            admin=adminDao.findAdminByAccount("1814418043@qq.com");
            assertEquals("zjy", admin.getAdminName());
            System.out.println(admin);
        }catch (SQLException e){
            System.err.println(e.getMessage());
        }
    }
}