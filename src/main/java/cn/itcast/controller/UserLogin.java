package cn.itcast.controller;

import cn.itcast.model.User;
import cn.itcast.service.impl.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @program: order
 * @description:
 * @author: liu yan
 * @create: 2018-09-06 14:39
 */
@Controller
public class UserLogin {
    @Resource
    public UserServiceImpl userService;
    private String uri;
    /**
     * 登录功能
     * @param user      登录用户的密码和账户
     * @param request
     * @param response
     */
    @ResponseBody
    @RequestMapping("login")
    public void login(User user, HttpServletRequest request, HttpServletResponse response)throws Exception{
        response.setCharacterEncoding("utf-8");
        String name = user.getUsername();
        try {
            User loginInfo = userService.login(user);
            if (loginInfo==null){
                uri = "login.jsp";
            }else {
                request.getSession().setAttribute("loginInfo",loginInfo);
                uri = "main.jsp";
            }
        }catch (Exception e){
            e.printStackTrace();
            uri = "error.jsp";
        }

        request.getRequestDispatcher("/views/"+uri).forward(request,response);
    }
}
