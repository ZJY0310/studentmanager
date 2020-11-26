package com.zjy.sm.service.impl;

import com.zjy.sm.dao.DepartmentDao;
import com.zjy.sm.entity.Department;
import com.zjy.sm.factory.DaoFactory;
import com.zjy.sm.service.DepartmentService;

import java.sql.SQLException;
import java.util.List;

/**
 * @ClassName DepartmentServiceImpl
 * @Description TODO
 * @Author Z
 * @Date 2020/11/26
 **/

public class DepartmentServiceImpl implements DepartmentService {
    public final DepartmentDao departmentDao= DaoFactory.getDepartmentDaoInstance();
    @Override
    public List<Department> selectAll(){
        List<Department> departmentList=null;
        try {
            departmentList=departmentDao.getAll();
        }catch (SQLException e){
            System.err.print("查询院系信息出现异常");
        }
        return departmentList;
    }
}
