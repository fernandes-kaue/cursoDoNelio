package org.example.Modulo12EnumComposicao.ExercicioDeFixacao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private Date moment;
    private OrderStatus status;
    private List<OrderItem> itemList = new ArrayList<OrderItem>();

    public Order(){
        this.moment = new Date();
        this.status = OrderStatus.PROCESSING;
    }

    public Order(OrderStatus status){
        this.moment = new Date();
        this.status = status;
    }

    public void addItem(OrderItem item) {
        itemList.add(item);
    }

    public void removeItem(OrderItem item) {
        itemList.remove(item);
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }
}
