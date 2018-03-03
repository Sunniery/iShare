package org.starrier.ishare.serivice;

import org.starrier.ishare.dao.UserDao;
import org.starrier.ishare.entity.User;

import javax.transaction.Transactional;

/**
 * @Author Starrier
 * @Time 2018/3/3.
 */
@Transactional
public class UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao=userDao;
    }

    public String addUser(User user) {
        return userDao.addUser(user);
    }
}
