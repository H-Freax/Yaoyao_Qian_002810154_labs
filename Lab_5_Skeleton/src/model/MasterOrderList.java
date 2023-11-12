package model;

import java.util.ArrayList;

public class MasterOrderList {

    ArrayList<Order> orderList;

    public MasterOrderList(){
        orderList = new ArrayList<Order>();
    }

    public ArrayList<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<Order> orderList) {
        this.orderList = orderList;
    }

    public void addNewOrder(Order order){
        orderList.add(order);
    }
}
