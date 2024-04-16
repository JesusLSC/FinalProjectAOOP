package Products.Factories;

import Orders.*;
import Products.*;
import java.util.List;

public class OrderFactory {
    public static Order createOrder(Customer customer, List<? extends Item> items, double totalPrice, int userId) {
        return new Order(customer, items, totalPrice, userId);
    }
}