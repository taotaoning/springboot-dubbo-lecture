package com.nt.demo.provider.dao;

import com.nt.demo.middle.entity.User;
import com.nt.demo.provider.utils.MyMapper;

/**
 * Create by TaoTaoNing
 * 2019/7/25
 **/
//@DS("db1")
public interface UserMapper extends MyMapper<User> {
    User getUserDetail(Integer userId);
}
