package org.example.Modulo12EnumComposicao.ExercicioDeFixacao;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private Date moment;
    private OrderStatus status;
    private List<OrderItem> itemList = new ArrayList<OrderItem>();
    private Client client;

    public Order(){
        this.moment = new Date();
        this.status = OrderStatus.PROCESSING;
    }

    public Order(Client cliente, OrderStatus status){
        this.moment = new Date();
        this.status = status;
        this.client = cliente;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        SimpleDateFormat sdf = new SimpleDateFormat("(dd/MM/yyyy)");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Double totalPrice = 0.00;

        sb.append("Order moment: " + sdf2.format(moment) + "\n");
        sb.append("Order status: " + status + "\n");
        sb.append("Client: " + client.getName() + " " + sdf.format(client.getBirthDate()) + " - " + client.getEmail() + "\n");
        sb.append("Order items: \n");
        for (OrderItem item : itemList) {
            totalPrice += item.getPrice();
            sb.append(item.toString() + "\n");
        }
        sb.append("Total price: " + totalPrice);

        return sb.toString();
    }
}
