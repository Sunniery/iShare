package org.starrier.ishare.dao.Impl;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.starrier.ishare.dao.UserDao;
import org.starrier.ishare.entity.User;

/**
 * @Author Starrier
 * @Time 2018/3/3.
 */
public class UserDaoImpl extends HibernateDaoSupport implements UserDao {


    @Override
    public String addUser(User user) {
        getHibernateTemplate().save(user);
        return "success";
    }
}
