package cn.itcast.service;

import cn.itcast.model.FoodTable;

import java.util.List;

public interface FoodTableService {
    /**
     * 添加餐桌信息
     * @param foodTable
     */
    void add(FoodTable foodTable);

    /**
     * 删除餐桌信息
     * @param id
     */
    void delete(Integer id);

    /**
     * 更新餐桌信息
     * @param foodTable
     */
    void update(FoodTable foodTable);

    /**
     * 查询所有餐桌信息
     * @return
     */
    List<FoodTable> queryAll();

    /**
     * 根据id获得餐桌信息
     * @param id
     * @return
     */
    FoodTable findById(int id);

    /**
     * 根据桌名查询餐桌信息
     * @param foodTable
     * @return
     */
    List<FoodTable> query(FoodTable foodTable);

    /**
     * 改变餐桌的状态
     * @param id
     * @return
     */
    void changeState(Integer id);
}
