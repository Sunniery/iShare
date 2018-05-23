package org.starrier.ishare.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.starrier.ishare.entity.UserBean;

/**
 * @Author Starrier
 * @Time 2018/5/23.
 */
@RestController
public class SampleController {


    @RequestMapping(value = "/hello")
    @ApiOperation(value = "添加用户",httpMethod ="POST", response = UserBean.class,notes = "HelloWorld")
    public UserBean hello(@ApiParam(required = true,name = "paramData",value = "用户信息 json 数据") String paramData){
        UserBean userBean = new UserBean();
        userBean.setUserName("liwei");
        userBean.setPassword("123456");
        return userBean;
    }
}
