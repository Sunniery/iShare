package org.starrier.ishare.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.ws.rs.GET;

/**
 * @Author Starrier
 * @Time 2018/5/23.
 */
@Data
@Getter
@Setter
public class UserBean {
    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    private String UserName;
    private String Password;

}
