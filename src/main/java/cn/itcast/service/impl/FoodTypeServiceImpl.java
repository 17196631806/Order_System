package cn.itcast.service.impl;

import cn.itcast.dao.FoodTypeDao;
import cn.itcast.model.FoodType;
import cn.itcast.service.FoodTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: order
 * @description:
 * @author: liu yan
 * @create: 2018-09-06 16:29
 */
@Service()
public class FoodTypeServiceImpl implements FoodTypeService {

    @Autowired
    private FoodTypeDao foodTypeDao;

    @Override
    public void save(FoodType foodType){
        foodTypeDao.save(foodType);
    }

    @Override
    public void update(FoodType foodType){
        foodTypeDao.update(foodType);
    }

    @Override
    public void delete(int id){
        foodTypeDao.delete(id);
    }

    @Override
    public FoodType findById(int id){
        return foodTypeDao.findById(id);
    }

    @Override
    public List<FoodType> getAllData(){
        return foodTypeDao.getAllData();
    }

    @Override
    public List<FoodType> getAll(String typeName){
        return foodTypeDao.getAll(typeName);
    }

}
