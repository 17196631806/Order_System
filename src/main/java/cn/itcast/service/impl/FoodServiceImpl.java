package cn.itcast.service.impl;

import cn.itcast.dao.FoodDao;
import cn.itcast.model.Food;
import cn.itcast.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: order
 * @description:
 * @author: liu yan
 * @create: 2018-09-12 16:19
 */
@Service()
public class FoodServiceImpl implements FoodService {
    @Autowired
    private FoodDao foodDao;

    @Override
    public void add(Food food) {
        foodDao.add(food);
    }

    @Override
    public List<Food> getAll(){
       return foodDao.getAll();
    }
}
