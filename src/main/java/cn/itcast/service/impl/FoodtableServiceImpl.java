package cn.itcast.service.impl;

import cn.itcast.dao.FoodTableDao;
import cn.itcast.model.FoodTable;
import cn.itcast.service.FoodTableService;
import com.sun.javafx.tools.packager.PackagerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @program: order
 * @description:
 * @author: liu yan
 * @create: 2018-09-11 15:30
 */
@Service()
public class FoodtableServiceImpl implements FoodTableService {

    @Autowired
    private FoodTableDao foodTableDao;

    /**
     * 添加餐桌信息
     * @param foodTable
     */
    @Override
    public void add(FoodTable foodTable){

        foodTableDao.add(foodTable);
    }

    /**
     * 删除餐桌信息
     * @param id
     */
    @Override
    public void delete(Integer id) {

        foodTableDao.delete(id);
    }

    /**
     * 更新餐桌信息
     * @param foodTable
     */
    @Override
    public void update(FoodTable foodTable){

        foodTableDao.update(foodTable);
    }

    /**
     * 查询所有餐桌信息
     * @return
     */
    @Override
    public List<FoodTable> queryAll() {

        return foodTableDao.queryAll();
    }

    /**
     * 根据id获得餐桌信息
     * @param id
     * @return
     */
    @Override
    public FoodTable findById(int id){
        return foodTableDao.findById(id);
    }

    /**
     * 根据桌名查询餐桌信息
     * @param foodTable
     * @return
     */
    @Override
    public List<FoodTable> query(FoodTable foodTable) {

        return foodTableDao.query(foodTable);
    }

    @Override
    public void changeState(Integer id) {
        FoodTable table = foodTableDao.findById(id);
        int status = table.getTableStatus();
        if (status == 0){
            status = 1;
            Date date = new Date();
            //将时间转换为时间戳
            long ts = date.getTime();
            String res = String.valueOf(ts);
            table.setOrderDate(res);
        }else if(status==1){
            status = 0;
            table.setOrderDate(null);
        }
        table.setTableStatus(status);
        foodTableDao.update(table);
    }
}
