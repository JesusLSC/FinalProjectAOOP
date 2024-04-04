import Products.Book;

import java.util.List;

public class Order {
    private Customer customer;
    private List<Book> books;
    private double totalPrice;

    public Order(Customer customer, List<Book> books, double totalPrice) {
        this.customer = customer;
        this.books = books;
        this.totalPrice = totalPrice;
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

}

