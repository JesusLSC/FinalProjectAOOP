package Orders;

import Products.*;
import java.util.List;

public class OrdersEngineer {
    private OrderBuilder orderBuilder;
    private OrderMediator orderMediator;

    public OrdersEngineer(OrderBuilder orderBuilder, OrderMediator orderMediator) {
        this.orderBuilder = orderBuilder;
        this.orderMediator = orderMediator;
    }

    public Order createOrder(Customer customer, List<Book> books, List<Magazine> magazines, List<Newspaper> newspapers, double totalPrice) {
        orderBuilder.buildCustomer(customer);
        orderBuilder.buildBooks(books);
        orderBuilder.buildMagazines(magazines);
        orderBuilder.buildNewspapers(newspapers);
        orderBuilder.buildTotalPrice(totalPrice);
        Order order = orderBuilder.buildOrder();
        processOrder(order);
        return order;
    }

    public void processOrder(Order order) {
        orderMediator.processOrder(order);
    }
}

