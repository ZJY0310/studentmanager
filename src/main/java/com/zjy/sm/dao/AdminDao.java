package com.zjy.sm.dao;

import com.zjy.sm.entity.Admin;

import java.sql.SQLException;

/**
 * @ClassName AdminDao
 * @Description TODO
 * @Author Z
 * @Date 2020/11/17
 **/
public interface AdminDao {

    Admin findAdminByAccount(String account) throws SQLException;
}
