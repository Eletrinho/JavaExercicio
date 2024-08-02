import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate bDay = LocalDate.parse("15/03/1985", fmt);
        Client client = new Client(bDay, "douglinhas@gmail.com", "douglas");
        List<OrderItem> itemList = new ArrayList<>();
        Product p1 = new Product("TV", 1000.0);
        OrderItem o1 = new OrderItem(1, p1.getPrice(), p1);
        Product p2 = new Product("Mouse", 40.0);
        OrderItem o2 = new OrderItem(2, p2.getPrice(), p2);
        itemList.add(o1);
        itemList.add(o2);
        Order order = new Order(client, itemList, OrderStatus.PROCESSING);
        System.out.println(order);
        System.out.println(order.total());
    }
}
