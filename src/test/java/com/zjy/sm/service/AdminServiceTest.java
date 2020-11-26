package com.zjy.sm.service;

import com.zjy.sm.factory.ServiceFactory;
import com.zjy.sm.utils.ResultEntity;
import org.junit.Test;

import java.sql.ResultSet;

import static org.junit.Assert.*;

public class AdminServiceTest {
    private final AdminService adminService = ServiceFactory.getAdminServiceInstance();
    @Test
    public void adminLogin(){
        ResultEntity resultEntity =adminService.adminLogin("1814418043.qq.com","200310");
        assertEquals(0,resultEntity.getCode());
        System.out.println(resultEntity);
    }
}