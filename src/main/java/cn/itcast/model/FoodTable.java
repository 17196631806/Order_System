package cn.itcast.model;

import java.util.Date;

/**
 * @program: order
 * @description:
 * @author: liu yan
 * @create: 2018-09-10 15:24
 */
public class FoodTable {
    private int id;
    private String tableName;
    private int tableStatus;
    private String orderDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public int getTableStatus() {
        return tableStatus;
    }

    public void setTableStatus(int tableStatus) {
        this.tableStatus = tableStatus;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }
}
