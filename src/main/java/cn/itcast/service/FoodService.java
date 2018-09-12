package cn.itcast.service;

import cn.itcast.model.Food;

import java.util.List;

public interface FoodService {
    void add(Food food);
    List<Food> getAll();
}
