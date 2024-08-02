package entities;

import entities.enums.OrderStatus;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private final Instant moment = Instant.now();
    private final Client client;
    private List<OrderItem> items = new ArrayList<>();
    private OrderStatus orderStatus;

    public Order(Client client, List<OrderItem> items, OrderStatus orderStatus) {
        this.client = client;
        this.items = items;
        this.orderStatus = orderStatus;
    }

    public Client getClient() {
        return client;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Instant getMoment() {
        return moment;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public void removeItem(OrderItem item) {
        items.remove(item);
    }

    public Double total() {
        Double total = 0d;
        for (OrderItem i : items) {
            total += i.subTotal();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Order{" +
                "moment=" + moment +
                ", client=" + client +
                ", items=" + items +
                ", orderStatus=" + orderStatus +
                '}';
    }
}
