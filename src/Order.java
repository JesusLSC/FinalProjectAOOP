import Products.*;

import java.util.List;

public class Order {
    private int id;
    private Customer customer;
    private List<Book> books;
    private List<Magazine> magazines;
    private List<Newspaper> newspapers;
    private double totalPrice;

    public Order(Customer customer, List<Book> books, double totalPrice) {
        this.customer = customer;
        this.books = books;
        this.totalPrice = totalPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

}

