package Orders;

import Products.Book;
import Products.Magazine;
import Products.Newspaper;
import java.util.List;

public interface OrderBuilder {
    void buildCustomer(Customer customer);
    void buildBooks(List<Book> books);
    void buildMagazines(List<Magazine> magazines);
    void buildNewspapers(List<Newspaper> newspapers);
    void buildTotalPrice(double totalPrice);
    void buildUserId(int userId);
    Order buildOrder();
}

