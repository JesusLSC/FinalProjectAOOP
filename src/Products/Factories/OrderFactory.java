package Products.Factories;

import Orders.*;
import Products.*;
import java.util.List;

public class OrderFactory {
    public static Order createOrder(Customer customer, List<Book> books, List<Magazine> magazines, List<Newspaper> newspapers, double totalPrice, int userId) {
        return new Order(customer, books, magazines, newspapers, totalPrice, userId);
    }
}

