package com.zjy.sm.factory;

import com.zjy.sm.service.AdminService;
import com.zjy.sm.service.DepartmentService;
import com.zjy.sm.service.impl.AdminServiceImpl;
import com.zjy.sm.service.impl.DepartmentServiceImpl;

/**
 * @ClassName ServiceFactory
 * @Description TODO
 * @Author Z
 * @Date 2020/11/26
 **/

public class ServiceFactory {
        public static AdminService getAdminServiceInstance(){
            return new AdminServiceImpl();
        }
        public static DepartmentService getDepartmentServiceInstance(){
            return new DepartmentServiceImpl();
        }
}
