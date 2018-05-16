package org.starrier.ishare.service;

import org.starrier.ishare.entity.User;

/**
 * Created by lenovo on 2018/5/11.
 */
public interface UserService {
    //检验用户登录
    User checkLogin(String username,String password);
    void Register(User user);
    String isExist(String username);

}
