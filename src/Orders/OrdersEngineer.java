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

    public void createOrder(Customer customer, List<Book> books, List<Magazine> magazines, List<Newspaper> newspapers, double totalPrice, int userId) {
        orderBuilder.buildCustomer(customer);
        orderBuilder.buildBooks(books);
        orderBuilder.buildMagazines(magazines);
        orderBuilder.buildNewspapers(newspapers);
        orderBuilder.buildTotalPrice(totalPrice);
        orderBuilder.buildUserId(userId);

        Order order = orderBuilder.buildOrder();
        processOrder(order);
    }

    private void processOrder(Order order) {
        orderMediator.processOrder(order);
    }
}

