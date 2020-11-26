package com.zjy.sm.factory;

//import com.zjy.sm.dao.AdminDao;
//import com.zjy.sm.dao.impl.AdminDaoImpl;

import com.zjy.sm.dao.AdminDao;
import com.zjy.sm.dao.DepartmentDao;
import com.zjy.sm.dao.impl.AdminDaoImpl;
import com.zjy.sm.dao.impl.DepartmentDaoImpl;

/**
 * @ClassName DaoFactory
 * @Description TODO
 * @Author Z
 * @Date 2020/11/17
 **/

public class DaoFactory {
    public static AdminDao getAdminDaoInstance(){
        return new AdminDaoImpl();
    }
    public static DepartmentDao getDepartmentDaoInstance(){
        return new DepartmentDaoImpl();
    }
}
