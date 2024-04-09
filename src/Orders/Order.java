package Orders;

import Products.*;

import java.util.List;

public class Order {
    private static int orderId = 0;
    private Customer customer;
    private List<Book> books;
    private List<Magazine> magazines;
    private List<Newspaper> newspapers;
    private double totalPrice;
    private int userId;

    public Order(Customer customer, List<Book> books, List<Magazine> magazines, List<Newspaper> newspapers, double totalPrice, int userId) {
        orderId++;
        this.customer = customer;
        this.books = books;
        this.magazines = magazines;
        this.newspapers = newspapers;
        this.totalPrice = totalPrice;
        this.userId = userId;
    }

    public int getId() {
        return orderId;
    }

    public void setId(int orderId) {
        this.orderId = orderId;
    }

    public List<Magazine> getMagazines() {
        return magazines;
    }

    public void setMagazines(List<Magazine> magazines) {
        this.magazines = magazines;
    }

    public List<Newspaper> getNewspapers() {
        return newspapers;
    }

    public void setNewspapers(List<Newspaper> newspapers) {
        this.newspapers = newspapers;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
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
}

