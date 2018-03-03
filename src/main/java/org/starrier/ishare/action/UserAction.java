package org.starrier.ishare.action;

import com.opensymphony.xwork2.ActionSupport;
import org.starrier.ishare.entity.User;
import org.starrier.ishare.serivice.UserService;

/**
 * @Author Starrier
 * @Time 2018/3/3.
 */
public class UserAction extends ActionSupport {

    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService=userService;
    }

    public String add() {
        User user=new User();
        user.setUserName("bob");
        user.setPassword("123456");
        userService.addUser(user);
        return "success";
    }
}
