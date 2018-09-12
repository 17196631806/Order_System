package cn.itcast.controller;

import cn.itcast.model.FoodType;
import cn.itcast.service.impl.FoodTypeServiceImpl;
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
 * @create: 2018-09-06 17:14
 */
@Controller
public class FoodTypeServlet {

    @Resource
    public FoodTypeServiceImpl foodTypeService;
    private String uri;

    @RequestMapping("foodType")
    public void foodType(FoodType foodType, HttpServletRequest request, HttpServletResponse response)throws Exception{

        //设置编码
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        String method = request.getParameter("method");
        if ("addFoodType".equals(method)) {

            addFoodType(foodType,request,response);

        } else if ("list".equals(method)) {

            list(request,response);

        } else if("viewUpdate".equals(method)) {

            viewUpdateFoodType(foodType,request,response);

        } else if ("update".equals(method)) {

            updateFoodType(foodType,request,response);

        } else if ("delete".equals(method)) {

            delete(foodType,request,response);

        } else if ("search".equals(method)) {

            search(foodType,request,response);

        }
    }

    /**
     * 显示菜系列表数据
     * @param request
     * @param response
     * @throws Exception
     */
    public void list(HttpServletRequest request, HttpServletResponse response)throws Exception{

        List<FoodType> list = foodTypeService.getAllData();
        request.setAttribute("listFoodType", list);
        request.getRequestDispatcher("/views/foodType/foodtype_list.jsp").forward(request,response);
    }

    /**
     * 添加菜系数据
     * @param foodType
     * @param request
     * @param response
     * @throws Exception
     */
    public void addFoodType(FoodType foodType, HttpServletRequest request, HttpServletResponse response)throws Exception{

        foodTypeService.save(foodType);
        request.getRequestDispatcher("/foodType?method=list").forward(request,response);
    }

    /**
     * 更新菜系页面
     * @param foodType
     * @param request
     * @param response
     * @throws Exception
     */
    public void viewUpdateFoodType(FoodType foodType,HttpServletRequest request,HttpServletResponse response)throws Exception{

        FoodType foodType1 =  foodTypeService.findById(foodType.getId());
        request.setAttribute("foodType",foodType1);
        request.getRequestDispatcher("/views/foodType/foodtype_update.jsp").forward(request,response);
    }

    /**
     * 修改菜系数据
     * @param foodType
     * @param request
     * @param response
     * @throws Exception
     */
    public void updateFoodType(FoodType foodType,HttpServletRequest request,HttpServletResponse response)throws Exception{

        foodTypeService.update(foodType);
        request.getRequestDispatcher("/foodType?method=list").forward(request,response);
    }


    /**
     * 删除菜系数据
     * @param foodType
     * @param request
     * @param response
     * @throws Exception
     */
    public void delete(FoodType foodType,HttpServletRequest request,HttpServletResponse response)throws Exception{

        foodTypeService.delete(foodType.getId());
        request.getRequestDispatcher("/foodType?method=list").forward(request,response);

    }

    /**
     * 按照菜系搜索
     * @param foodType
     * @param request
     * @param response
     * @throws Exception
     */
    public void search(FoodType foodType,HttpServletRequest request,HttpServletResponse response) throws Exception{

        List<FoodType> list = foodTypeService.getAll(foodType);
        request.setAttribute("listFoodType", list);
        request.getRequestDispatcher("/views/foodType/foodtype_list.jsp").forward(request,response);

    }


}
