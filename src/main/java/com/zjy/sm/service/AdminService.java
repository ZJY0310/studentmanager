package com.zjy.sm.service;

import com.zjy.sm.utils.ResultEntity;

/**
 * @ClassName AdminServie
 * @Description TODO
 * @Author Z
 * @Date 2020/11/26
 **/

public interface AdminService {
    ResultEntity adminLogin(String account,String password);
}
