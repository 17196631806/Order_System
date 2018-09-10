package cn.itcast.model;

/**
 * @program: order
 * @description:
 * @author: liu yan
 * @create: 2018-09-10 15:24
 */
public class FoodTable {
    private int id;
    private String foodTable;
    private Integer state;
    private String time;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFoodTable() {
        return foodTable;
    }

    public void setFoodTable(String foodTable) {
        this.foodTable = foodTable;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
