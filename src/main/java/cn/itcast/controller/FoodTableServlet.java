package cn.itcast.controller;

import cn.itcast.model.FoodTable;
import cn.itcast.service.FoodTableService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @program: order
 * @description:
 * @author: liu yan
 * @create: 2018-09-11 16:09
 */
@Controller
public class FoodTableServlet {

    @Resource
    private FoodTableService foodTableService;

    @RequestMapping("foodTable")
    public void foodTable(FoodTable foodTable, HttpServletRequest request, HttpServletResponse response) throws  Exception{
        //设置编码
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        String method = request.getParameter("method");
        if ("list".equals(method)){
            list(request,response);
        } else if ("add".equals(method)){
            add(foodTable,request,response);
        } else if ("up1".equals(method)) {
            update(request,response);
        } else if ("delete".equals(method)) {
            delete(request,response);
        } else if ("search".equals(method)) {
            search(foodTable,request,response);
        }
    }

    /**
     * 餐桌信息列表显示
     * @param request
     * @param response
     * @throws Exception
     */
    private void list(HttpServletRequest request,HttpServletResponse response) throws Exception{
        List<FoodTable> list = foodTableService.queryAll();
        request.setAttribute("listFoodTable", list);
        request.getRequestDispatcher("/views/foodTable/boardList.jsp").forward(request,response);

    }

    /**
     * 添加餐桌信息
     * @param foodTable
     * @param request
     * @param response
     * @throws Exception
     */
    private void add(FoodTable foodTable, HttpServletRequest request,HttpServletResponse response)throws Exception{
        foodTableService.add(foodTable);
        list(request,response);
    }

    /**
     * 跟新餐桌状态
     * @param request
     * @param response
     * @throws Exception
     */
    private void update(HttpServletRequest request,HttpServletResponse response)throws Exception {
        String id = request.getParameter("id");
        foodTableService.changeState(Integer.parseInt(id));
        list(request,response);
    }

    /**
     * 删除餐桌信息
     * @param request
     * @param response
     * @throws Exception
     */
    private void delete(HttpServletRequest request,HttpServletResponse response)throws Exception {
        String id = request.getParameter("id");
        foodTableService.delete(Integer.parseInt(id));
        list(request,response);
    }


    /**
     * 按照餐桌名进行搜索
     * @param foodTable
     * @param request
     * @param response
     * @throws Exception
     */
    private void search(FoodTable foodTable, HttpServletRequest request,HttpServletResponse response)throws Exception {
        List<FoodTable> list = foodTableService.query(foodTable);
        request.setAttribute("listFoodTable", list);
        request.getRequestDispatcher("/views/foodTable/boardList.jsp").forward(request,response);
    }
}
