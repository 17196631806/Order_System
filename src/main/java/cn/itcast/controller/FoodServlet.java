package cn.itcast.controller;

import cn.itcast.model.Food;
import cn.itcast.service.impl.FoodServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @program: order
 * @description:
 * @author: liu yan
 * @create: 2018-09-12 16:28
 */
@Controller
public class FoodServlet {
    @Resource
    private FoodServiceImpl foodService;

    @RequestMapping("food")
    public void food(Food food, HttpServletRequest request, HttpServletResponse response)throws Exception {
        //设置编码
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        String method = request.getParameter("method");
        if ("list".equals(method)){

        }else if ("add".equals(method)){

        }
    }

    private void list(HttpServletRequest request,HttpServletResponse response)throws Exception{

    }
}
