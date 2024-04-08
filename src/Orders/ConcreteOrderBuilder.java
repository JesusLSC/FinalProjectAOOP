package Orders;

import Products.Book;
import Products.Magazine;
import Products.Newspaper;
import java.util.List;

public class ConcreteOrderBuilder implements OrderBuilder {
    private Customer customer;
    private List<Book> books;
    private List<Magazine> magazines;
    private List<Newspaper> newspapers;
    private double totalPrice;
    private int userId;

    @Override
    public void buildCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public void buildBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public void buildMagazines(List<Magazine> magazines) {
        this.magazines = magazines;
    }

    @Override
    public void buildNewspapers(List<Newspaper> newspapers) {
        this.newspapers = newspapers;
    }

    @Override
    public void buildTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public void buildUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public Order buildOrder() {
        return new Order(customer, books, magazines, newspapers, totalPrice, userId);
    }
}
