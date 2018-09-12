package cn.itcast.dao;

import cn.itcast.model.FoodType;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FoodTypeDao {

    /**
     * 添加
     * @param foodType
     */
    void save(FoodType foodType);

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
     * @param foodType
     * @return
     */
    List<FoodType>getAll(FoodType foodType);


}
