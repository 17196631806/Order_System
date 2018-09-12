package cn.itcast.dao;

import cn.itcast.model.Food;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FoodDao {
    /**
     * 添加食物信息
     * @param food
     */
    void add(Food food);

    /**
     * 获取所有食物信息
     * @return
     */
    List<Food> getAll();
}
