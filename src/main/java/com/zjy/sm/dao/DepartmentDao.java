package com.zjy.sm.dao;

import com.zjy.sm.entity.Department;

import java.sql.SQLException;
import java.util.List;

/**
 * @ClassName DepartmentDao
 * @Description TODO
 * @Author Z
 * @Date 2020/11/26
 **/
public interface DepartmentDao {
    List<Department> getAll() throws SQLException;
}
