package org.starrier.ishare.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.starrier.ishare.entity.User;
import org.starrier.ishare.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by lenovo on 2018/5/12.
 */
@Controller
@RequestMapping("/user")
@SessionAttributes("user")
public class UserController {

    @Autowired
    private UserService userService;

    //正常访问login页面
    @RequestMapping("/login_")
    public String login(){
        return "user/login_";
    }

    @RequestMapping("/home")
    public String home(){
        return "user/home";
    }
    //表单提交过来的路径
    @RequestMapping("/checkLogin")
    public String checkLogin(Model model,HttpServletRequest req, HttpServletResponse resp) throws ServletException,IOException{
        String userName=req.getParameter("uname");
        String password=req.getParameter("upwd");

        //如果输入的参数为空，操作终止
        if("".equals(userName)||"".equals(password)){
            req.setAttribute("msg","用户名和密码均不能为空！");
            req.getRequestDispatcher("login").forward(req,resp);
            return "user/login_";
        }

         User user=userService.checkLogin(userName,password);

        if (user!=null){
            model.addAttribute("user",user);
            req.setAttribute("msg","登录成功！");
            return "user/home";
        }else {
            req.setAttribute("msg","密码错误或用户名不存在！");
            return "user/result";
        }

    }

    //测试超链接跳转到另一个页面是否可以取到session值
    @RequestMapping("/anotherpage")
    public String hrefpage(){

        return "anotherpage";
    }

    //注销方法
    @RequestMapping("/outLogin")
    public String outLogin(HttpSession session){
        //通过session.invalidata()方法来注销当前的session
        session.invalidate();
        return "user/login";
    }

    @RequestMapping("/register_")
    public String register(){
        return "user/register_";
    }

    @RequestMapping("/doRegister")
    public String doRegister(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        String userName=req.getParameter("uname");
        String password=req.getParameter("upwd");
        String rePassword=req.getParameter("reupwd");

        //如果输入的参数为空，操作终止
        if("".equals(userName)||"".equals(password)||"".equals(rePassword)){
            req.setAttribute("msg","用户名和密码均不能为空！");
            return "user/register_";
        }

        //输入密码与重复密码不一致的时候
        if(!password.equals(rePassword)){
            req.setAttribute("msg","设置的密码与重复密码必须一致！");
            return "user/register_";
        }

        //用户名不符合tel或email的格式要求
        String em = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
        String ph = "^[1][34578]\\d{9}$";
        if (!userName.matches(em)&&!userName.matches(ph)){
            req.setAttribute("msg","该用户名格式错误！");
            return "user/register_";
        }

        //如果用户名已经注册
        if (userName.equals(userService.isExist(userName))){
            req.setAttribute("msg","该用户名已经注册！");
            return "user/register_";
        }

        User user=new User();
        user.setUserName(userName);
        user.setPassword(password);
        userService.Register(user);
        return "redirect:login_";
    }

}
