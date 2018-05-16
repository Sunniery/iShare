package org.starrier.ishare.dao;

import org.apache.ibatis.annotations.Param;
import org.starrier.ishare.entity.User;

/**
 * Created by lenovo on 2018/5/11.
 */
public interface IUserDao {
    /**
     * 查找用户名和密码
     * @param username 登录用户名
     * @return
     */
    User findByUsername(String username);
    /**
     * 注册用户和密码
     */
    void registerByUsernameAndPassword(@Param("username")String username, @Param("password")String password);


}
