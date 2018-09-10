package cn.itcast.service;

import cn.itcast.model.FoodType;

import java.util.List;

public interface FoodTypeService {

    /**
     * 添加
     * @param foodType
     */
    public  void save(FoodType foodType);

    /**
     * 更新
     * @param foodType
     */
    void update(FoodType foodType);

    /**
     * 删除
     * @param id
     */
    void delete(int id);

    /**
     * 根据id查找
     * @param id
     * @return
     */
    FoodType findById(int id);

    /**
     * 查询所有
     * @return
     */
    List<FoodType> getAllData();

    /**
     * 根据菜系类型查询
     * @param typeName
     * @return
     */
    List<FoodType>getAll(String typeName);
}
