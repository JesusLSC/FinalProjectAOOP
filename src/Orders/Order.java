package Orders;

import Products.*;
import java.util.List;

public class Order {
    private static int lastOrderId = 0;
    private int orderId;
    private Customer customer;
    private List<? extends Item> items;
    private double totalPrice;
    private int userId;

    public Order(Customer customer, List<? extends Item> items, double totalPrice, int userId) {
        this.orderId = generateOrderId();
        this.customer = customer;
        this.items = items;
        this.totalPrice = totalPrice;
        this.userId = userId;
    }
    private int generateOrderId() {
        return ++lastOrderId;
    }
    public int getId() {
        return orderId;
    }

    public void setId(int orderId) {
        this.orderId = orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<? extends Item> getItems() {
        return items;
    }

    public void setItems(List<? extends Item> items) {
        this.items = items;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public static void displayOrder(Order order) {
        System.out.println("Order ID: " + order.getId());
        System.out.println("Customer: " + order.getCustomer().getName());
        System.out.println("Items:");
        for (Item item : order.getItems()) {
            if (item instanceof Book) {
                Book book = (Book) item;
                System.out.println("Book: " + book.getTitle() + " by " + book.getAuthor());
            } else if (item instanceof Magazine) {
                Magazine magazine = (Magazine) item;
                System.out.println("Magazine: " + magazine.getTitle());
            } else if (item instanceof Newspaper) {
                Newspaper newspaper = (Newspaper) item;
                System.out.println("Newspaper: " + newspaper.getTitle());
            }
        }
        System.out.println("Total Price: $" + order.getTotalPrice());
        System.out.println("User ID: " + order.getUserId());
    }
}

